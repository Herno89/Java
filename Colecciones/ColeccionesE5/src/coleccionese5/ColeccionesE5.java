/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionese5;

import Servicios.PaisesServicio;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author u543699
 */
public class ColeccionesE5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        TreeSet<Paises> paises = new TreeSet();
        PaisesServicio ps = new PaisesServicio();
        
        ps.cargaPaises2(paises);
        ps.mostrarPaises(paises);
        System.out.println("Ingrese pais a eliminar: ");
        ps.buscarPaisYEliminar(leer.next(), paises);
        ps.mostrarPaises(paises);
    }
    
}
