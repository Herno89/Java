/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Jugador;
import Entidades.RevolverAgua;

/**
 *
 * @author u543699
 */
public class JugadorServicio {
    public boolean disparo(RevolverAgua r, RevolverDeAguaServicio rs, Jugador j){
        boolean mojado = false;
        if (rs.mojar(r)){
            j.setMojado(true);
            mojado = true;
        }
        rs.siguienteChorro(r);
        return mojado;
    }
}
