package com.weg.oto_mtm.dto.pessoa;

import com.weg.oto_mtm.model.Documento;

public record PessoaRequisicaoDTO(
    Long id,
    String nome,
    Documento documento
) {

}
