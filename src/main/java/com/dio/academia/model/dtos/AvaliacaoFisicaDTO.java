package com.dio.academia.model.dtos;

import java.time.LocalDate;

import com.dio.academia.model.Aluno;
import com.dio.academia.model.AvaliacaoFisica;
import com.fasterxml.jackson.annotation.JsonFormat;

public class AvaliacaoFisicaDTO {
	
	private long id;
	private Aluno aluno;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataAvaliacao;
	private double peso;
	private double altura;
	
	public AvaliacaoFisicaDTO() {}
	
	public AvaliacaoFisicaDTO(AvaliacaoFisica av) {
		super();
		this.id = av.getId();
		this.aluno = av.getAluno();
		this.dataAvaliacao = av.getDataAvaliacao();
		this.peso = av.getPeso();
		this.altura = av.getAltura();
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
	public LocalDate getDataAvaliacao() {
		return dataAvaliacao;
	}
	public void setDataAvaliacao(LocalDate dataAvaliacao) {
		this.dataAvaliacao = dataAvaliacao;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	

}
