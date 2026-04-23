package com.weg.oto_mtm.dto.pessoa;

import com.weg.oto_mtm.dto.documento.DocumentoRequisicaoDTO;

public record PessoaRequisicaoDTO(
    String nome,
    DocumentoRequisicaoDTO documento
) {

}
