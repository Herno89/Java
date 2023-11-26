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
public class Dni {
    private char serie;
    private int numero;

    public Dni() {
    }

    public Dni(char serie, int numero) {
        this.serie = serie;
        this.numero = numero;
    }

    public char getSerie() {
        return serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
