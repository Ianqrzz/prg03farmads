/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.cliente.service;

import br.com.ifba.cliente.entity.Cliente;
import br.com.ifba.cliente.repository.ClienteRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
@Service
public class ClienteService implements ClienteIService {
    
    private final ClienteRepository repository;
    private static final Logger log = Logger.getLogger(ClienteService.class.getName());

    @Autowired
    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public Cliente save(Cliente entity) {
        log.info("Salvo nome do cliente" + entity.getNome());
        return repository.save(entity);
    }

    @Override
    public Cliente update(Long id, Cliente entity) {
        log.info("Atualizando cliente" + entity.getNome());
        
        Cliente antigo = findById(id);
        
        antigo.setCpf(entity.getCpf());
        antigo.setEmail(entity.getEmail());
        antigo.setEndereco(entity.getEndereco());
        antigo.setNome(entity.getNome());
        antigo.setTelefone(entity.getTelefone());
        
        return repository.save(antigo);
    }

    @Override
    public void delete(Cliente entity) {
        if (!repository.findById(entity.getId()).isPresent()) {
        throw new RuntimeException("Cliente não encontrado para exclusão");
        }    
        
        log.info("um objeto do curso foi deletado");
        repository.deleteById(entity.getId());
    }

    @Override
    public List<Cliente> listAll() {
        return repository.findAll();
    }

    @Override
    public Cliente findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Cliente não encontrado para o ID: " + id));
    }
    
    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
}
}
