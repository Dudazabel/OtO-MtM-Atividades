package com.weg.oto_mtm.dto.pessoa;

import com.weg.oto_mtm.dto.documento.DocumentoRespostaDTO;
import com.weg.oto_mtm.model.Documento;

public record PessoaRespostaDTO(
    Long id,
    String nome,
    DocumentoRespostaDTO documento
) {

}
