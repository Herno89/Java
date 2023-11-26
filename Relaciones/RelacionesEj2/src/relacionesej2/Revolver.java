/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesej2;

/**
 *
 * @author u543699
 */
public class Revolver {
    private Integer posActual;
    private Integer posAgua;

    public Revolver(Integer posActual, Integer posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }

    public Revolver() {
    }

    public Integer getPosActual() {
        return posActual;
    }

    public Integer getPosAgua() {
        return posAgua;
    }

    public void setPosActual(Integer posActual) {
        this.posActual = posActual;
    }

    public void setPosAgua(Integer posAgua) {
        this.posAgua = posAgua;
    }

    @Override
    public String toString() {
        return "Revolver: " + "posActual=" + posActual + ", posAgua=" + posAgua + '}';
    }
    
}
