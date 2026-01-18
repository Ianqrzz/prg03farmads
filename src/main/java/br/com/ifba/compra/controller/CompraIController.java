/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.compra.controller;

import br.com.ifba.compra.entity.Compra;
import java.util.List;

/**
 *
 * @author PC
 */

public interface CompraIController {
    
    public abstract Compra save(Compra entity);
    
    public abstract List<Compra> findAll();
    
    public abstract void delete(Compra entity);
    
    public abstract Compra findById(Long id);
    
    public abstract void deleteById(Long Id);
    
}
