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

import com.dio.academia.model.AvaliacaoFisica;
import com.dio.academia.model.dtos.AvaliacaoFisicaDTO;
import com.dio.academia.services.AvaliacaoService;

@RestController
@RequestMapping(path="/avaliacao")
public class AvaliacaoController {
	@Autowired
	AvaliacaoService service;
	
	@GetMapping
	public List<AvaliacaoFisica>getAll(){
		return service.getAll();
	}
	
	@PostMapping(path="/{id}")
	public AvaliacaoFisicaDTO create(@RequestBody AvaliacaoFisicaDTO avDTO,@PathVariable Long id) {
		AvaliacaoFisica av = service.create(avDTO, id);
		return new AvaliacaoFisicaDTO(av);
	}
	
	@PutMapping(path="/{id}")
	public AvaliacaoFisicaDTO update(@RequestBody AvaliacaoFisicaDTO avDTO,@PathVariable Long id) {
		AvaliacaoFisica av = service.update(id, avDTO);
		return new AvaliacaoFisicaDTO(av);
	}
	
	@DeleteMapping(path="/{id}")
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}
	
	
	
}
