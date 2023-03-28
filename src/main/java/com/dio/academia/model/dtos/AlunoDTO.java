package com.dio.academia.model.dtos;

import java.time.LocalDate;
import java.util.List;

import com.dio.academia.model.Aluno;
import com.dio.academia.model.AvaliacaoFisica;
import com.fasterxml.jackson.annotation.JsonFormat;

public class AlunoDTO {
	private long id;
	private String nome;
	private String cpf;
	private String bairro;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataNascimento;
	private List<AvaliacaoFisica> avaliacoes;
	
	public AlunoDTO() {}
	
	public AlunoDTO(Aluno a) {
		super();
		this.id = a.getId();
		this.nome = a.getNome();
		this.cpf = a.getCpf();
		this.bairro = a.getBairro();
		this.dataNascimento = a.getDataNascimento();
		this.avaliacoes = a.getAvaliacoes();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public List<AvaliacaoFisica> getAvaliacoes() {
		return avaliacoes;
	}
	public void setAvaliacoes(List<AvaliacaoFisica> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}
	
	
}
