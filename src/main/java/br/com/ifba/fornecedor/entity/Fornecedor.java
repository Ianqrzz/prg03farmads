/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.fornecedor.entity;

import br.com.ifba.infraestructure.entity.PersistenceEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 *
 * @author paulo
 */

@Entity
@Table(name = "fornecedores")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Fornecedor extends PersistenceEntity implements Serializable{
    
    @NonNull
    @Column (name = "razao_social", nullable = false)
    private String razaoSocial;
    
    @Column (name = "nome_fantasia")
    private String nomefantasia;
    
    @NonNull
    @Column (name = "cnpj", nullable = false)
    private String cnpj;
    
    @Column (name = "telefone")
    private String telefone;
    
    @Column (name = "email")
    private String email;
    
}
