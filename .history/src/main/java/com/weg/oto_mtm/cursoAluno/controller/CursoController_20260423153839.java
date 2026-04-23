package com.weg.oto_mtm.cursoAluno.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weg.oto_mtm.cursoAluno.dto.curso.CursoRequisicaoDTO;
import com.weg.oto_mtm.cursoAluno.dto.curso.CursoRespostaDTO;
import com.weg.oto_mtm.cursoAluno.service.CursoService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/curso")
@RequiredArgsConstructor
public class CursoController {

    private final CursoService service;

    @PostMapping
    public ResponseEntity<CursoRespostaDTO> cadastrarCurso(@Valid @RequestBody CursoRequisicaoDTO curso){
        CursoRespostaDTO cursoResp = service.cadastrarCurso(curso);
        
        return ResponseEntity.status(HttpStatus.CREATED).body(cursoResp);
    }

    @
}
