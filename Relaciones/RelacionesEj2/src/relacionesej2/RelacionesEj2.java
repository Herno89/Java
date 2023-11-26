/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej2;

import Entidades.Juego;
import Entidades.Jugador;
import Servicios.JuegoServicio;
import Servicios.JugadorServicio;
import Servicios.RevolverServicio;
import java.util.ArrayList;
import java.util.Scanner;
import relacionesej2.Revolver;

/**
 *
 * @author u543699
 */
public class RelacionesEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList();
        RevolverServicio rs = new RevolverServicio();
        Revolver r = new Revolver();
        JuegoServicio juegoServ = new JuegoServicio();
        Juego nuevo = juegoServ.llenarJuego(jugadores, r);
        
        do {
            
        juegoServ.ronda(nuevo);
        } while (leer.nextInt()!=0);
        
        
//        rs.llenarRevolver();
//        if (rs.mojar(r)) {
//            System.out.println("Te mojaste!!!!!");
//        } else {
//            System.out.println("Estas seco.");
//        }
//        rs.siguienteChorro(r);
//        rs.tostring(r);
//        JugadorServicio js = new JugadorServicio();
//        System.out.println("Ingrese cantidad de jugadores:");
//        int cantj = leer.nextInt();
//        for (int i = 0; i < cantj; i++) {
//            Jugador j = js.nuevoJugador();
//            jugadores.add(j);
//        }
//        juegoServ.llenarJuego(jugadores, r);
        
    }
    
}
