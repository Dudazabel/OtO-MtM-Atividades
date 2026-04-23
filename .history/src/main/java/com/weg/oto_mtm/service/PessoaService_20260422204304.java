package com.weg.oto_mtm.service;

import org.springframework.stereotype.Service;

import com.weg.oto_mtm.model.Pessoa;
import com.weg.oto_mtm.pessoaDocumento.dto.pessoa.PessoaComDocumentoDTO;
import com.weg.oto_mtm.pessoaDocumento.dto.pessoa.PessoaRequisicaoDTO;
import com.weg.oto_mtm.pessoaDocumento.mapper.PessoaMapper;
import com.weg.oto_mtm.repository.PessoaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PessoaService {

    private final PessoaMapper mapper;
    private final PessoaRepository repository;

    public PessoaComDocumentoDTO cadastrarPessoa(PessoaRequisicaoDTO pessoaRequisicao){
        Pessoa pessoa = mapper.DTOParaEntidade(pessoaRequisicao);

        return mapper.PessoaComDocumentoDTO(repository.save(pessoa));
    }

    public PessoaComDocumentoDTO buscarPessoa(Long idPessoa){
        Pessoa pessoa = repository.findById(idPessoa)
            .orElseThrow(() -> new RuntimeException("Pessoa não encontrada!"));

        return mapper.PessoaComDocumentoDTO(pessoa);
    }
}
