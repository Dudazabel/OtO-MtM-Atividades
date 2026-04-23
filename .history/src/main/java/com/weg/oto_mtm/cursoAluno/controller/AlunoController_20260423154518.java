package com.weg.oto_mtm.cursoAluno.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weg.oto_mtm.cursoAluno.service.AlunoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/aluno")
@RequiredArgsConstructor
public class AlunoController {

    private final AlunoService service;

    @PostMapping
    public Respo
}
