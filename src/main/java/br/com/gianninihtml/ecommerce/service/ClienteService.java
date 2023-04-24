package br.com.gianninihtml.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.gianninihtml.ecommerce.model.Cliente;
import br.com.gianninihtml.ecommerce.repository.ClienteRepository;

@Repository
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> list() {
		return clienteRepository.findAll();
	}
	
	public Cliente save(Cliente cliente) {			
		return clienteRepository.save(cliente);
	}
	
	public void delete(Cliente cliente) {			
		clienteRepository.delete(cliente);
	}

}
