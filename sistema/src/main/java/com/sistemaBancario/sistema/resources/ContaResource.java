package com.sistemaBancario.sistema.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sistemaBancario.sistema.model.Conta;
import com.sistemaBancario.sistema.repositories.ContaRepository;


@RestController
@RequestMapping("/conta")
public class ContaResource {
	
	
	@Autowired
	 ContaRepository contaRepository;
	
	@GetMapping
	public List<Conta> get(){
		return contaRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Conta get(@PathVariable("id") Integer id) {
		return contaRepository.getOne(id);
	}
	
	@PostMapping
	public Conta save(@RequestBody Conta conta) {
		return contaRepository.save(conta);
	}
	
	@PutMapping
	public Conta update(@RequestBody Conta conta) {
		return contaRepository.save(conta);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		contaRepository.deleteById(id);
	}

}
