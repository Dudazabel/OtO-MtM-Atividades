package com.weg.oto_mtm.playlistMusica.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weg.oto_mtm.playlistMusica.dto.musica.MusicaRequisicaoDTO;
import com.weg.oto_mtm.playlistMusica.dto.musica.MusicaRespostaDTO;
import com.weg.oto_mtm.playlistMusica.service.MusicaService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/musica")
@RequiredArgsConstructor
public class MusicaController {

    private final MusicaService service;

    @PostMapping
    public ResponseEntity<MusicaRespostaDTO> cadastrarMusica(@Valid @RequestBody MusicaRequisicaoDTO musica){
        MusicaRespostaDTO musicaResp = service.cadastrarMusica(musica);
        
        return ResponseEntity.status(HttpStatus.CREATED).body(musicaResp);
    }

}
