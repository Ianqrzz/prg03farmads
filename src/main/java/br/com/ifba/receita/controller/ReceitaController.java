/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.receita.controller;

import br.com.ifba.cliente.entity.Cliente;
import br.com.ifba.receita.entity.Receita;
import br.com.ifba.receita.service.ReceitaIService;

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
public class ReceitaController implements ReceitaIController{
    
    @Autowired
    private ReceitaIService receitaService;
    
    
    @Override
    public Receita save(Receita receita) throws RuntimeException{
        return receitaService.save(receita);
    }
    
    @Override
    public List<Receita> findAll() throws RuntimeException{
        return receitaService.findAll();
    }
    
    @Override
    public Receita findById(Long ID) throws RuntimeException{
        return receitaService.findById(ID);
    }
    
    @Override
    public Receita findByCliente(Cliente cliente) throws RuntimeException{
        return receitaService.findByCliente(cliente);
    }
    
}
