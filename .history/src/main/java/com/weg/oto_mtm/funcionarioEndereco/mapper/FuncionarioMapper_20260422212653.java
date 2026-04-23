package com.weg.oto_mtm.funcionarioEndereco.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.weg.oto_mtm.funcionarioEndereco.dto.endereco.EnderecoRespostaDTO;
import com.weg.oto_mtm.funcionarioEndereco.dto.funcionario.FuncionarioComEndereco;
import com.weg.oto_mtm.funcionarioEndereco.dto.funcionario.FuncionarioRequisicaoDTO;
import com.weg.oto_mtm.funcionarioEndereco.dto.funcionario.FuncionarioRespostaDTO;
import com.weg.oto_mtm.funcionarioEndereco.model.Endereco;
import com.weg.oto_mtm.funcionarioEndereco.model.Funcionario;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class FuncionarioMapper {

    private final EnderecoMapper mapper;

    public Funcionario DTOParaEntidade(FuncionarioRequisicaoDTO funcionarioRequisicao){
        return new Funcionario(funcionarioRequisicao.nome());
    }

    public FuncionarioRespostaDTO EntidadeParaDTO(Funcionario funcionario){
        return new FuncionarioRespostaDTO(funcionario.getId(), funcionario.getNome());
    }

    public List<FuncionarioRespostaDTO> EntidadeParaDTOList(List<Funcionario> funcionarios){
        return funcionarios
            .stream()
            .map(this::EntidadeParaDTO)
            .toList();
    }

    public FuncionarioComEndereco FuncionarioComEnderecoDTO(Funcionario funcionario){
        EnderecoRespostaDTO enderecoResp = mapper.EntidadeParaDTO(funcionario.getEndereco());
        Fun
    }
}
