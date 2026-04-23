package com.weg.oto_mtm.service;

import org.springframework.stereotype.Service;

import com.weg.oto_mtm.dto.pessoa.PessoaComDocumentoDTO;
import com.weg.oto_mtm.dto.pessoa.PessoaRequisicaoDTO;
import com.weg.oto_mtm.dto.pessoa.PessoaRespostaDTO;
import com.weg.oto_mtm.mapper.PessoaMapper;
import com.weg.oto_mtm.model.Pessoa;
import com.weg.oto_mtm.repository.DocumentoRepository;
import com.weg.oto_mtm.repository.PessoaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PessoaService {

    private final PessoaMapper mapper;
    private final PessoaRepository repository;
    private final DocumentoRepository documentoRepository;

    public PessoaRespostaDTO cadastrarPessoa(PessoaRequisicaoDTO pessoaRequisicao){
        Pessoa pessoa = mapper.DTOParaEntidade(pessoaRequisicao);

        return mapper.EntidadeParaDTO(repository.save(pessoa));
    }

    public PessoaComDocumentoDTO buscarPessoa(Long idPessoa){
        PessoaRespostaDTO pessoa = repository.findById(idPessoa)
            .orElseThrow(() -> new RuntimeException());
    }
}
