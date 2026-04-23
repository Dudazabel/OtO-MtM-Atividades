package com.weg.oto_mtm.cursoAluno.service;

import org.springframework.stereotype.Service;

import com.weg.oto_mtm.cursoAluno.mapper.AlunoMapper;
import com.weg.oto_mtm.cursoAluno.repository.AlunoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AlunoService {

    private final AlunoMapper mapper;
    private final AlunoRepository repository
}
