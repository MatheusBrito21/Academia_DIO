package com.dio.academia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.academia.model.Matricula;
import com.dio.academia.model.dtos.MatriculaDTO;
import com.dio.academia.services.MatriculaService;

@RestController
@RequestMapping(path = "/matricula")
public class MatriculaController {
	
	@Autowired
	MatriculaService service;
	
	@GetMapping
	public List<Matricula> getAll(){
		return service.getAll() ;
	}
	
	@GetMapping(path = "/{id}")
	public Matricula getById(@PathVariable Long id){
		return service.getById(id);
	}
	
	@PostMapping(path="/{id}")
	public MatriculaDTO create(@PathVariable Long id) {
		Matricula mat = service.create(id);
		return new MatriculaDTO(mat);
	}
	
	@DeleteMapping(path="/{id}")
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}
}
