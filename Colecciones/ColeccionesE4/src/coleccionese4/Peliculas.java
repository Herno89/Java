/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionese4;

import java.util.Comparator;

/**
 *
 * @author u543699
 */
public class Peliculas {

    private String titulo;
    private String director;
    private Integer duracion;

    public Peliculas() {
    }

    public Peliculas(String titulo, String director, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public static Comparator<Peliculas> compararDuracion = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }

    };
    public static Comparator<Peliculas> compararTitulo = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t1.getTitulo().compareTo(t.getTitulo());
        }

    };
     public static Comparator<Peliculas> compararDirector = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t1.getDirector().compareTo(t.getDirector());
        }

    };
}
