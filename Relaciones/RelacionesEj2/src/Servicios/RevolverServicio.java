/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Juego;
import relacionesej2.Revolver;

/**
 *
 * @author u543699
 */
public class RevolverServicio {
    public Revolver llenarRevolver(int cantj){
        Revolver r = new Revolver();
        //int pos1 = 
        r.setPosActual((int) (Math.random() * cantj));
        r.setPosAgua((int) (Math.random() * cantj));
        System.out.println(r.toString());
        //r.toString();
        return r;
        
    }
    /**
     * • mojar(): devuelve true si la posición del agua coincide 
     * con la posición actual
     */
    public boolean mojar(Revolver r){
        boolean moja = false;
        if (r.getPosActual().equals(r.getPosAgua())){
            moja = true;
        }
//        } else if (r.getPosActual().equals(9)){
//            r.setPosActual(0);
//            
//        } else if (r.getPosActual()<9){
//            r.setPosActual(r.getPosActual()+1);
//        }
        return moja;
    }
    public void siguienteChorro(Juego j,int cantj){
        
        if (j.getR().getPosActual().equals(cantj)){
            j.getR().setPosActual(0);
            //r.setPosActual(0);
            
        } else if (j.getR().getPosActual()<cantj){
            j.getR().setPosActual(j.getR().getPosActual()+1);
        }
        
//        if (r.getPosActual().equals(9)){
//            r.setPosActual(0);
//            
//        } else if (r.getPosActual()<9){
//            r.setPosActual(r.getPosActual()+1);
//        }
    }
    public void tostring(Revolver r){
        System.out.println(r.toString());
        if (mojar(r)) {
            
        }
    }
    
    
    
}
