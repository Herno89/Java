/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.Noticia.Controladores;

import com.egg.Noticia.Entidades.Noticia;
import com.egg.Noticia.Servicios.NoticiaServicio;
import com.egg.Noticia.excepciones.MiException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author u543699
 */
    @Controller
    @RequestMapping("/noticia") //localhost:8080/noticia
public class NoticiaControlador {
        
        @Autowired
        private NoticiaServicio noticiaServicio;
        
        @GetMapping("/registrar")//localhost:8080/noticia/registrar
        public String registrar(){
            return "noticia_form2.html";
        }
        
        @PostMapping("/registro")
        public String registro(@RequestParam(required=false) String id,@RequestParam String titulo, 
                @RequestParam String cuerpo, ModelMap modelo){
            try {
                noticiaServicio.crearNoticia(id, titulo, cuerpo);
                modelo.put("exito", "La noticia fue cargada exitosamente");
            } catch (MiException ex) {
                //Logger.getLogger(NoticiaControlador.class.getName()).log(Level.SEVERE, null, ex);
                modelo.put("error", ex.getMessage());
                return "noticia_form2.html";
            }
            //System.out.println("Nombre de la noticia "+titulo);
            return "index.html";
        }
        @GetMapping("/listar")
        public String listar(ModelMap modelo){
            List<Noticia> noticias = noticiaServicio.listarNoticias();
            
            modelo.addAttribute("noticias", noticias);
            
            return "noticia_lista.html";
        }
        @GetMapping("/index")
        public String index(ModelMap modelo){
            List<Noticia> noticias = noticiaServicio.listarNoticiasPorFecha();
            
            modelo.addAttribute("noticias", noticias);
            return "index.html";
        }
        
        
        @GetMapping("/modificar/{id}")
        public String modificar(@PathVariable String id, ModelMap modelo){
            modelo.put("noticia", noticiaServicio.getOne(id));
            return "noticia_modificar.html";
        }
        @PostMapping("/modificar/{id}")
        public String modificar(@PathVariable String id,String titulo, String cuerpo, ModelMap modelo){
            try {
                noticiaServicio.modificarNoticia(id, titulo, cuerpo);
                return "redirect:../listar";
            } catch (MiException ex) {
                modelo.put("error", ex.getMessage());
                return "noticia_modificar.html";
            }
        }
    }