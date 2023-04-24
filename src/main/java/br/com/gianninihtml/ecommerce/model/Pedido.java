package br.com.gianninihtml.ecommerce.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long numero_pedido;
	
	@Column(name = "codigo_cliente")
	private Long codigo_cliente;
	
	@Column(name = "data_pedido")
	private LocalDate data_pedido;

	public Long getNumero_pedido() {
		return numero_pedido;
	}

	public void setNumero_pedido(Long numero_pedido) {
		this.numero_pedido = numero_pedido;
	}

	public Long getCodigo_cliente() {
		return codigo_cliente;
	}

	public void setCodigo_cliente(Long codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}

	public LocalDate getData_pedido() {
		return data_pedido;
	}

	public void setData_pedido(LocalDate data_pedido) {
		this.data_pedido = data_pedido;
	}
}
