package com.weg.oto_mtm.funcionarioEndereco.mapper;

import org.springframework.stereotype.Component;

import com.weg.oto_mtm.funcionarioEndereco.dto.funcionario.FuncionarioRequisicaoDTO;
import com.weg.oto_mtm.funcionarioEndereco.dto.funcionario.FuncionarioRespostaDTO;
import com.weg.oto_mtm.funcionarioEndereco.model.Funcionario;

@Component
public class FuncionarioMapper {

    public Funcionario DTOParaEntidade(FuncionarioRequisicaoDTO funcionarioRequisicao){
        return new Funcionario(funcionarioRequisicao.nome());
    }

    public FuncionarioRespostaDTO EntidadeParaDTO(Funcionario funcionario){
        
    }
}
