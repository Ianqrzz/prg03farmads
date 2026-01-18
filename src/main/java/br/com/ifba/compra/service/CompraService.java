/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.compra.service;

import br.com.ifba.compra.entity.Compra;
import br.com.ifba.compra.repository.CompraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraService implements CompraIService {
    
    private final CompraRepository repository;

    @Autowired
    public CompraService(CompraRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public Compra save(Compra entity) {
        
        if(entity.getNumeroNF().isEmpty()) throw new RuntimeException("Numero NF vazio");
        
        if(entity.getChaveNF().isEmpty()) throw new RuntimeException("Chave NF vazia");
         
        if(entity.getFuncionario() == null) throw new RuntimeException("sem funcionarios associados as compra");
        
        //entity.setDataLancamento(LocalDate.now());
        
        return repository.save(entity);
    }

    @Override
    public List<Compra> findAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Compra entity) {
        repository.deleteById(entity.getId());
    }

    @Override
    public Compra findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Compra não encontrado para o ID: " + id));
    }

    @Override
    public void deleteById(Long Id) {
    repository.deleteById(Id);
        }

    
    
}
