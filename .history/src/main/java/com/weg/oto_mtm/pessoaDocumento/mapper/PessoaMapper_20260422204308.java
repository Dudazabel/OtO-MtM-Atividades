package com.weg.oto_mtm.pessoaDocumento.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.weg.oto_mtm.pessoaDocumento.dto.documento.DocumentoRespostaDTO;
import com.weg.oto_mtm.pessoaDocumento.dto.pessoa.PessoaComDocumentoDTO;
import com.weg.oto_mtm.pessoaDocumento.dto.pessoa.PessoaRequisicaoDTO;
import com.weg.oto_mtm.pessoaDocumento.dto.pessoa.PessoaRespostaDTO;
import com.weg.oto_mtm.pessoaDocumento.model.Pessoa;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PessoaMapper {

    private final DocumentoMapper mapper;

    public Pessoa DTOParaEntidade(PessoaRequisicaoDTO pessoaRequisicao){
        Pessoa pessoa =  new Pessoa(pessoaRequisicao.nome());
        if(pessoaRequisicao.documento() != null){
            pessoa.setDocumento(mapper.DTOParaEntidade(pessoaRequisicao.documento()));
        }

        return pessoa;
    }

    public PessoaRespostaDTO EntidadeParaDTO(Pessoa pessoa){
        return new PessoaRespostaDTO(pessoa.getId(), 
                                     pessoa.getNome());
    }

    public List<PessoaRespostaDTO> EntidadeParaDTOList(List<Pessoa> pessoas){
        return pessoas
            .stream()
            .map(this::EntidadeParaDTO)
            .toList();
    }

    public PessoaComDocumentoDTO PessoaComDocumentoDTO(Pessoa pessoa){
        DocumentoRespostaDTO documentoResp = mapper.EntidadeParaDTO(pessoa.getDocumento());
        PessoaRespostaDTO pessoaResp = EntidadeParaDTO(pessoa);

        return new PessoaComDocumentoDTO(pessoaResp, documentoResp);
    }
}
