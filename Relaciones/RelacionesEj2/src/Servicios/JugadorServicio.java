/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Jugador;
import java.util.Scanner;
import relacionesej2.Revolver;
import Servicios.RevolverServicio;

/**
 *
 * @author u543699
 */
public class JugadorServicio {
    Scanner leer = new Scanner(System.in);
    public Jugador nuevoJugador(){
        System.out.println("Ingrese id:");
        Jugador j = new Jugador(leer.nextInt());
        System.out.println(j.getNombre());
        System.out.println(j.getId());
        return j;
    }
    /**
     * devuelve true si el metodo mojar devuelve true
     * TODO RELACIONAR CON JUGADOR
     * @param r
     * @param rs
     * @return 
     */
    public boolean disparo(Revolver r, RevolverServicio rs){
        boolean mojado= false;
        if (rs.mojar(r)) {
            mojado = true;
        }
        return mojado;
        
        
    }
}

