/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej2;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Tele;
import java.util.ArrayList;

/**
 *
 * @author u543699
 */
public class HerenciaEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Electrodomestico e = new Electrodomestico();
//        e.crearElectrodomestico(e);
//        e.precioFinal(e);
//        
//        System.out.println(e.toString());


//        Lavadora l = new Lavadora();
//        l.crearLavadora(l);
//        l.precioFinal(l);
//        System.out.println(l.toString());
//        Tele t1 = new Tele();
//        
//        t1.crearTele(t1);
//        t1.precioFinal(t1);
//        System.out.println(t1.toString());
//        
        /**
         * EJ3
         */
                
                
        ArrayList<Electrodomestico> electro = new ArrayList();
        Lavadora l1 = new Lavadora(8, 1000, "negro", 'A', 55);
        electro.add(l1);
        Lavadora l2 = new Lavadora(8, 1000, "blanco", 'B', 55);
        electro.add(l2);
        Tele t1 = new Tele(40, true, 2000, "negro", 'B', 10);
        electro.add(t1);
        Tele t2 = new Tele(40, true, 2000, "negro", 'A', 10);
        electro.add(t2);
        Integer precioLote=0;
        for (Electrodomestico AUX : electro) {
            AUX.precioFinal(AUX);
            precioLote+=AUX.getPrecio();
            
        }
        
        for (Electrodomestico AUX : electro) {
            System.out.println(AUX.toString());
            
        }
        System.out.println("Precio del Lote: "+ precioLote);
        
    }
    
}
