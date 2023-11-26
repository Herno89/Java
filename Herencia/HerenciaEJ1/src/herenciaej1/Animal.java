/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej1;

/**
 *
 * @author u543699
 */
public class Animal {
    protected String nombre;
    protected String alimento;
    protected int Edad;
    protected String razaAnimal;

    public Animal() {
    }

    public Animal(String nombre, String alimento, int Edad, String razaAnimal) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.Edad = Edad;
        this.razaAnimal = razaAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public int getEdad() {
        return Edad;
    }

    public String getRazaAnimal() {
        return razaAnimal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setRazaAnimal(String razaAnimal) {
        this.razaAnimal = razaAnimal;
    }
    
    public void Alimentarse(){
        System.out.println("El tipo de alimento es : "+ alimento);
    }
}
