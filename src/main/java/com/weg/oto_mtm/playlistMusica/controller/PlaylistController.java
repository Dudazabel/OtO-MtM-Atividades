package com.weg.oto_mtm.playlistMusica.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weg.oto_mtm.playlistMusica.dto.playlist.PlaylistMusicaRespostaDTO;
import com.weg.oto_mtm.playlistMusica.dto.playlist.PlaylistRequisicaoDTO;
import com.weg.oto_mtm.playlistMusica.dto.playlist.PlaylistRespostaDTO;
import com.weg.oto_mtm.playlistMusica.service.PlaylistService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/playlist")
public class PlaylistController {

    private final PlaylistService service;

    @PostMapping
    public ResponseEntity<PlaylistRespostaDTO> cadastrarPlaylist(@Valid @RequestBody PlaylistRequisicaoDTO playlist){
        PlaylistRespostaDTO playlistResp = service.cadastrarPlaylist(playlist);

        return ResponseEntity.status(HttpStatus.CREATED).body(playlistResp);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<PlaylistMusicaRespostaDTO> buscarPlaylist(@PathVariable Long id){
        return ResponseEntity.ok(service.buscarPlaylist(id));
    }

    @PostMapping("/idPlaylist/{idPlaylist}/idMusica/{idMusica}")
    public ResponseEntity<PlaylistMusicaRespostaDTO> adicionarMusica(@PathVariable Long idPlaylist, @PathVariable Long idMusica){
        PlaylistMusicaRespostaDTO playlistMusica = service.adicionarMusica(idPlaylist, idMusica);

        return ResponseEntity.status(HttpStatus.CREATED).body(playlistMusica);
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<Void> deletarMusica(@PathVariable Long id){
        service.deletarPlaylist(id);
        return ResponseEntity.noContent().build();
    }
    
}
