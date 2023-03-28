package com.dio.academia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.academia.model.AvaliacaoFisica;

public interface AvaliacaoRepository extends JpaRepository<AvaliacaoFisica, Long> {

}
