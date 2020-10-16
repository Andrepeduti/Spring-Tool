package com.projetoIntegrador.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoIntegrador.model.modelUsuario;


@Repository
public interface repositoryUsuario extends JpaRepository<modelUsuario, Long>{
	public List<modelUsuario> findAllByNomeCompletoContainingIgnoreCase(String nomeCompleto);

}
