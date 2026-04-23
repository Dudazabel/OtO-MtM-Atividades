package com.weg.oto_mtm.cursoAluno.service;

import org.springframework.stereotype.Service;

import com.weg.oto_mtm.cursoAluno.dto.aluno.AlunoRequisicaoDTO;
import com.weg.oto_mtm.cursoAluno.dto.aluno.AlunoRespostaDTO;
import com.weg.oto_mtm.cursoAluno.mapper.AlunoMapper;
import com.weg.oto_mtm.cursoAluno.model.Aluno;
import com.weg.oto_mtm.cursoAluno.repository.AlunoRepository;
import com.weg.oto_mtm.cursoAluno.repository.CursoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AlunoService {

    private final AlunoMapper mapper;
    private final AlunoRepository repository;
    private final CursoRepository cursoRepository;

    public AlunoRespostaDTO cadastrarAluno(AlunoRequisicaoDTO aluno){
        Aluno alunoSalvo = mapper.DTOParaEntidade(aluno);

        return new AlunoRespostaDTO(repository.save(null))
    }
}
