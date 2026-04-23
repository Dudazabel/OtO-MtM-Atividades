package com.weg.oto_mtm.cursoAluno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weg.oto_mtm.cursoAluno.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}
