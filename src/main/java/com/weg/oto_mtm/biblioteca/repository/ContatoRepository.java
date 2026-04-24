package com.weg.oto_mtm.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weg.oto_mtm.biblioteca.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long>{

}
