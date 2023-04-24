package br.com.gianninihtml.ecommerce.dto;

import br.com.gianninihtml.ecommerce.model.Cliente;

public class ClienteDTO {
	
	private Long codigo_cliente;
	private String nome;
	private String inscricao_federal;
	private Long cep;
	
	public Long getCodigo_cliente() {
		return codigo_cliente;
	}
	public void setCodigo_cliente(Long codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getInscricao_federal() {
		return inscricao_federal;
	}
	public void setInscricao_federal(String inscricao_federal) {
		this.inscricao_federal = inscricao_federal;
	}
	public Long getCep() {
		return cep;
	}
	public void setCep(Long cep) {
		this.cep = cep;
	}
	
	public static ClienteDTO toDto(Cliente cliente) {
		ClienteDTO dto = new ClienteDTO();
		dto.setCodigo_cliente(cliente.getCodigo_cliente());
		dto.setNome(cliente.getNome());		
		dto.setCep(cliente.getCep());		
		dto.setInscricao_federal(cliente.getInscricao_federal());		
		return dto;
	}
}
