package com.weg.oto_mtm.cursoAluno.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weg.oto_mtm.cursoAluno.service.CursoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/curso")
@RequiredArgsConstructor
public class CursoController {

    private final CursoService service;

    @Pos
}
