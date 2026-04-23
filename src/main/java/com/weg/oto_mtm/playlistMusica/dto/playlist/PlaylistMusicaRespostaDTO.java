package com.weg.oto_mtm.playlistMusica.dto.playlist;

import java.util.List;

import com.weg.oto_mtm.playlistMusica.dto.musica.MusicaRespostaDTO;

public record PlaylistMusicaRespostaDTO(
    PlaylistRespostaDTO playlist,
    List<MusicaRespostaDTO> musicas
) {

}
