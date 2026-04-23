package com.weg.oto_mtm.cursoAluno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weg.oto_mtm.cursoAluno.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{

}
