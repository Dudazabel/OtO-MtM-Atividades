package com.weg.oto_mtm.playlistMusica.service;

import org.springframework.stereotype.Service;

import com.weg.oto_mtm.playlistMusica.dto.musica.MusicaRequisicaoDTO;
import com.weg.oto_mtm.playlistMusica.dto.musica.MusicaRespostaDTO;
import com.weg.oto_mtm.playlistMusica.mapper.MusicaMapper;
import com.weg.oto_mtm.playlistMusica.model.Musica;
import com.weg.oto_mtm.playlistMusica.repository.MusicaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MusicaService {

    private final MusicaRepository repository;
    private final MusicaMapper mapper;

    public MusicaRespostaDTO cadastrarMusica(MusicaRequisicaoDTO musica){
        Musica musicaSalva = mapper.DTOParaEntidade(musica);

        return mapper.EntidadeParaDTO(repository.save(musicaSalva));
    }
}
