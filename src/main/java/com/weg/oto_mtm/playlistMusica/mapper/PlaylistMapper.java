package com.weg.oto_mtm.playlistMusica.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.weg.oto_mtm.playlistMusica.dto.musica.MusicaRespostaDTO;
import com.weg.oto_mtm.playlistMusica.dto.playlist.PlaylistMusicaRespostaDTO;
import com.weg.oto_mtm.playlistMusica.dto.playlist.PlaylistRequisicaoDTO;
import com.weg.oto_mtm.playlistMusica.dto.playlist.PlaylistRespostaDTO;
import com.weg.oto_mtm.playlistMusica.model.Playlist;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PlaylistMapper {

    private final MusicaMapper mapper;

    public Playlist DTOParaEntidade(PlaylistRequisicaoDTO playlist){
        return new Playlist(playlist.nome());
    }

    public PlaylistRespostaDTO EntidadeParaDTO(Playlist playlist){
        return new PlaylistRespostaDTO(playlist.getId(), playlist.getNome());
    }

    public List<PlaylistRespostaDTO> EntidadeParaDTOList(List<Playlist> playlists){
        return playlists
            .stream()
            .map(this::EntidadeParaDTO)
            .toList();
    }

    public PlaylistMusicaRespostaDTO PlaylistMusicaRespostaDTO(Playlist playlist){
        List<MusicaRespostaDTO> musicas = playlist.getMusicas()
                                                  .stream()
                                                  .map(mapper::EntidadeParaDTO)
                                                  .toList();
    
        PlaylistRespostaDTO playlistResp = EntidadeParaDTO(playlist);

        return new PlaylistMusicaRespostaDTO(playlistResp, musicas);
    }
}
