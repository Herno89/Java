/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesguia;

/**
 *
 * @author u543699
 */


public class Persona {
    private String nombre;
    private String apellido;
    private Dni dni;

    public Persona(String nombre, String apellido, Dni dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Dni getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(Dni dni) {
        this.dni = dni;
    }
    
    
    
    
    
    
}
