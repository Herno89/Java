/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.RevolverAgua;

/**
 *
 * @author u543699
 */
public class RevolverDeAguaServicio {
    public RevolverAgua llenarRevolver(){
        RevolverAgua r = new RevolverAgua();
        r.setPosActual((int) (Math.random() * 6));
        r.setPosAgua((int) (Math.random() * 6));
        
        return r;
    }
    public boolean mojar(RevolverAgua r){
        boolean mojado = false;
        if (r.getPosActual()==r.getPosAgua()){
            mojado = true;
        }
        return mojado;
    }
    public void siguienteChorro(RevolverAgua r){
        if (r.getPosActual()==5){
            r.setPosActual(0);
        }else if (r.getPosActual()<5){
            r.setPosActual(r.getPosActual()+1);
        }
            
    }
    public void tostring(RevolverAgua r){
        System.out.println("Posicion Actual: "+ r.getPosActual() + " | Posicion del agua: " + r.getPosAgua());
        
    }
}
