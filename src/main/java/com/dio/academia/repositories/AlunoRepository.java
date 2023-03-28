package com.dio.academia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.academia.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
