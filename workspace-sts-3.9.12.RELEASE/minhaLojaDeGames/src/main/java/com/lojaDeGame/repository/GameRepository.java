package com.lojaDeGame.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojaDeGame.model.categoriaGames;



@Repository
public interface GameRepository extends JpaRepository<categoriaGames, Long>{
	public List<categoriaGames> findAllByNomeContainingIgnoreCase(String nome);
}
