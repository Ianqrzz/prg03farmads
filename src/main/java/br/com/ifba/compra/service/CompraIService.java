/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.compra.service;

import br.com.ifba.compra.entity.Compra;
import java.util.List;

/**
 *
 * @author PC
 */
public interface CompraIService {
    
    public abstract Compra save(Compra entity);
    
    public abstract List<?> findAll();
    
    public abstract void delete(Compra entity);
    
    public abstract Compra findById(Long id);
    
    public abstract void deleteById(Long Id);
    
}
