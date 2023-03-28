package com.dio.academia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.academia.model.Aluno;
import com.dio.academia.model.dtos.AlunoDTO;
import com.dio.academia.services.AlunoService;

@RestController
@RequestMapping(path = "/aluno")
public class AlunoController {
	
	@Autowired
	AlunoService service;
	
	@GetMapping(path="/{id}")
	public AlunoDTO getById(@PathVariable Long id){
		Aluno a = service.getById(id);
		AlunoDTO aDTO = new AlunoDTO(a);
		return aDTO;
	}
	@GetMapping
	public List<Aluno>getAll(){
		return service.getAll();
	}
	
	@PostMapping
	public AlunoDTO create(@RequestBody AlunoDTO a) {
		Aluno aluno = service.create(a);
		AlunoDTO aDTO = new AlunoDTO(aluno);
		return aDTO;
	}
	
	@PutMapping(path= "/{id}")
	public AlunoDTO update(@PathVariable Long id, @RequestBody AlunoDTO a) {
		Aluno aluno = service.update(id, a);
		return new AlunoDTO(aluno) ;
	}
	
	@DeleteMapping(path="/{id}")
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}
	
}
