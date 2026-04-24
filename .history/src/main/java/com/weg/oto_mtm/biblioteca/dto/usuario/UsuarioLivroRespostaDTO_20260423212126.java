package com.weg.oto_mtm.biblioteca.dto.usuario;

import java.util.List;

import com.weg.oto_mtm.biblioteca.model.Livro;

public record UsuarioLivroRespostaDTO(
    UsuarioRespostaDTO usuario,
    List<Livro> livros
) {

}
