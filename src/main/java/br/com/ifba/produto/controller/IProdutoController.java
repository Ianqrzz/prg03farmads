package br.com.ifba.produto.controller;

import br.com.ifba.produto.entity.Produto;
import java.util.List;

public interface IProdutoController {

    Produto save(Produto produto);

    List<Produto> findAll();

    Produto findById(Long id);

    Produto update(Produto produto);

    void delete(Long id);
}
