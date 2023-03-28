package com.dio.academia.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.academia.model.Aluno;
import com.dio.academia.model.dtos.AlunoDTO;
import com.dio.academia.repositories.AlunoRepository;
import com.dio.academia.services.impl.AlunoImpl;

@Service
public class AlunoService implements AlunoImpl{
	
	@Autowired
	AlunoRepository repository;
	
	@Override
	public Aluno getById(Long id) {
		Optional<Aluno> a= repository.findById(id);
		return a.orElseThrow(()-> new RuntimeException("Aluno não encontrado!"));
	}

	@Override
	public List<Aluno> getAll() {
		return repository.findAll();
	}

	@Override
	public Aluno create(AlunoDTO aluno) {
		Aluno novo = new Aluno(aluno);
		return repository.save(novo);
	}

	@Override
	public Aluno update(Long id,AlunoDTO aluno) {
		aluno.setId(id);
		Aluno a = getById(id);
		a = new Aluno(aluno);
		
		return repository.save(a) ;
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}


	
}
