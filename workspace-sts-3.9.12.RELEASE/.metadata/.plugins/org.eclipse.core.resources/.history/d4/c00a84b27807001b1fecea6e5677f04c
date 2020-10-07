package com.minhaEscola.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.internal.NotNull;




@Entity
@Table(name = "alunos")
public class AlunoModel {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

	@Column
	@NotNull
	private String nome;

	@Column
	@NotNull
	private boolean matricula;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isMatricula() {
		return matricula;
	}

	public void setMatricula(boolean matricula) {
		this.matricula = matricula;
	}
}
