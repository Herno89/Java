/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleciones;

/**
 *
 * @author u543699
 */
public class Mascotas {
    private String nombre;
    private String tipo;

    public Mascotas() {
    }
    
    public Mascotas(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Mascotas{" + "nombre=" + nombre + ", tipo=" + tipo + '}';
    }

}
