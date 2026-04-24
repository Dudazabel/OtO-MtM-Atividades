package com.weg.oto_mtm.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weg.oto_mtm.biblioteca.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long{

}
