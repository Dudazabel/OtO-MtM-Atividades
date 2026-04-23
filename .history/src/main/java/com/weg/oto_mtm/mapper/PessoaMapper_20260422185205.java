package com.weg.oto_mtm.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.weg.oto_mtm.dto.pessoa.PessoaRequisicaoDTO;
import com.weg.oto_mtm.dto.pessoa.PessoaRespostaDTO;
import com.weg.oto_mtm.model.Pessoa;

@Component
public class PessoaMapper {

    public Pessoa DTOParaEntidade(PessoaRequisicaoDTO pessoa){
        return new Pessoa(pessoa.nome());
    }

    public PessoaRespostaDTO EntidadeParaDTO(Pessoa pessoa){
        return new PessoaRespostaDTO(pessoa.getId(), pessoa.getNome());
    }

    public List
}
