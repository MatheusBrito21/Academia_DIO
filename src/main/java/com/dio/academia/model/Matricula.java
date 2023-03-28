package com.dio.academia.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.dio.academia.model.dtos.MatriculaDTO;

@Entity
@Table(name = "tb_matricula")
public class Matricula {
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private long id;
	@OneToOne
	private Aluno aluno;
	private LocalDate dataMatricula;
	
	public Matricula() {}
	
	public Matricula(MatriculaDTO matDTO) {
		super();
		this.id = matDTO.getId();
		this.aluno = matDTO.getAluno();
		this.dataMatricula = matDTO.getDataMatricula();
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public LocalDate getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(LocalDate dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	
	
}
