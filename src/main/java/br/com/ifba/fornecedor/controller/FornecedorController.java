/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.fornecedor.controller;

import br.com.ifba.fornecedor.entity.Fornecedor;
import br.com.ifba.fornecedor.service.FornecedorIService;

import java.util.List;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author paulo
 */
@Controller
@NoArgsConstructor
public class FornecedorController implements FornecedorIController{
    
    @Autowired
    private FornecedorIService fornecedorService;
    
    
    @Override
    public Fornecedor save(Fornecedor fornecedor) throws RuntimeException{
        return fornecedorService.save(fornecedor);
    }
    
    @Override
    public Fornecedor update(Fornecedor fornecedor) throws RuntimeException{
        return fornecedorService.update(fornecedor);
    }
    
    @Override
    public void delete(Fornecedor fornecedor) throws RuntimeException{
        fornecedorService.delete(fornecedor);
    }
    
    @Override
    public List<Fornecedor> findAll() throws RuntimeException{
        return fornecedorService.findAll();
    }
    
    @Override
    public Fornecedor findById(Long ID) throws RuntimeException{
        return fornecedorService.findById(ID);
    }
}
