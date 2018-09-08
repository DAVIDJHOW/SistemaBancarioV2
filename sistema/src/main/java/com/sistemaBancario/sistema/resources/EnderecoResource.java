package com.sistemaBancario.sistema.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sistemaBancario.sistema.model.Endereco;
import com.sistemaBancario.sistema.repositories.EnderecoRepository;

@RestController
@RequestMapping("/endereco")
public class EnderecoResource {
	
	
	@Autowired
	 EnderecoRepository enderecoRepository;
	
	@GetMapping
	public List<Endereco> get(){
		return enderecoRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Endereco get(@PathVariable("id") Integer id) {
		return enderecoRepository.getOne(id);
	}
	
	@PostMapping
	public Endereco save(@RequestBody Endereco end) {
		return enderecoRepository.save(end);
	}
	
	@PutMapping
	public Endereco update(@RequestBody Endereco end) {
		return enderecoRepository.save(end);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		enderecoRepository.deleteById(id);
	}

}
