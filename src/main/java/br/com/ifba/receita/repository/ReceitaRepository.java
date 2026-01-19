/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.receita.repository;

import br.com.ifba.receita.entity.Receita;
import br.com.ifba.cliente.entity.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author paulo
 */
@Repository
public interface ReceitaRepository extends JpaRepository<Receita, Long>{
    
    public Receita findByCliente(Cliente cliente);
    
}
