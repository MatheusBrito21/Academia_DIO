package com.dio.academia.services.impl;

import java.util.List;

import com.dio.academia.model.Matricula;

public interface MatriculaImpl {
	public Matricula getById(Long id);
	
	public List<Matricula>getAll();
	
	public Matricula create(Long idAluno);
	
	public void deleteById(Long id);
	
	
	
}
