/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Entidades.Autor;
import Entidades.Editorial;
import Entidades.Libro;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author u543699
 */
public class ControladoraPersistencia {
    AutorJpaController autJPA = new AutorJpaController();
    EditorialJpaController editJPA = new EditorialJpaController();
    LibroJpaController libJPA = new LibroJpaController();
    public void crearAutor(Autor a){
        try {
            autJPA.create(a);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void eliminarAlumno(Long idAutor) {
        try {
            autJPA.destroy(idAutor);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    public void modificarAlumno(Autor autor2) {
        try {
            autJPA.edit(autor2);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public List<Autor> traerAutores() {
           List<Autor> listaAutor = autJPA.findAutorEntities();
           return listaAutor;
           
    }

    public Autor buscarAutor(Long id) {
        Autor aut = autJPA.findAutor(id);
        return aut;
    }
    
    public void crearEditorial(Editorial edit){
        try {
            editJPA.create(edit);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void eliminarEditorial(Long id){
        try {
            editJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void modificarEditorial(Editorial edit) throws Exception{
        editJPA.edit(edit);
        
    }
    public List<Editorial> traerEditoriales() {
        List<Editorial> listaEdit = editJPA.findEditorialEntities();
        return listaEdit;
    }
    public Editorial buscarEditorial(Long id){
        Editorial edit = editJPA.findEditorial(id);
        return edit;
                
    }

    public void crearLibro(Libro libro1) {
        try {
            libJPA.create(libro1);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void eliminarLibro(long isbn) {
        try {
            libJPA.destroy(isbn);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void modificarLibro(Libro lib) {
        try {
            libJPA.edit(lib);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Libro> traerLibros() {
        List<Libro> lib = libJPA.findLibroEntities();
        return lib;
    }

    public Libro buscarLibro(long isbn) {
        Libro lib = libJPA.findLibro(isbn);
        return lib;
        
    }
    
}
