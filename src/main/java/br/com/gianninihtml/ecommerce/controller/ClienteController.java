package br.com.gianninihtml.ecommerce.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gianninihtml.ecommerce.dto.ClienteCreateDTO;
import br.com.gianninihtml.ecommerce.dto.ClienteDTO;
import br.com.gianninihtml.ecommerce.model.Cliente;
import br.com.gianninihtml.ecommerce.service.ClienteService;
import br.com.gianninihtml.ecommerce.repository.ClienteRepository;


@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@Autowired
	private ClienteRepository clienteRepository;

	
	@GetMapping
	public List<ClienteDTO> listAll() {
		List<ClienteDTO> result = 
				clienteService.list()
				.stream()
				.map(ClienteDTO::toDto)
				.collect(Collectors.toList());
		return result;
	}

	@PostMapping
	public Cliente create(@RequestBody ClienteDTO dto) {

		Cliente cliente = new Cliente();

		cliente.setNome(dto.getNome());
		cliente.setCep(dto.getCep());
		cliente.setInscricao_federal(dto.getInscricao_federal());

		Cliente result = clienteService.save(cliente);
		return result;
	}

	@PutMapping
	public Cliente update(@RequestBody ClienteCreateDTO dto) {

		if (!clienteRepository.existsById(dto.getCodigo_cliente())) {
			throw new RuntimeException("Clinte não encontrado " + dto.getCodigo_cliente());
		}
		Cliente cliente = new Cliente();
		cliente.setCodigo_cliente(dto.getCodigo_cliente());
		cliente.setNome(dto.getNome());
		cliente.setInscricao_federal(dto.getInscricao_federal());
		cliente.setCep(dto.getCep());

		Cliente result = clienteService.save(cliente);
		return result;
	}

	@DeleteMapping(value = "{id}")
	public void delete(@PathVariable Long id) {
		clienteRepository.deleteById(id);
	}

}
