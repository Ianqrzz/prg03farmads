package br.com.ifba.produto.service;

import br.com.ifba.produto.entity.Produto;
import br.com.ifba.produto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.logging.Logger;

@Service
public class ProdutoService implements IProdutoService {

    // Logger manual (substituindo @Slf4j)
    private static final Logger log = Logger.getLogger(ProdutoService.class.getName());

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public Produto saveProduct(Produto produto) {
        log.info("SERVICE: Salvando produto: " + produto.getNome());
        return produtoRepository.save(produto);
    }

    @Override
    public List<Produto> getAllProducts() {
        log.info("SERVICE: Listando todos os produtos");
        return produtoRepository.findAll();
    }

    @Override
    public Produto getProductById(Long id) {
        log.info("SERVICE: Buscando produto ID: " + id);
        return produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado para o ID: " + id));
    }

    @Override
    public Produto updateProduct(Long id, Produto produtoDetails) {
        log.info("SERVICE: Atualizando produto ID: " + id);

        Produto existingProduto = getProductById(id);

        existingProduto.setNome(produtoDetails.getNome());
        existingProduto.setPreco(produtoDetails.getPreco());

        return produtoRepository.save(existingProduto);
    }

    @Override
    public void deleteProduct(Long id) {
        log.info("SERVICE: Deletando produto ID: " + id);
        if (!produtoRepository.existsById(id)) {
            throw new RuntimeException("Produto não encontrado para o ID: " + id);
        }
        produtoRepository.deleteById(id);
    }
}
