package br.com.gianninihtml.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gianninihtml.ecommerce.model.Produto;
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
