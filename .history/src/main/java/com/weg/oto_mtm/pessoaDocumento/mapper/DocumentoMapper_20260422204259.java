package com.weg.oto_mtm.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.weg.oto_mtm.model.Documento;
import com.weg.oto_mtm.pessoaDocumento.dto.documento.DocumentoRequisicaoDTO;
import com.weg.oto_mtm.pessoaDocumento.dto.documento.DocumentoRespostaDTO;

@Component
public class DocumentoMapper {

    public Documento DTOParaEntidade(DocumentoRequisicaoDTO documento){
        return new Documento(documento.numero(), 
                             documento.tipo());
    }

    public DocumentoRespostaDTO EntidadeParaDTO(Documento documento){
        return new DocumentoRespostaDTO(documento.getId(), 
                                        documento.getNumero(),  
                                        documento.getTipo());
    }

    public List<DocumentoRespostaDTO> EntidadeParaDTOList(List<Documento> documentos){
        return documentos
            .stream()
            .map(this::EntidadeParaDTO)
            .toList();
    }
}
