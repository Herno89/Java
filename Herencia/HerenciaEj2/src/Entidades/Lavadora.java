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
public class Lavadora extends Electrodomestico {
    
    protected int carga;
    
    Scanner leer = new Scanner(System.in);
    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, Integer precio, String color, char Consumo, int peso) {
        super(precio, color, Consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        //return ;
        return "Lavadora{" + "carga=" + carga + '}'+ "Electrodomestico " + "precio = " + precio + ", color = " + color + ", Consumo = " + Consumo + ", peso = " + peso ;
    }
    
    
    public void crearLavadora(Lavadora l){
        System.out.println("Ingrese los datos de la lavadora: ");
        super.crearElectrodomestico(l);
        System.out.println("Ingrese carga de la lavadora: ");
        l.setCarga(leer.nextInt());
    }
    public void precioFinal(Lavadora l){
        super.precioFinal(l);
        if (l.getCarga()>30) {
            
            l.setPrecio(l.getPrecio()+500);
        }
        
    }
    
}
