package com.weg.oto_mtm.mapper;

import org.springframework.stereotype.Component;

import com.weg.oto_mtm.dto.documento.DocumentoRequisicaoDTO;
import com.weg.oto_mtm.dto.documento.DocumentoRespostaDTO;
import com.weg.oto_mtm.model.Documento;

@Component
public class DocumentoMapper {

    public Documento DTOParaEntidade(DocumentoRequisicaoDTO documento){
        return new Documento(documento.numero(), 
                             documento.tipo());
    }

    public DocumentoRespostaDTO EntidadeParaDTO(Documento documento){
        return new DocumentoRespostaDTO(documento.getId(), 
                                        documento.getNumero(), documento.getTipo());
    }
}
