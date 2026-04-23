package com.weg.oto_mtm.playlistMusica.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    }
    
}
