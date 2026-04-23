package com.weg.oto_mtm.playlistMusica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weg.oto_mtm.playlistMusica.model.Musica;

@Repository
public interface MusicaRepository extends JpaRepository<Musica, Long>{

}
