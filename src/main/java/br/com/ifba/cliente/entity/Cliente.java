/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.cliente.entity;

import br.com.ifba.infraestructure.entity.PersistenceEntity;
import jakarta.persistence.Entity;
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
public class Cliente extends PersistenceEntity{
    
    String nome;
    String cpf;
    String endereco;
    String telefone;
    String email;

    //Construtor da classe
    public Cliente() {
    }
    
}
