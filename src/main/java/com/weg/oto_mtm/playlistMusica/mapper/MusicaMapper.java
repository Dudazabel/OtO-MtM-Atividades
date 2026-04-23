package com.weg.oto_mtm.playlistMusica.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.weg.oto_mtm.playlistMusica.dto.musica.MusicaRequisicaoDTO;
import com.weg.oto_mtm.playlistMusica.dto.musica.MusicaRespostaDTO;
import com.weg.oto_mtm.playlistMusica.model.Musica;

@Component
public class MusicaMapper {

    public Musica DTOParaEntidade(MusicaRequisicaoDTO musica){
        return new Musica(musica.nome(), musica.artista());
    }

    public MusicaRespostaDTO EntidadeParaDTO(Musica musica){
        return new MusicaRespostaDTO(musica.getId(), musica.getNome(), musica.getArtista());
    }

    public List<MusicaRespostaDTO> EntidadeParaDTOList(List<Musica> musicas){
        return musicas
            .stream()
            .map(this::EntidadeParaDTO)
            .toList();
    }
}
