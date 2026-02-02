/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.convenio.entity;

import br.com.ifba.cliente.entity.Cliente;
import br.com.ifba.infraestructure.entity.PersistenceEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ianep
 */
@Entity
@Getter
@Setter
public class Convenio extends PersistenceEntity{
    
    @Column(name = "nome", nullable = false)
    private String nome;
    
    @Column(name = "desconto", nullable = false)
    private BigDecimal desconto;
    
    @OneToMany
    private List<Cliente> clientes;
}
