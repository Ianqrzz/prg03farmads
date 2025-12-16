package br.com.ifba.produto.entity;

import br.com.ifba.infraestructure.entity.PersistenceEntity;
import jakarta.persistence.Entity;

@Entity
public class Produto  extends PersistenceEntity{
    private String nome;
    private double preco;

    // Construtor vazio obrigatório
    public Produto() {
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

    @Override
    public String toString() {
        return "Produto{id=" + this.getId() + ", nome=" + nome + ", preco=" + preco + "}";
    }
}