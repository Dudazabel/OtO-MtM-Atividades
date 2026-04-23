package com.weg.oto_mtm.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.weg.oto_mtm.dto.documento.DocumentoRespostaDTO;
import com.weg.oto_mtm.dto.pessoa.PessoaComDocumentoDTO;
import com.weg.oto_mtm.dto.pessoa.PessoaRequisicaoDTO;
import com.weg.oto_mtm.dto.pessoa.PessoaRespostaDTO;
import com.weg.oto_mtm.model.Pessoa;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PessoaMapper {

    private final DocumentoMapper mapper;

    public Pessoa DTOParaEntidade(PessoaRequisicaoDTO pessoa){
        return new Pessoa(pessoa.nome());
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

        return new PessoaComDocumentoDTO()
    }
}
