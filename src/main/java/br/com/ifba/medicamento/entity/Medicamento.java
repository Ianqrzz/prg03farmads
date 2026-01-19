package br.com.ifba.medicamento.entity;

import br.com.ifba.produto.entity.Produto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "medicamento")
@Data
@EqualsAndHashCode(callSuper = true) // Importante: true para considerar os campos do pai
@PrimaryKeyJoinColumn(name = "id") // Liga o ID da medicamento ao ID do produto
public class Medicamento extends Produto {

    @Column(name = "data_validade")
    private LocalDate dataValidade;

    @Column(name = "lote")
    private String lote;

    @Column(name = "principioAtivo")
    private String principioAtivo;

    @Column(name = "classificacaoLegal")
    private String classificacaoLegal;

}
