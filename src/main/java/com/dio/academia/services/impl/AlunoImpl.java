package com.dio.academia.services.impl;

import java.util.List;

import com.dio.academia.model.Aluno;
import com.dio.academia.model.dtos.AlunoDTO;

public interface AlunoImpl {
	public Aluno getById(Long id);
	
	public List<Aluno>getAll();
	
	public Aluno create(AlunoDTO aluno);

	public Aluno update(Long id,AlunoDTO aluno);
	
	public void deleteById(Long id);
	
	
	
}
