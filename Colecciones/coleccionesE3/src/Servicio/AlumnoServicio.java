/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import coleccionese3.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author u543699
 */
public class AlumnoServicio {
    Scanner leer = new Scanner(System.in);
    private ArrayList Alumno;

    public AlumnoServicio() {
        this.Alumno = new ArrayList();
    }
    
    public Alumno crearAlumno(){
        
        System.out.println("Ingrese nombre del alumno");
        String n = leer.next();
        ArrayList<Integer> notas = new ArrayList();
        System.out.println("Ingrese nota1: ");
        Integer n1 = leer.nextInt();
        System.out.println("Ingrese nota2: ");
        Integer n2 = leer.nextInt();
        System.out.println("Ingrese nota3: ");
        Integer n3 = leer.nextInt();
        notas.add(n1);
        notas.add(n2);
        notas.add(n3);
        
        Alumno a = new Alumno(n,notas);
        
        return a;
    }
    public void mostrarAlumno(Alumno a){
        System.out.println("Alumno: "+ a.getNombre());
        //----------------- NOTAS
        //a.forEach( (e)-> System.out.println(e) );
         
        a.getNotas().forEach((e)-> System.out.println(e));
        
    }
    /**
     * Muestra el contenido del ArrayList creado en el Main
     * @param alumArrayList 
     */
    public void mostrarListaAlumno(ArrayList<Alumno>alumArrayList){
        for (Alumno aux : alumArrayList) {
            System.out.println("Nombre: "+ aux.getNombre());
            System.out.println("Nota 1: "+ aux.getNotas().get(0));
            System.out.println("Nota 1: "+ aux.getNotas().get(1));
            System.out.println("Nota 1: "+ aux.getNotas().get(2));
        }
    }
    public boolean esta(ArrayList<Alumno>alumArrayList, String busca){
        boolean esta = false;

        
        for (Alumno aux : alumArrayList) {
            if (aux.getNombre().equals(busca)) {
                esta = true;
            }
        }
        
        return esta;
        
    }
    
    public void notaFinal(ArrayList<Alumno>alumArrayList, String busca){

        double prom;
        for (Alumno aux : alumArrayList) {
            if (aux.getNombre().equals(busca)) {
                prom = ((double)(aux.getNotas().get(0)) + (double)aux.getNotas().get(1)+(double)aux.getNotas().get(2));
                prom = prom /3;
                System.out.println("El promedio es:" + prom );
            }
        }
        
        
    }
    public Alumno crearAlumno2(){
        
        Alumno an = new Alumno();
        System.out.println("Ingrese nombre del alumno");
        String n = leer.next();
        ArrayList<Integer> notass = new ArrayList();
        
        System.out.println("Ingrese nota1: ");
        Integer n1 = leer.nextInt();
        System.out.println("Ingrese nota2: ");
        Integer n2 = leer.nextInt();
        System.out.println("Ingrese nota3: ");
        Integer n3 = leer.nextInt();
        
        
        notass.add(n1);
        notass.add(n2);
        notass.add(n3);
        an.setNombre(n);
        an.setNotas(notass);
        

        return an;
//        
//        notas.set(0, n1);
//        notas.set(1, n2);
//        notas.set(2, n3);
//        
    }
    public void MostrarAlumnosyNotas(Alumno a, String nombre){
        ArrayList notas = new ArrayList();
        for (int i = 0; i < Alumno.size() ; i++) {
            
        if (a.getNombre().equals(nombre)) {
            notas = a.getNotas();
        }
        }
        System.out.println(notas);
    }
    
}
