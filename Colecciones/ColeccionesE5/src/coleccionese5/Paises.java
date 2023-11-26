/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionese5;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author u543699
 */
public class Paises implements Comparable<Paises> {
    private String pais;

    public Paises(String pais) {
        this.pais = pais;
    }

    public Paises() {
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.pais);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paises other = (Paises) obj;
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Paises t) {
       return this.pais.compareTo(t.getPais());
       //return t.getPais().compareTo(this.pais);
    }
    
//    public static Comparator<Paises> compara = new Comparator<Paises>(){
//        @Override
//        public int compare(Paises t, Paises t1) {
//           return t1.getPais().compareTo(t.getPais());
//        }
//        
//    };
}