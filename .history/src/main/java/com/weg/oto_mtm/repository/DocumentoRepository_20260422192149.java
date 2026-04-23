package com.weg.oto_mtm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weg.oto_mtm.model.Documento;

@Repository
public interface DocumentoRepository extends JpaRepository<Documento, Long>{

    Optional<Documento> find
}
