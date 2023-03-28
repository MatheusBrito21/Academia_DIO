package com.dio.academia.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dio.academia.model.dtos.AvaliacaoFisicaDTO;

@Entity
@Table(name = "tb_avaliacao")
public class AvaliacaoFisica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "aluno_id")
	private Aluno aluno;
	private LocalDate dataAvaliacao;
	private double peso;
	private double altura;
	
	public AvaliacaoFisica() {}

	public AvaliacaoFisica(AvaliacaoFisicaDTO av) {
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
