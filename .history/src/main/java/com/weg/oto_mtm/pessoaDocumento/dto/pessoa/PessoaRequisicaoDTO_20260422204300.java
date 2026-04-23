package com.weg.oto_mtm.pessoaDocumento.dto.pessoa;

import com.weg.oto_mtm.pessoaDocumento.dto.documento.DocumentoRequisicaoDTO;

public record PessoaRequisicaoDTO(
    String nome,
    DocumentoRequisicaoDTO documento
) {

}
