/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.List;

/**
 *
 * @author u543699
 */
public class Juego {
    private List<Jugador> jugadores;
    private RevolverAgua revo;

    public Juego() {
    }

    public Juego(List<Jugador> jugadores, RevolverAgua revo) {
        this.jugadores = jugadores;
        this.revo = revo;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public RevolverAgua getRevo() {
        return revo;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void setRevo(RevolverAgua revo) {
        this.revo = revo;
    }
    
    
}
