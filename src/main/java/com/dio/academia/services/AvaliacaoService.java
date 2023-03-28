package com.dio.academia.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.academia.model.Aluno;
import com.dio.academia.model.AvaliacaoFisica;
import com.dio.academia.model.dtos.AvaliacaoFisicaDTO;
import com.dio.academia.repositories.AvaliacaoRepository;
import com.dio.academia.services.impl.AvaliacaoImpl;

@Service
public class AvaliacaoService implements AvaliacaoImpl{
	
	@Autowired
	AvaliacaoRepository repository;
	@Autowired
	MatriculaService matriculaService;
	
	@Override
	public AvaliacaoFisica getById(Long id) {
		Optional<AvaliacaoFisica> a= repository.findById(id);
		return a.orElseThrow(()-> new RuntimeException("Avaliação não encontrada!"));
	}

	@Override
	public List<AvaliacaoFisica> getAll() {
		return repository.findAll();
	}
	@Override
	public AvaliacaoFisica create(AvaliacaoFisicaDTO av, Long idAluno) {
		Aluno aluno = matriculaService.getById(idAluno).getAluno();
		AvaliacaoFisica avaliacao = new AvaliacaoFisica(av);
		avaliacao.setAluno(aluno);
		return repository.save(avaliacao);
	}

	@Override
	public AvaliacaoFisica update(Long id, AvaliacaoFisicaDTO av) {
		Aluno aluno = matriculaService.getById(id).getAluno();
		AvaliacaoFisica avaliacao = new AvaliacaoFisica(av);
		avaliacao.setAluno(aluno);
		return repository.save(avaliacao);
	}


	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}


	
}
