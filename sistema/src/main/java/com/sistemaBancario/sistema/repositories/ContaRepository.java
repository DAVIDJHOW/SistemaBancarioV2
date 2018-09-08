package com.sistemaBancario.sistema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistemaBancario.sistema.model.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Integer>{

}
