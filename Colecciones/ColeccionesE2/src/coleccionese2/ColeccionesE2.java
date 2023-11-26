/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionese2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author u543699
 */
public class ColeccionesE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> raza = new ArrayList();
        raza.add("dogo");
        raza.add("beagle");
        raza.add("perro");
        raza.add("britain");
        
        boolean var = true;
        while (var == true){
            System.out.println("ingrese una raza de perro: ");
            String perro = leer.next();
            raza.add(perro);
            System.out.println("Quiere ingresar otra R_aza o S_alir ? : ");
            if (leer.next().equals("S")) {
                var = false;
            }
            
                    
        }
        
        raza.forEach( (e)-> System.out.println(e) );
        
        System.out.println("Ingrese raza de perro a buscar y eliminar: ");
        String bus = leer.next();
        
        Iterator<String> it = raza.iterator();
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equals(bus)){
                it.remove();
            }
        }

        raza.forEach( (e)-> System.out.println(e) );
                
                
        
    }
    
}
