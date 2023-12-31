package com.inmueble.InmobiliariaSp.controladores;

import com.inmueble.InmobiliariaSp.config.JwtTokenProvider;
import com.inmueble.InmobiliariaSp.contenedores.JwtResponse;
import com.inmueble.InmobiliariaSp.contenedores.UserForm;
import com.inmueble.InmobiliariaSp.entidad.User;
import com.inmueble.InmobiliariaSp.excepciones.MiException;
import com.inmueble.InmobiliariaSp.repositorios.UserRepositorio;
import com.inmueble.InmobiliariaSp.servicios.UserServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user/")
@CrossOrigin(origins = "http://localhost:5173")
public class UserControlador {

    @Autowired
    private UserRepositorio userRepositorio;
    @Autowired
    private UserServicio userServicio;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtTokenProvider jwtTokenProvider;
    
    //Read Users
    @GetMapping("/usuarios")
    @PreAuthorize("hasRole('ADMIN')")
    public List<User> listarUsuarios() {
        return userRepositorio.findAll();
    }

    //Create Users
    @PostMapping("/registro")
    public ResponseEntity<?> crearUsuario(@RequestBody UserForm userForm) throws MiException {
        try {
            User newUser = userServicio.crearUsuarioDesdeUserForm(userForm);
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(userForm.getEmail(), userForm.getPassword())
            );
            SecurityContextHolder.getContext().setAuthentication(authentication);
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            String token = jwtTokenProvider.generateToken(authentication);
            return ResponseEntity.ok(new JwtResponse(token));
        } catch (MiException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    //Get User By Id
    @GetMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN') or hasRole('ENTE') or hasRole('CLIENT')")
    public ResponseEntity<UserForm> getById(@PathVariable String id) {
        User usuario = userRepositorio.getReferenceById(id);
        UserForm userForm = new UserForm();
        userForm.setId(usuario.getId());
        userForm.setNombre(usuario.getNombre());
        userForm.setApellido(usuario.getApellido());
        userForm.setEmail(usuario.getEmail());
        userForm.setDni(usuario.getDni());

        return ResponseEntity.ok(userForm);
    }

    //Delete Users
    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> deleteUser(@PathVariable String id) {
        try {
            userRepositorio.deleteById(id);
            return new ResponseEntity<>("Producto eliminado exitosamente", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al eliminar el producto", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
