package br.com.gianninihtml.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.gianninihtml.ecommerce.model.Pedido;
import br.com.gianninihtml.ecommerce.repository.PedidoRepository;

@Repository
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public List<Pedido> list() {
		return pedidoRepository.findAll();
	}
	
	public Pedido save(Pedido pedido) {			
		return pedidoRepository.save(pedido);
	}
	
	public void delete(Pedido pedido) {			
		pedidoRepository.delete(pedido);
	}

}
