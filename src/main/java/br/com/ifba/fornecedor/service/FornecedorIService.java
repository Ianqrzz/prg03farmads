/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.fornecedor.service;

import br.com.ifba.fornecedor.entity.Fornecedor;

import java.util.List;

/**
 *
 * @author paulo
 */
public interface FornecedorIService {
    
    public Fornecedor save(Fornecedor fornecedor) throws RuntimeException;
    
    public Fornecedor update(Fornecedor fornecedor) throws RuntimeException;
    
    public void delete(Fornecedor fornecedor) throws RuntimeException;
    
    public List<Fornecedor> findAll() throws RuntimeException;
    
    public Fornecedor findById(Long ID) throws RuntimeException;
    
}
