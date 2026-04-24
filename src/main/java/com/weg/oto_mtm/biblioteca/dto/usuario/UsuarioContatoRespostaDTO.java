package com.weg.oto_mtm.biblioteca.dto.usuario;

import com.weg.oto_mtm.biblioteca.dto.contato.ContatoRespostaDTO;

public record UsuarioContatoRespostaDTO(
    UsuarioRespostaDTO usuario,
    ContatoRespostaDTO contato
) {

}
