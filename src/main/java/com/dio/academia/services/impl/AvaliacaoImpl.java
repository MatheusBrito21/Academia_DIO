package com.dio.academia.services.impl;

import java.util.List;

import com.dio.academia.model.AvaliacaoFisica;
import com.dio.academia.model.dtos.AvaliacaoFisicaDTO;

public interface AvaliacaoImpl {
	public AvaliacaoFisica getById(Long id);
	
	public List<AvaliacaoFisica>getAll();
	
	
	public AvaliacaoFisica create(AvaliacaoFisicaDTO av, Long idAluno);

	public AvaliacaoFisica update(Long id,AvaliacaoFisicaDTO av);
	
	public void deleteById(Long id);
	
	
	
}
