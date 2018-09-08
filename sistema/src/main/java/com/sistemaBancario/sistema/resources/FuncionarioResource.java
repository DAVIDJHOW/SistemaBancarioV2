package com.sistemaBancario.sistema.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sistemaBancario.sistema.model.Funcionario;
import com.sistemaBancario.sistema.repositories.FuncionarioRepository;


@RestController
@RequestMapping("/funcionario")
public class FuncionarioResource {
	
	@Autowired
	FuncionarioRepository funcionarioRepository;
	
	@GetMapping
	public List<Funcionario> get(){
		return funcionarioRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Funcionario get(@PathVariable("id") Integer id) {
		return funcionarioRepository.getOne(id);
	}
	
	@PostMapping
	public Funcionario save(@RequestBody Funcionario func) {
		return funcionarioRepository.save(func);
	}
	
	@PutMapping
	public Funcionario update(@RequestBody Funcionario func) {
		return funcionarioRepository.save(func);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		funcionarioRepository.deleteById(id);
	}


}

