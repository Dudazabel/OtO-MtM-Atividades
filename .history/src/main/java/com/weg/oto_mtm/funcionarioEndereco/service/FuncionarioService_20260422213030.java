package com.weg.oto_mtm.funcionarioEndereco.service;

import org.springframework.stereotype.Service;

import com.weg.oto_mtm.funcionarioEndereco.dto.funcionario.FuncionarioRequisicaoDTO;
import com.weg.oto_mtm.funcionarioEndereco.dto.funcionario.FuncionarioRespostaDTO;
import com.weg.oto_mtm.funcionarioEndereco.mapper.FuncionarioMapper;
import com.weg.oto_mtm.funcionarioEndereco.repository.FuncionarioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FuncionarioService {

    private final FuncionarioMapper mapper;
    private final FuncionarioRepository repository;

    public FuncionarioRespostaDTO cadastrarFuncionario(FuncionarioRequisicaoDTO funcionario){
        
    }

}
