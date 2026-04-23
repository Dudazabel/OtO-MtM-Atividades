package com.weg.oto_mtm.playlistMusica.service;

import org.springframework.stereotype.Service;

import com.weg.oto_mtm.playlistMusica.dto.playlist.PlaylistMusicaRespostaDTO;
import com.weg.oto_mtm.playlistMusica.dto.playlist.PlaylistRequisicaoDTO;
import com.weg.oto_mtm.playlistMusica.dto.playlist.PlaylistRespostaDTO;
import com.weg.oto_mtm.playlistMusica.mapper.PlaylistMapper;
import com.weg.oto_mtm.playlistMusica.model.Musica;
import com.weg.oto_mtm.playlistMusica.model.Playlist;
import com.weg.oto_mtm.playlistMusica.repository.MusicaRepository;
import com.weg.oto_mtm.playlistMusica.repository.PlaylistRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PlaylistService {

    private final PlaylistRepository repository;
    private final MusicaRepository musicaRepository;
    private final PlaylistMapper mapper;

    public PlaylistRespostaDTO cadastrarPlaylist(PlaylistRequisicaoDTO playlist){
        Playlist playlistSalva = mapper.DTOParaEntidade(playlist);

        return mapper.EntidadeParaDTO(repository.save(playlistSalva));
    }

    public PlaylistMusicaRespostaDTO buscarPlaylist(Long id){
        Playlist playlistResp = repository.findById(id)
        .orElseThrow(() -> new RuntimeException("Playlist não encontrada!"));

        return mapper.PlaylistMusicaRespostaDTO(playlistResp);
    }

    public PlaylistMusicaRespostaDTO adicionarMusica(Long idPlaylist, Long idMusica){
        Playlist playlist = repository.findById(idPlaylist)
        .orElseThrow(() -> new RuntimeException("Playlist não encontrada!"));

        Musica musica = musicaRepository.findById(idMusica)
        .orElseThrow(() -> new RuntimeException("Música não encontrada!"));

        playlist.getMusicas().add(musica);

        return mapper.PlaylistMusicaRespostaDTO(repository.save(playlist));
    }
}
