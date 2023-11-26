/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones2guia;

/**
 *
 * @author u543699
 */
public class Jugador {
    private String nombre;
    private String Apellido;
    private int posicion;
    private int numero;

    public Jugador() {
    }

    public Jugador(String nombre, String Apellido, int posicion, int numero) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.posicion = posicion;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getPosicion() {
        return posicion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Jugador || " + "nombre: " + nombre + ", Apellido: " + Apellido + ", posicion: " + posicion + ", numero: " + numero + '}';
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
