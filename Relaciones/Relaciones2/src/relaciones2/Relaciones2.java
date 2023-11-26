/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones2;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.RevolverAgua;
import Servicios.JuegoServicio;
import Servicios.JugadorServicio;
import Servicios.RevolverDeAguaServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author u543699
 */
public class Relaciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ArrayList<Jugador> jugadoresAL = new ArrayList();
        JuegoServicio js = new JuegoServicio();
        RevolverDeAguaServicio rs = new RevolverDeAguaServicio();
        RevolverAgua r = rs.llenarRevolver();
        
        System.out.println("Ingrese cantidad de jugadores: ");
        int cant = leer.nextInt();
        
        for (int i = 0; i < cant; i++) {
            
            System.out.println("Ingrese ID del jugador: ");
            int ju = leer.nextInt();
            Jugador jugador1 = new Jugador(ju);
            jugadoresAL.add(jugador1);
            
        }
        JugadorServicio jos = new JugadorServicio();
        
        Juego nuevo = js.llenarJuego(jugadoresAL, r);
        js.ronda(nuevo, jos, rs);
                
//        do {
//            
//        } while (true);
        
           
        
        
    }
    
}
