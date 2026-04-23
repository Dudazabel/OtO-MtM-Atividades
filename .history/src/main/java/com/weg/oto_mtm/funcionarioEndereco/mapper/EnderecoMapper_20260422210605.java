package com.weg.oto_mtm.funcionarioEndereco.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.weg.oto_mtm.funcionarioEndereco.dto.endereco.EnderecoRequisicaoDTO;
import com.weg.oto_mtm.funcionarioEndereco.dto.endereco.EnderecoRespostaDTO;
import com.weg.oto_mtm.funcionarioEndereco.model.Endereco;

@Component
public class EnderecoMapper {

    public Endereco DTOParaEntidade(EnderecoRequisicaoDTO enderecoRequisicao){
        return new Endereco(enderecoRequisicao.rua(), enderecoRequisicao.numero());
    }

    public EnderecoRespostaDTO EntidadeParaDTO(Endereco endereco){
        return new EnderecoRespostaDTO(endereco.getId(), endereco.getRua(), endereco.getNumero());
    }

    public List<EnderecoRespostaDTO> 
}
