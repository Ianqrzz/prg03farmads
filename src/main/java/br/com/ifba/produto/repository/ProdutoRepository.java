package br.com.ifba.produto.repository;

import br.com.ifba.produto.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

// A interface estende o JpaRepository, que já contém os métodos básicos de CRUD.
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}