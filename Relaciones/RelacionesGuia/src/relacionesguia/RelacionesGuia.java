/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesguia;

/**
 *
 * @author u543699
 */
public class RelacionesGuia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dni d = new Dni();
        d.setNumero(123);
        d.setSerie('A');
        Dni d2 = new Dni();
        d2.setNumero(234);
        d2.setSerie('B');
        Persona p1 = new Persona();
        p1.setApellido("Rugolo");
        p1.setNombre("Herno");
        p1.setDni(d);
        Persona p2 = new Persona();
        p2.setApellido("Cass");
        p2.setNombre("Lu");
        p2.setDni(d2);
        
        System.out.println("datos de la persona: ");
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Apellido: " + p1.getApellido());
        System.out.println("DNI: " + p1.getDni().getNumero());
        System.out.println("-----------------------");
        System.out.println("datos de la persona: ");
        System.out.println("Nombre: " + p2.getNombre());
        System.out.println("Apellido: " + p2.getApellido());
        System.out.println("DNI: " + p2.getDni().getNumero());
    }
    
}
