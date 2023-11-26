/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import coleccionese4.Peliculas;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author u543699
 */
public class PeliculasServicio {
    Scanner leer = new Scanner(System.in);
    
    public Peliculas crearPelicula(){
        Peliculas p = new Peliculas();
        //ArrayList<Peliculas> pelis = new ArrayList();
        
        System.out.println("Ingrese el titulo de la pelicula: ");
        String t = leer.next();
        p.setTitulo(t);
        System.out.println("Ingrese director de la pelicula: ");
        String d = leer.next();
        p.setDirector(d);
        System.out.println("Ingrese duracion de la peli (en horas): ");
        Integer du = leer.nextInt();
        p.setDuracion(du);
        //pelis.add(p);
    
    
        return p;
    }
    public void cargadepelis(ArrayList<Peliculas>pelis){
        boolean car = true;
        while (car) {            
            pelis.add(crearPelicula());
            System.out.println("Desea agregar otra pelicula? S/N: ");
            if( leer.next().toUpperCase().equals("N") ){
                car= false;
            }
        }
    }
    /**
     * muestra todas las peliculas
     * @param pelis 
     */
    public void mostrarPelisList(ArrayList<Peliculas>pelis){
        System.out.println("-------------------------------------------");
        pelis.forEach((aux) -> {
            System.out.println("Titulo: "+ aux.getTitulo() + "| Duracion: "+ aux.getDuracion());
        });
        
    }
    /**
     * igual que el anterior pero con un if para la duracion
     * @param pelis 
     */
     public void mostrarPelisListDuracion(ArrayList<Peliculas>pelis){
        System.out.println("-------------------------------------------");
        pelis.forEach((aux) -> {
            if (aux.getDuracion()>1) {
                
            System.out.println("Titulo: "+ aux.getTitulo() + "| Duracion: "+ aux.getDuracion());
            }
        });
        
    }
     /**
      * no funciona este metodo 
      * @param pelis 
      */
    public void mostrarPelisMasUnaHora(ArrayList<Peliculas>pelis){
        System.out.println("-------------------------------------------");
        for (Peliculas aux : pelis) {
            if (aux.getDuracion()>1) {
                System.out.println("Titulo: " + aux.getTitulo()+ " Duracion: ");
            }
        }
    }
    public void reordenarPeliculasDur(ArrayList<Peliculas>pelis){
        pelis.sort(Peliculas.compararDuracion);
    }
    public void reordenarPeliculasTit(ArrayList<Peliculas>pelis){
        pelis.sort(Peliculas.compararTitulo);
    
    }
    public void reordenarPeliculasDir(ArrayList<Peliculas>pelis){
        pelis.sort(Peliculas.compararDirector);
    }

}
