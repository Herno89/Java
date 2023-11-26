/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author u543699
 */
public class JPA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Autor autor = new Autor(1L, "Luis", true);
        //Autor autor2 = new Autor(2L, "jose", true);
        //autor2.setNombre("Pepe");
        
        ControladoraPersistencia control = new ControladoraPersistencia();
        
        Autor aut = control.buscarAutor(1L);
        System.out.println(" * "+ aut.toString());
        
//        Editorial edit = new Editorial(1L, "AZ", true);
//        control.crearEditorial(edit);


        System.out.println(" * "+control.buscarEditorial(1L));
        Editorial edit = control.buscarEditorial(1L);
        /*Libro libro1 = new Libro(1, "El senior de las moscas", 1990, 1, 0, 1, true, aut, edit);
        Libro libro2 = new Libro(2, "El senior de los anillos", 1991, 1, 0, 1, true, aut, edit);
        
        control.crearLibro(libro1);
        control.crearLibro(libro2);*/
        //control.eliminarLibro(libro1.getIsbn());
        //control.modificarLibro(libro1);
        
        List<Libro> libros = control.traerLibros();
        for (Libro aux : libros) {
            System.out.println(" * " + aux.toString());
        }
        Libro lib1 = control.buscarLibro(1);
        System.out.println("--------------------------------");
        System.out.println(lib1);
        
        //traer todos
        /*List<Autor> listaAutor = control.traerAutores();
        for (Autor aut : listaAutor) {
            System.out.println(" * "+aut.toString());
        }*/
        

        //control.crearAutor(autor2);
        //control.eliminarAlumno(2L);
        //control.modificarAlumno(autor2);
        
    }
    
}
