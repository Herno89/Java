/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones2guia;

import java.util.ArrayList;

/**
 *
 * @author u543699
 */
public class Relaciones2Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Jugador j1 = new Jugador();
        j1.setApellido("Rugo");
        j1.setNombre("Herno");
        j1.setNumero(1);
        j1.setPosicion(5);
        Jugador j2 = new Jugador();
        j2.setApellido("gg");
        j2.setNombre("hh");
        j2.setNumero(2);
        j2.setPosicion(4);
        Jugador j3 = new Jugador();
        j3.setApellido("Cass");
        j3.setNombre("Lu");
        j3.setNumero(3);
        j3.setPosicion(3);
        ArrayList<Jugador> jugadores = new ArrayList();
        jugadores.add(j1);
        jugadores.add(j2);
        jugadores.add(j3);
        
        Equipo e = new Equipo();
        e.setJugador(jugadores);
        
        for (Jugador aux : jugadores) {
            System.out.println(aux.toString());
        }
    }
    
}
