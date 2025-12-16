/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.receita.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;

import br.com.ifba.infraestructure.entity.PersistenceEntity;
import br.com.ifba.cliente.entity.Cliente;
import jakarta.persistence.JoinColumn;
import java.util.Date;


/**
 *
 * @author paulo
 */

@Entity
@Table(name = "receitas")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Receita extends PersistenceEntity implements Serializable{
    
    @jakarta.persistence.ManyToOne 
    @JoinColumn (name = "cliente", nullable = false)
    private Cliente cliente;
    
    @Column (name = "nome_medico", nullable = false)
    private String nomeMedico;
    
    @Column (name = "crm_medico", nullable = false)
    private String crmMedico;
    
    @Column (name = "nome_remedio", nullable = false)
    private String nomeRemedio;
    
    @Column (name = "dosagem", nullable = false)
    private double dosagem;
    
    @Column (name = "modo_uso", nullable = false)
    private String modoUso;
    
    @Column (name = "data_emissao", nullable = false)
    private Date dataEmissao;
    
    @Column (name = "data_validade")
    private Date dataValidade;
    
    @Column (name = "tipo_receituario")
    private String tipoReceituario;
    
}
