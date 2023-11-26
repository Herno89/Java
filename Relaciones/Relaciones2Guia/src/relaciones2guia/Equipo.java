/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones2guia;

import java.util.List;

/**
 *
 * @author u543699
 */
public class Equipo {
    private List<Jugador> jugador;

    public Equipo() {
    }

    public Equipo(List<Jugador> jugador) {
        this.jugador = jugador;
    }

    public List<Jugador> getJugador() {
        return jugador;
    }

    public void setJugador(List<Jugador> jugador) {
        this.jugador = jugador;
    }
    
}
