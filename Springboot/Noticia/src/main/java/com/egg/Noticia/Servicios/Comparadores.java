/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.Noticia.Servicios;

import com.egg.Noticia.Entidades.Noticia;
import java.util.Comparator;


/**
 *
 * @author u543699
 */
public class Comparadores {
    
    public static Comparator<Noticia> ordenarPorTituloDesc = new Comparator<Noticia>(){
        
        @Override
        public int compare(Noticia o1, Noticia o2){
            return o2.getTitulo().compareTo(o1.getTitulo());
        }
        
        
    };
    public static Comparator<Noticia> OrdenarPorFechaDesc = new Comparator<Noticia>(){
        
        @Override
        public int compare(Noticia o1, Noticia o2){
            return o2.getFechaNoti().compareTo(o1.getFechaNoti());
        }
        
    };
}
