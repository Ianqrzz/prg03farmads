/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.venda.entity;

import br.com.ifba.cliente.entity.Cliente;
import br.com.ifba.funcionarios.entity.Funcionarios;
import br.com.ifba.infraestructure.entity.PersistenceEntity;
import br.com.ifba.produto.entity.Produto;
import br.com.ifba.receita.entity.Receita;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Venda extends PersistenceEntity {

    private LocalDateTime dataVenda;
    private float valorTotal;

    @ManyToOne
    @JoinColumn(name = "funcionario_id", nullable = false)
    private Funcionarios funcionario;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "receita_id")
    private Receita receita;

    
    @ManyToMany
    @JoinTable(
        name = "venda_produtos", 
        joinColumns = @JoinColumn(name = "venda_id"),
        inverseJoinColumns = @JoinColumn(name = "produto_id")
    )
    private List<Produto> produtos;

    public void finalizarVenda() {
        
    }
}