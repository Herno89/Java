/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Juego;
import Entidades.Jugador;
import java.util.ArrayList;
import relacionesej2.Revolver;
import Servicios.JugadorServicio;
import java.util.Scanner;

/**
 *
 * @author u543699
 */
public class JuegoServicio {
    
    
/**
 * La idea es llenar el ArrayList con los jugadores y ya guardar quien esta mojado
 * @param jugadores
 * @param r
 * @param cantj 
 */
    public Juego llenarJuego(ArrayList<Jugador> jugadores, Revolver r){
        
        Scanner leer = new Scanner(System.in);        
        JugadorServicio js = new JugadorServicio();
        System.out.println("Ingrese cantidad de jugadores:");
        int cantj = leer.nextInt();
        for (int i = 0; i < cantj; i++) {
            Jugador j = js.nuevoJugador();
            jugadores.add(j);
        }
        RevolverServicio revServ = new RevolverServicio();
        r = revServ.llenarRevolver(cantj);
        
        Juego j = new Juego(jugadores , r);
                
        return j;
        
        
        //Jugador j = new Jugador();
//        JugadorServicio js = new JugadorServicio();
//        Jugador j = js.nuevoJugador();



//        for (int i = 0; i < jugadores.size(); i++) {
//            if (i==r.getPosAgua()){
//                jugadores.get(i).setMojado(true);
//            }
//            
//        }
  
            
            
        
    }
    
    public void ronda(Juego j){
        RevolverServicio rs = new RevolverServicio();
        for (int i = 0; i < j.getJugadores().size(); i++) {
            
            System.out.println(j.getJugadores().get(i));
            if (rs.mojar(j.getR())){
                System.out.println("Estas mojado");
                rs.siguienteChorro(j,j.getJugadores().size());
            }else {
                System.out.println("Estas seco");
                rs.siguienteChorro(j,j.getJugadores().size());
                
            }
        }
    }
}
