package com.weg.oto_mtm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.weg.oto_mtm.dto.documento.DocumentoRequisicaoDTO;
import com.weg.oto_mtm.dto.documento.DocumentoRespostaDTO;
import com.weg.oto_mtm.mapper.DocumentoMapper;
import com.weg.oto_mtm.model.Documento;
import com.weg.oto_mtm.repository.DocumentoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DocumentoService {

    private final DocumentoMapper mapper;
    private final DocumentoRepository repository;

    public DocumentoRespostaDTO cadastrarDocumento(DocumentoRequisicaoDTO documentoRequisicao){
        Documento documento = mapper.DTOParaEntidade(documentoRequisicao);

        return mapper.EntidadeParaDTO(repository.save(documento));
    }

    public List<DocumentoRespostaDTO> listarDocumentos(){
        return mapper.EntidadeParaDTOList(repository.findAll())
    }

}
