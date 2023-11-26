/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.Noticia.Servicios;

import com.egg.Noticia.Entidades.Noticia;
import com.egg.Noticia.Repositorio.NoticiaRepositorio;
import com.egg.Noticia.excepciones.MiException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author u543699
 */
@Service
public class NoticiaServicio {
    @Autowired
    NoticiaRepositorio noticiaRepositorio;
    
    @Transactional
    public void crearNoticia(String id, String titulo, String cuerpo)throws MiException{
        
        validar(titulo, cuerpo);

        Noticia noticia = new Noticia();
        
        noticia.setTitulo(titulo);
        noticia.setCuerpo(cuerpo);
        noticia.setFechaNoti(new Date());
        
        noticiaRepositorio.save(noticia);
    }
    public List<Noticia> listarNoticias(){
    
        List<Noticia> noticias = new ArrayList();
        noticias = noticiaRepositorio.findAll();
        return noticias;
    }
    
    public List<Noticia> listarNoticiasPorFecha(){
        
        List<Noticia> noticias = new ArrayList();
        noticias = noticiaRepositorio.findAll();
        
        Collections.sort(noticias, Comparadores.OrdenarPorFechaDesc);
        return noticias;
    }
    
    
    
    public void modificarNoticia(String id, String titulo, String cuerpo) throws MiException{
        validar(titulo, cuerpo);
        Optional<Noticia> respuesta = noticiaRepositorio.findById(id);
        
        if (respuesta.isPresent()) {
            Noticia noticia = respuesta.get();
            noticia.setTitulo(titulo);
            noticia.setCuerpo(cuerpo);
            
            noticiaRepositorio.save(noticia);
        }
        
    }
    public Noticia getOne(String id){
        return noticiaRepositorio.getOne(id);
    }
    public void validar(String titulo, String cuerpo)throws MiException {
        if (titulo.isEmpty() || titulo == null) {
            throw new MiException("El titulo no puede estar vacio o ser nulo");
        }
        if (cuerpo.isEmpty() || cuerpo == null) {
            throw new MiException("El cuerpo no puede estar vacio o ser nulo");
        }
    }
}
