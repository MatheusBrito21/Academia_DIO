package com.dio.academia.model.dtos;

import java.time.LocalDate;

import com.dio.academia.model.Aluno;
import com.dio.academia.model.Matricula;
import com.fasterxml.jackson.annotation.JsonFormat;


public class MatriculaDTO {
	
	private long id;
	private Aluno aluno;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataMatricula;
	
	public MatriculaDTO() {}
	
	public MatriculaDTO(Matricula mat) {
		super();
		this.id = mat.getId();
		this.aluno = mat.getAluno();
		this.dataMatricula = mat.getDataMatricula();
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
