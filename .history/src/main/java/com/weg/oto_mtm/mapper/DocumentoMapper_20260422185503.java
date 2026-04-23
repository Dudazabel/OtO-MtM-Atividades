package com.weg.oto_mtm.mapper;

import org.springframework.stereotype.Component;

import com.weg.oto_mtm.dto.documento.DocumentoRequisicaoDTO;
import com.weg.oto_mtm.model.Documento;

@Component
public class DocumentoMapper {

    public Documento DTOParaEntidade(DocumentoRequisicaoDTO documento){
        return new Documento(documento.numero(), documento.)
    }
}
