/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.venda.service;

import br.com.ifba.venda.entity.Venda;
import br.com.ifba.venda.repository.VendaRepository;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VendaService implements VendaIService {

    private final VendaRepository repository;

    @Autowired
    public VendaService(VendaRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public Venda save(Venda entity) {
        // Validação de Funcionário (conforme diagrama 1,1)
        if (entity.getFuncionario() == null) {
            throw new RuntimeException("Uma venda deve possuir um funcionário associado.");
        }

        // Validação de Cliente (conforme diagrama 1,1)
        if (entity.getCliente() == null) {
            throw new RuntimeException("Uma venda deve possuir um cliente associado.");
        }

        // Validação de Itens/Produtos
        if (entity.getProdutos() == null || entity.getProdutos().isEmpty()) {
            throw new RuntimeException("Não é possível realizar uma venda sem produtos.");
        }

        // Garantir que a data da venda seja o momento atual se estiver nula
        if (entity.getDataVenda() == null) {
            entity.setDataVenda(LocalDateTime.now());
        }

        return repository.save(entity);
    }

    @Override
    public List<Venda> findAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Venda entity) {
        repository.deleteById(entity.getId());
    }

    @Override
    public Venda findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Venda não encontrada para o ID: " + id));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}