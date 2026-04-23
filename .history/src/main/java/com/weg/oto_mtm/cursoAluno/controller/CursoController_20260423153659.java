package com.weg.oto_mtm.cursoAluno.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public CursoRespostaDTO cadastrarCurso(@Valid @RequestBody C)
}
