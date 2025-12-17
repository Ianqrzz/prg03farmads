/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.cliente.controller;

import br.com.ifba.cliente.entity.Cliente;
import br.com.ifba.cliente.service.ClienteIService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
/**
 *
 * @author PC
 */
@Controller
public class ClienteController implements ClienteIController {
    
    @Autowired
    private ClienteIService clienteService;

    @Override
    public Cliente save(Cliente entity) {
        return clienteService.save(entity);
    }

    @Override
    public Cliente update(Long id, Cliente entity) {
        return clienteService.update(id, entity);
    }

    @Override
    public void delete(Cliente entity) {
        clienteService.delete(entity);
    }

    @Override
    public List<Cliente> listAll() {
        return clienteService.listAll();
    }

    @Override
    public Cliente findById(Long id) {
        return clienteService.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        clienteService.deleteById(id);
    }
    
}
