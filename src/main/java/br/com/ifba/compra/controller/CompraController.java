/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.compra.controller;

import br.com.ifba.compra.entity.Compra;
import br.com.ifba.compra.service.CompraService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CompraController implements CompraIController {
    private final CompraService service;

    @Autowired
    public CompraController(CompraService service) {
        this.service = service;
    }
    
    @Override
    public Compra save(Compra entity) {
        return service.save(entity);
    }

    @Override
    public List<Compra> findAll() {
        return service.findAll();
    }

    @Override
    public void delete(Compra entity) {
        service.delete(entity);
    }

    @Override
    public Compra findById(Long id) {
        return service.findById(id);
    }

    @Override
    public void deleteById(Long Id) {
        service.deleteById(Id);
    }
    
}
