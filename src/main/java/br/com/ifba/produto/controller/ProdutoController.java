package br.com.ifba.produto.controller;

import br.com.ifba.produto.entity.Produto;
import br.com.ifba.produto.service.IProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; // Usamos @Controller ou @Component
import java.util.List;

@Controller
public class ProdutoController implements IProdutoController {

    @Autowired
    private IProdutoService produtoService;

    @Override
    public Produto save(Produto produto) {
        return produtoService.saveProduct(produto);
    }

    @Override
    public List<Produto> findAll() {
        return produtoService.getAllProducts();
    }

    @Override
    public Produto findById(Long id) {
        return produtoService.getProductById(id);
    }

    @Override
    public Produto update(Produto produto) {
        // Assume-se que o ID já está no objeto produto
        return produtoService.updateProduct(produto.getId(), produto);
    }

    @Override
    public void delete(Long id) {
        produtoService.deleteProduct(id);
    }
}
