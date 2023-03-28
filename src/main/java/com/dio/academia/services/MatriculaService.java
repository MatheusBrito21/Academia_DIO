package com.dio.academia.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.academia.model.Aluno;
import com.dio.academia.model.Matricula;
import com.dio.academia.repositories.MatriculaRepository;
import com.dio.academia.services.impl.MatriculaImpl;

@Service
public class MatriculaService implements MatriculaImpl{
	@Autowired
	MatriculaRepository repository;
	@Autowired
	AlunoService alunoService;
		
	@Override
	public Matricula getById(Long id) {
		Optional<Matricula>mat= repository.findById(id);
		return mat.orElseThrow(()-> new RuntimeException("Matricula não encontrada!"));
	}

	@Override
	public List<Matricula> getAll() {
		return repository.findAll();
	}

	@Override
	public Matricula create(Long idAluno) {
		Aluno aluno = alunoService.getById(idAluno);
		
		Matricula mat = new Matricula();
		mat.setDataMatricula(LocalDate.now());
		mat.setAluno(aluno);
		
		return repository.save(mat);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}
	



	
}
