/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.Noticia.Repositorio;

import com.egg.Noticia.Entidades.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author u543699
 */
@Repository
public interface ImagenRepositorio extends JpaRepository<Imagen,String>{
    
}
