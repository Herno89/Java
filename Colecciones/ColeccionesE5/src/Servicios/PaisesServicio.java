/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import coleccionese5.Paises;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author u543699
 */
public class PaisesServicio {
    Scanner leer = new Scanner(System.in);
    public Paises crearPais(){
        Paises p = new Paises();
        System.out.println("Ingrese el nombre del pais: ");
        p.setPais(leer.next());
        
        return p;
    }
    public void cargaPaises(TreeSet<Paises> paises){
         boolean car = true;
        while (car) {            
            paises.add(crearPais());
            //pelis.add(crearPelicula());
            System.out.println("Desea agregar otra pelicula? N para salir: ");
            if( leer.next().toUpperCase().equals("N") ){
                car= false;
            }
        }
    }
    public void cargaPaises2(TreeSet<Paises>paises){
        
        paises.add(new Paises ("zzz"));
        paises.add(new Paises ("argentina"));
        paises.add(new Paises ("argentina"));
        paises.add(new Paises ("argentina"));
        paises.add(new Paises ("brasil"));
        paises.add(new Paises ("uruguay"));
        paises.add(new Paises ("uruguay"));
        paises.add(new Paises ("uruguay"));
        paises.add(new Paises ("suisa"));
    }
    
    public void mostrarPaises(TreeSet<Paises> paises){
        for (Paises aux : paises) {
            System.out.println(aux.getPais());
        }
        
    }
    public void buscarPaisYEliminar(String bus, TreeSet<Paises> paises){
        Iterator<Paises> it = paises.iterator();
        boolean var = false;
        while (it.hasNext()) {
            Paises aux = it.next();
            
            if (aux.getPais().equals(bus))
                it.remove();
                var = true;
            
        }
        if (var) {
            System.out.println("No se encontro el pais");
            System.out.println("----------------------------");
        }
    }
   
}
