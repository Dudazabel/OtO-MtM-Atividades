package com.weg.oto_mtm.pessoaDocumento.dto.pessoa;

import com.weg.oto_mtm.pessoaDocumento.dto.documento.DocumentoRespostaDTO;

public record PessoaComDocumentoDTO(
    PessoaRespostaDTO pessoa,
    DocumentoRespostaDTO documento
) {

}
