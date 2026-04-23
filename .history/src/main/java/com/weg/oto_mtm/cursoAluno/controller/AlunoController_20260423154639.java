package com.weg.oto_mtm.cursoAluno.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weg.oto_mtm.cursoAluno.dto.aluno.AlunoRequisicaoDTO;
import com.weg.oto_mtm.cursoAluno.dto.aluno.AlunoRespostaDTO;
import com.weg.oto_mtm.cursoAluno.service.AlunoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/aluno")
@RequiredArgsConstructor
public class AlunoController {

    private final AlunoService service;

    @PostMapping
    public ResponseEntity<AlunoRespostaDTO> cadastrarAluno(AlunoRequisicaoDTO aluno){
        AlunoRespostaDTO alunoResp = service.cadastrarAluno(aluno);

        return ResponseEntity.status(HttpStatus.CREATED).body(alunoResp)
    }
}
