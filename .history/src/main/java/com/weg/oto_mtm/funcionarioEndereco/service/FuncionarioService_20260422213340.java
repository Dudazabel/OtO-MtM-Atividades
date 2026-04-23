package com.weg.oto_mtm.funcionarioEndereco.service;

import org.springframework.stereotype.Service;

import com.weg.oto_mtm.funcionarioEndereco.dto.funcionario.FuncionarioComEndereco;
import com.weg.oto_mtm.funcionarioEndereco.dto.funcionario.FuncionarioRequisicaoDTO;
import com.weg.oto_mtm.funcionarioEndereco.mapper.FuncionarioMapper;
import com.weg.oto_mtm.funcionarioEndereco.model.Funcionario;
import com.weg.oto_mtm.funcionarioEndereco.repository.FuncionarioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FuncionarioService {

    private final FuncionarioMapper mapper;
    private final FuncionarioRepository repository;

    public FuncionarioComEndereco cadastrarFuncionario(FuncionarioRequisicaoDTO funcionarioRequisicao){
        Funcionario funcionario = mapper.DTOParaEntidade(funcionarioRequisicao);

        return mapper.FuncionarioComEnderecoDTO(repository.save(funcionario));
    }

    public FuncionarioComEndereco buscarFuncionario(Long id){
        Funcionario funcionario = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Funcionario não encontrado"));
    }

}
