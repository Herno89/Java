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
public class Electrodomestico {

    protected Integer precio;
    protected String color;
    protected char Consumo;
    protected int peso;
    public Scanner leer = new Scanner(System.in);
    
    
    public Electrodomestico() {
        this.precio = 1000;
    }

    public Electrodomestico(Integer precio, String color, char Consumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.Consumo = Consumo;
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo() {
        return Consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumo(char Consumo) {
        this.Consumo = Consumo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    

    public void comprobarConsumo(Electrodomestico e) {
        String valor = "" + e.getConsumo();
        valor = valor.toUpperCase();
        if (valor.equals("A") || valor.equals("B") || valor.equals("C") || valor.equals("D") || valor.equals("E") || valor.equals("F")) {
            System.out.println(" Bien hecho");
        } else {
            e.setConsumo('F');
        }
//        System.out.println("valor: "+valor);
//        System.out.println("consunmo Atributo: "+ e.getConsumo());
    }
    public void comprobarColor(Electrodomestico e) {
        String colorAux = e.getColor();
        colorAux = colorAux.toUpperCase();
        if (colorAux.equals("BLANCO")|| colorAux.equals("NEGRO")|| colorAux.equals("ROJO") || colorAux.equals("AZUL")|| colorAux.equals("GRIS") ){
            System.out.println("Bien hecho");            
        } else {
            e.setColor("blanco");
            System.out.println("Color seteado por defecto a blanco");
            
        }
    }
    public void crearElectrodomestico(Electrodomestico e){
       
        System.out.println("Ingrese consumo a,b,c,d,e,f: ");
        char consumo = leer.next().charAt(0);
        e.setConsumo(consumo);
        e.comprobarConsumo(e);
        
        System.out.println("Ingrese color: ");
        String color = leer.next();
        e.setColor(color);
        comprobarColor(e);
        
       
    }
    public void precioFinal(Electrodomestico e){
//        System.out.println("Ingrese el tamaño/peso: ");
//        int tamano = leer.nextInt();
//        e.setPeso(tamano);
        Integer valor = e.getPrecio();
        Integer pp =  e.getPeso();
        if (pp>=1 && pp<20) {
            valor += 100;
        } else if (pp>=20 && pp<50){
            valor+=500;
        }else if (pp>=50 && pp<80){
            valor+=800;
        }else if (pp>=80){
            valor+=1000;
        }
        String var = ""+e.getConsumo();
        
        switch (var.toUpperCase()){
            case "F":
                valor+=100;
            break;
            case "E":
                valor+=300;
            break;
            case "D":
                valor+=500;
            break;
            case "C":
                valor+=600;
            break;
            case "B":
                valor+=800;
            break;
            case "A":
                valor+=1000;
            break;
        }
        
        e.setPrecio(valor);
    }

    @Override
    public String toString() {
        return "Electrodomestico " + "precio = " + precio + ", color = " + color + ", Consumo = " + Consumo + ", peso = " + peso ;
    }

}
