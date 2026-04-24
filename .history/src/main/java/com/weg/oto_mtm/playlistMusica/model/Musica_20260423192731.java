package com.weg.oto_mtm.playlistMusica.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "musica")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String artista;

    @ManyToMany(mappedBy = "musicas")
    private List<Playlist> playlists = new ArrayList<>();

    public Musica(String nome, String artista) {
        this.nome = nome;
        this.artista = artista;
    }
}
