/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.RevolverAgua;
import java.util.ArrayList;

/**
 *
 * @author u543699
 */
public class JuegoServicio {
    public Juego llenarJuego(ArrayList<Jugador> jugadores, RevolverAgua r){
        Juego juego = new Juego();
        juego.setRevo(r);
        juego.setJugadores(jugadores);
        
        return juego;
    }
    public void ronda(Juego j, JugadorServicio js, RevolverDeAguaServicio revServ){
        System.out.println(j.getJugadores().get(0));
        js.disparo(j.getRevo(), revServ, j.getJugadores().get(0));
        System.out.println("");
        
                
    }
}
