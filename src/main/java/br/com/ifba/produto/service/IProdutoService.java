package br.com.ifba.produto.service;

import br.com.ifba.produto.entity.Produto;
import java.util.List;

public interface IProdutoService {

    // Salvar (Create)
    Produto saveProduct(Produto Produto);

    // Listar Todos (Read)
    List<Produto> getAllProducts();

    // Buscar por ID (Read)
    Produto getProductById(Long id);

    // Atualizar (Update)
    Produto updateProduct(Long id, Produto product);

    // Deletar (Delete)
    void deleteProduct(Long id);
}
