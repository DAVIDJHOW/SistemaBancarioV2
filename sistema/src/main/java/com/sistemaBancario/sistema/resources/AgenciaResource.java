package com.sistemaBancario.sistema.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sistemaBancario.sistema.model.Agencia;
import com.sistemaBancario.sistema.repositories.AgenciaRepository;

@RestController
@RequestMapping("/agencia")
public class AgenciaResource {
	
	@Autowired
	AgenciaRepository agenciaRepository;
	
	@GetMapping
	public List<Agencia> get(){
		return agenciaRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Agencia get(@PathVariable("id") Integer id) {
		return agenciaRepository.getOne(id);
	}
	
	@PostMapping
	public Agencia save(@RequestBody Agencia agencia) {
		return agenciaRepository.save(agencia);
	}
	
	@PutMapping
	public Agencia update(@RequestBody Agencia agencia) {
		return agenciaRepository.save(agencia);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		agenciaRepository.deleteById(id);
	}

}

