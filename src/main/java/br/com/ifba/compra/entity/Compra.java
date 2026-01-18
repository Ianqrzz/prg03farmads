/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.compra.entity;

import br.com.ifba.funcionarios.entity.Funcionarios;
import br.com.ifba.infraestructure.entity.PersistenceEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author PC
 */

@Getter
@Setter
@ToString
@Entity
public class Compra extends PersistenceEntity{
    private String numeroNF;
    private String chaveNF;
    private LocalDate dataEmissao;
    private LocalDate dataLancamento;
    private double valorTotal;
    private String status;
    
    @OneToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionarios funcionario;
}
