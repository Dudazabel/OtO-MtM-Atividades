package com.weg.oto_mtm.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weg.oto_mtm.dto.pessoa.PessoaComDocumentoDTO;
import com.weg.oto_mtm.dto.pessoa.PessoaRequisicaoDTO;
import com.weg.oto_mtm.service.PessoaService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/pessoa")
@RequiredArgsConstructor
public class PessoaController {

    private final PessoaService service;

    @PostMapping
    public ResponseEntity<PessoaComDocumentoDTO> cadastrarPessoa(@Valid @RequestBody PessoaRequisicaoDTO pessoa){
        PessoaComDocumentoDTO pessoaSalva = service.cadastrarPessoa(pessoa);
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaSalva);
    }

    @GetMapping("{/id}")
    public ResponseEntity<PessoaComDocumentoDTO> buscarPessoa()

}
