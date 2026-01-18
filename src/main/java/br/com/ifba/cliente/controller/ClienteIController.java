/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.cliente.controller;

import br.com.ifba.cliente.entity.Cliente;
import java.util.List;

/**
 *
 * @author PC
 */
public interface ClienteIController {
    
    public abstract Cliente save(Cliente entity);
    
    //update obsoleto
    
    public abstract void delete(Cliente entity);
    
    public abstract List<Cliente> listAll();
    
    public abstract Cliente findById(Long id);
    
     void deleteById(Long id);
}
