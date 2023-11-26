/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author u543699
 */
public class RevolverAgua {
    private int posActual;
    private int posAgua;

    public RevolverAgua() {
    }

    public RevolverAgua(int posActual, int posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }

    public int getPosActual() {
        return posActual;
    }

    public int getPosAgua() {
        return posAgua;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public void setPosAgua(int posAgua) {
        this.posAgua = posAgua;
    }
    
    
}
