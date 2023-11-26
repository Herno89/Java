/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej1;

import java.util.Scanner;

/**
 *
 * @author u543699
 */
public class RelacionesEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro p1 = new Perro();
        p1.setNombre("Chiquito");
        p1.setRaza("Calle");
        p1.setEdad(1);
        p1.setTamaño("Medio");
        
        Perro p2 = new Perro();
        
        p2.setNombre("Lechon");
        p2.setRaza("Beagle");
        p2.setEdad(1);
        p2.setTamaño("Chico");
        
        Persona pe1 = new Persona();
        Persona pe2 = new Persona();
        
        pe1.setNombre("Herno");
        pe1.setApellido("Rugo");
        pe1.setEdad(33);
        pe1.setDni(34596656);
        
        
        pe2.setNombre("Lu");
        pe2.setApellido("Cass");
        pe2.setEdad(37);
        pe2.setDni(31475322);
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        boolean listo = true;
        while (listo){
            System.out.println("Hola " + pe1.getNombre() + " elija uno de los dos perros: ");
            System.out.println("A) "+ p1.getNombre());
            System.out.println("B) "+ p2.getNombre());
            System.out.println("C) Detalles de los perros");
            String op = leer.next().toUpperCase();
            
            switch (op){
                case "A":
                    pe1.setPerro(p1);
                    pe2.setPerro(p2);
                    listo = false;
                break;
                case "B":
                    pe1.setPerro(p2);
                    pe2.setPerro(p1);
                    listo = false;
                break;
                case "C":
                    System.out.println(p1.toString());
                    System.out.println(p2.toString());
                    System.out.println("----------------------------");
            }
        }
        System.out.println("----------------------------");
        System.out.println(pe1.toString());
        System.out.println(pe2.toString());
        System.out.println("----------------------------");
        
        
    }
    
}
