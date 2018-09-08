package com.sistemaBancario.sistema.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sistemaBancario.sistema.model.Cliente;
import com.sistemaBancario.sistema.repositories.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteResource {
	
	
	@Autowired
    ClienteRepository clienteRepository;
	
	@GetMapping
	public List<Cliente> get(){
		return clienteRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Cliente get(@PathVariable("id") Integer id) {
		return clienteRepository.getOne(id);
	}
	
	@PostMapping
	public Cliente save(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@PutMapping
	public Cliente update(@RequestBody Cliente agencia) {
		return clienteRepository.save(agencia);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		clienteRepository.deleteById(id);
	}


}

