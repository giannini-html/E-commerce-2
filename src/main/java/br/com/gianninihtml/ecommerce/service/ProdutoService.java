package br.com.gianninihtml.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.gianninihtml.ecommerce.model.Produto;
import br.com.gianninihtml.ecommerce.repository.ProdutoRepository;

@Repository
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> list() {
		return produtoRepository.findAll();
	}
	
	public Produto save(Produto produto) {			
		return produtoRepository.save(produto);
	}
	
	public void delete(Produto produto) {			
		produtoRepository.delete(produto);
	}

}
