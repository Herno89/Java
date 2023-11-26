/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import coleciones.Mascotas;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author u543699
 */
public class ColeccionesServicio {
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private ArrayList<Mascotas> mascota;

    public ColeccionesServicio() {
        this.mascota = new ArrayList();
    }
    

 
    
    public Mascotas crearMascota(){
        System.out.println("Ingrese nombre");
        String nombre = leer.next();
        System.out.println("Ingrese el tipo de animal");
        String tipo = leer.next();
        
        String var = nombre + " " + tipo;
        
        Mascotas m = new Mascotas(nombre, tipo);
        // mascota.add(m);// añade la mascota creada al ArrayList ¡no se usa aca!
        //este metodo es solo para crear mascotas, no para añadir al ArrayList
                
        return m;
        
        //mascota.add(var);
        //nombreArrayList.add(var);
    }
    /** agrega una mascota en el ArrayList
     * 
     * @param m
     */
    
    public void agregarMascota(Mascotas m){
        mascota.add(m);
    }
    
    public void mostrarMascota(){
        System.out.println("---------------------------------");
        for (Mascotas aux : mascota) {
            System.out.println(aux.toString());
        }
        System.out.println("---------------------------------");
    }
    /**
     * Crea mascotas con un valñor predefinido. Mascotas("Misha", "Gato")
     * @param cantidad 
     */
    public void fabricaDeMascotasiguales(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            Mascotas m = new Mascotas("Misha", "Gato");
            
            mascota.add(m);
            
        }
    }
    public void fabricaDeMascotas(int cantidad){
        for (int i = 0; i < cantidad; i++) {
                        
            Mascotas MascotaCreada = crearMascota();
            agregarMascota(MascotaCreada);// llama al metodo que agrega la mascota al ArrayList
            
           // System.out.println(MascotaCreada.toString());
        }
    }
    /**
     * Actualiza la mascota generando una nueva mascota m reemplazando todo
     * @param indice 
     */
    public void actualizarMascota(int indice){
        if (indice <= mascota.size()-1) {
            Mascotas m = crearMascota();
            mascota.set(indice, m);
        } else {
            System.out.println("Fallo al actualizar");
        }
        
    }
    public void actualizarMascota2(int indice){
        Mascotas m = mascota.get(indice);
        m.setNombre("Gatoloco");
        //m.setNombre(leer.next());
        
    }
    public void eliminarMascota(int indice){
        //Mascotas m = mascota.get(indice);
        if (indice <= mascota.size()-1) {
            mascota.remove(indice);
        } else {
            System.out.println("Fallo al Eliminar");
        }
        
        
    }
    public void eliminarMascotaPorNombre(String nombre){
        for (int i = 0; i <mascota.size() ; i++) {
            Mascotas m = mascota.get(i);
            if (m.getNombre().equals(nombre)) {
                mascota.remove(m);
            }
        }
        
    }
    public void actualizarPorNombre(String nombre, String nombreB){
        for (int i = 0; i < mascota.size(); i++) {
            Mascotas m = mascota.get(i);
            if (m.getNombre().equals(nombre)) {
                m.setNombre(nombreB);
                
            }
        }
    }
    
    
    
    /**
     * Crea un Arraylist y agrega 3 elementos
     */
    
    
    
    
    
    
    public void crearArrayList(){
        ArrayList<String> nombres = new ArrayList();
        nombres.add("Misha");
        nombres.add("Nono");
        nombres.add("Phillips");
        foreachh(nombres);
        recorrerArrayList(nombres);
        System.out.println("-------------------------");
        foreachh(nombres);
        
    }
    /**
     * Recorre el Arraylist compara con equals y elimina el elemento "n" del
     * ArrayList
     * @param nombres 
     */
    public void recorrerArrayList(ArrayList<String> nombres){
           
        for (int i = 0; i < nombres.size(); i++) {
            String n = nombres.get(i);
            if (n.equals("Nono")) {
                nombres.remove(n);
                
                
            }
        }
        
    }
    /**
     * 
     * utiliza el foreach para mostrar el ArrayList
     * @param nombres 
     */
    public void foreachh(ArrayList<String> nombres){
        nombres.forEach( (e)-> System.out.println(e) );

    }
    
}
