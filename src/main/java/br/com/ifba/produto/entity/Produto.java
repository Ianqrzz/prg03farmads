package br.com.ifba.produto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "produto")
@Data
@EqualsAndHashCode(callSuper = false)
@Inheritance(strategy = InheritanceType.JOINED)
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private double preco;
    private int qtdEstoque;
    private double custo;
    private int estoqueMin;

    // Construtor vazio obrigatório
    public Produto() {
    }

    // --- GETTERS E SETTERS MANUAIS (Para não depender do Lombok) ---
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public int getEstoqueMin() {
        return estoqueMin;
    }

    public void setEstoqueMin(int estoqueMin) {
        this.estoqueMin = estoqueMin;
    }

    @Override
    public String toString() {
        return "Produto{id=" + id + ", nome=" + nome + ", preco=" + preco + "}";
    }
}
