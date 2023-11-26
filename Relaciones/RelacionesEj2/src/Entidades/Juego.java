/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import relacionesej2.Revolver;

/**
 *
 * @author u543699
 */
public class Juego {
    private ArrayList<Jugador> jugadores;
    private Revolver r;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver r) {
        this.jugadores = jugadores;
        this.r = r;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public Revolver getR() {
        return r;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void setR(Revolver r) {
        this.r = r;
    }
    
}
