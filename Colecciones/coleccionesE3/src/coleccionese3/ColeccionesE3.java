/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionese3;

import Servicio.AlumnoServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author u543699
 */
public class ColeccionesE3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Alumno> alumArrayList = new ArrayList();
        
        AlumnoServicio as = new AlumnoServicio();
        String op ="N";
        do {
            //Alumno a1 = as.crearAlumno2();
            alumArrayList.add(as.crearAlumno2());
            System.out.println("Desea cargar otro alumno S/N? ");
            op = leer.next().toUpperCase();
            
        } while (op.equals("S"));
        as.mostrarListaAlumno(alumArrayList);
        System.out.println("Ingrese el nombre del Alumno a calcular promedio: ");
        String busca = leer.next();
        if (as.esta(alumArrayList, busca)) {
            as.notaFinal(alumArrayList, busca);
        }

        //as.mostrarAlumno(alumArrayList);
        ///// Por ahora busca y encuentra el alumno y muestra todas las notas
        
       // as.MostrarAlumnosyNotas(a1, "herno");
//        as.crearAlumno();
//        as.mostrarAlumno();
        
    }
    
}
