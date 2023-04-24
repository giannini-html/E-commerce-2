package br.com.gianninihtml.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.gianninihtml.ecommerce.model.ItemPedido;
import br.com.gianninihtml.ecommerce.repository.ItemPedidoRepository;

@Repository
public class ItemPedidoService {
	
	@Autowired
	private ItemPedidoRepository itemPedidoRepository;
	
	public List<ItemPedido> list() {
		return itemPedidoRepository.findAll();
	}
	
	public ItemPedido save(ItemPedido itemPedido) {			
		return itemPedidoRepository.save(itemPedido);
	}
	
	public void delete(ItemPedido itemPedido) {			
		itemPedidoRepository.delete(itemPedido);
	}
}
