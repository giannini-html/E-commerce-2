package br.com.gianninihtml.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "itens_pedido")
public class ItemPedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long codigoItemPedido;

	public Long getCodigoItemPedido() {
		return codigoItemPedido;
	}

	public void setCodigoItemPedido(Long codigoItemPedido) {
		this.codigoItemPedido = codigoItemPedido;
	}
}
