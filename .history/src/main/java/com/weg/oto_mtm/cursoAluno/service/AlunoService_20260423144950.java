package com.weg.oto_mtm.cursoAluno.service;

import org.springframework.stereotype.Service;

import com.weg.oto_mtm.cursoAluno.mapper.AlunoMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AlunoService {

    private final AlunoMapper mapper;
}
