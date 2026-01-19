/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.receita.controller;

import br.com.ifba.cliente.entity.Cliente;
import br.com.ifba.receita.entity.Receita;

import java.util.List;

/**
 *
 * @author paulo
 */

public interface ReceitaIController {
    
    public Receita save(Receita receita) throws RuntimeException;
    
    public List<Receita> findAll() throws RuntimeException;
    
    public Receita findById(Long ID) throws RuntimeException;
    
    public Receita findByCliente(Cliente cliente) throws RuntimeException;
    
}
