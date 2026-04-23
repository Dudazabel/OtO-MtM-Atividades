package com.weg.oto_mtm.dto.pessoa;

import com.weg.oto_mtm.model.Documento;

public record PessoaRequisicaoDTO(
    String nome,
    Documento documento
) {

}
