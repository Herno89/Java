/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author u543699
 */
public class Tele extends Electrodomestico {
    
    protected int resolucion;
    protected boolean sintonizadorTDT;
    Scanner leer = new Scanner(System.in);
    public Tele() {
    }

    public Tele(int resolucion, boolean sintonizadorTDT) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Tele(int resolucion, boolean sintonizadorTDT, Integer precio, String color, char Consumo, int peso) {
        super(precio, color, Consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public String toString() {
        return "Tele{" + "resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + '}' + "precio = " + precio + ", color = " + color + ", Consumo = " + Consumo + ", peso = " + peso; 
  
    }
    
    
    public void crearTele(Tele t1){
        System.out.println("Ingrese los datos del TV: ");
        super.crearElectrodomestico(t1);
        System.out.println("Ingrese tamaño de pantalla en pulgadas: ");
        t1.setResolucion(leer.nextInt());
        System.out.println("Ingrese 'y' si tiene TDT: ");
        if (leer.next().toUpperCase().equals("Y")) {
            t1.setSintonizadorTDT(true);
        } else {
            t1.setSintonizadorTDT(false);
        }
                
                
    }
    public void precioFinal(Tele t1){
        super.precioFinal(t1); ;
        if (t1.getResolucion()>40) {
            float valor;
            valor = (float)t1.getPrecio();
            valor = valor*1.3f;
            
            Integer valor2;
            valor2 = (int)valor;
            
            t1.setPrecio(valor2);
            System.out.println("valor2 = "+valor2);
        }
        if (t1.isSintonizadorTDT()){
            t1.setPrecio(t1.getPrecio()+500);
        }
    }
}
