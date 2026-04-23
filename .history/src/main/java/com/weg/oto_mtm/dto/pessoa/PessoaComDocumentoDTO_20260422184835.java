package com.weg.oto_mtm.dto.pessoa;

import com.weg.oto_mtm.dto.documento.DocumentoRespostaDTO;

public record PessoaComDocumentoDTO(
    PessoaRespostaDTO pessoa,
    DocumentoRespostaDTO documento
) {

}
