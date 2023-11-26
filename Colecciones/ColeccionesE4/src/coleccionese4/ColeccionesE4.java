/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionese4;

import Servicio.PeliculasServicio;
import java.util.ArrayList;

/**
 *
 * @author u543699
 */
public class ColeccionesE4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Peliculas> pelis = new ArrayList();
        PeliculasServicio ps = new PeliculasServicio();
        ps.cargadepelis(pelis);
        ps.mostrarPelisList(pelis);
        //ps.mostrarPelisMasUnaHora(pelis);
        ps.mostrarPelisListDuracion(pelis);
        ps.reordenarPeliculasDur(pelis);
        ps.mostrarPelisList(pelis);
        ps.reordenarPeliculasTit(pelis);
        ps.mostrarPelisList(pelis);
        ps.reordenarPeliculasDir(pelis);
        ps.mostrarPelisList(pelis);
    }
    
}
