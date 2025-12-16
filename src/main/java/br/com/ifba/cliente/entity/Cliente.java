/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.cliente.entity;

import br.com.ifba.infraestructure.entity.PersistenceEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author paulo, Criei a classe em branco somente para implementar em receitas
 */
@Entity
@Getter
@Setter

public class Cliente extends PersistenceEntity{
    
    private String nome;
    public Cliente(){
    }
}
