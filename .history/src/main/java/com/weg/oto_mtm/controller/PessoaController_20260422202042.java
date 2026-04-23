package com.weg.oto_mtm.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weg.oto_mtm.dto.pessoa.PessoaComDocumentoDTO;
import com.weg.oto_mtm.service.PessoaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/pessoa")
@RequiredArgsConstructor
public class PessoaController {

    private final PessoaService service;

    public ResponseEntity<PessoaComDocumentoDTO> cadastrarPessoa

}
