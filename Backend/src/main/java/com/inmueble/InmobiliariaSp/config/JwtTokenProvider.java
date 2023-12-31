package com.inmueble.InmobiliariaSp.config;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import java.security.Key;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.util.StringUtils;

@Service
public class JwtTokenProvider {

    @Autowired
    private UserDetailsService userDetailsService;

    @Value("${jwt.secret}") // Cargar esta propiedad desde tu archivo de configuración
    private String jwtSecret;

    @Value("${jwt.expiration}") // Cargar esta propiedad desde tu archivo de configuración
    private int jwtExpiration;

    public String generateToken(Authentication authentication) {
        UserDetailsImpl userPrincipal = (UserDetailsImpl) authentication.getPrincipal();

        List<String> roles = userPrincipal.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toList());

        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + jwtExpiration);

        Key key = Keys.hmacShaKeyFor(jwtSecret.getBytes());

        return Jwts.builder()
                .setSubject(userPrincipal.getId()) // Usa getUserId() en lugar de getId()
                .claim("roles", roles) // Agregar los roles como una claim personalizada
                .setIssuedAt(new Date())
                .setExpiration(expiryDate)
                .signWith(key)
                .compact();
    }

    public String getUserIdFromJWT(String token) {
        Key key = Keys.hmacShaKeyFor(jwtSecret.getBytes());

        Claims claims = Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody();

        return claims.getSubject();
    }

    public boolean validateToken(String token) {
        Key key = Keys.hmacShaKeyFor(jwtSecret.getBytes());

        try {
            Jwts.parserBuilder()
                    .setSigningKey(key)
                    .build()
                    .parseClaimsJws(token);
            return true;
        } catch (MalformedJwtException ex) {
            // Token malformado
            return false;
        } catch (ExpiredJwtException ex) {
            // Token expirado
            return false;
        } catch (UnsupportedJwtException ex) {
            // Token no soportado
            return false;
        } catch (JwtException ex) {
            // Otras excepciones relacionadas con JWT
            return false;
        }
    }

    public String resolveToken(HttpServletRequest request) {
        String bearerToken = request.getHeader("Authorization");
        if (StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer ")) {
            return bearerToken.substring(7);
        }
        return null;
    }

    public Authentication getAuthentication(String token) {
        String userId = getUserIdFromJWT(token);
        UserDetails userDetails = userDetailsService.loadUserByUsername(userId); // Cambio a loadUserByUsername

        List<SimpleGrantedAuthority> authorities = userDetails.getAuthorities().stream()
                .map(authority -> new SimpleGrantedAuthority(authority.getAuthority()))
                .collect(Collectors.toList());

        return new UsernamePasswordAuthenticationToken(userDetails, "", authorities);
    }

    public List<String> getRolesFromJWT(String token) {
        Key key = Keys.hmacShaKeyFor(jwtSecret.getBytes());

        Claims claims = Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody();

        @SuppressWarnings("unchecked")
        List<String> roles = (List<String>) claims.get("roles"); // Obtener la lista de roles
        System.out.println("Roles from JWT: " + roles); // Agrega este registro de depuración
        return roles;
    }

}
