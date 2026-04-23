package com.weg.oto_mtm.cursoAluno.mapper;

import org.springframework.stereotype.Component;

import com.weg.oto_mtm.cursoAluno.dto.aluno.AlunoRequisicaoDTO;
import com.weg.oto_mtm.cursoAluno.dto.curso.CursoRequisicaoDTO;
import com.weg.oto_mtm.cursoAluno.model.Curso;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CursoMapper {

    private final AlunoMapper mapper;

    public Curso DTOParaEntidade(CursoRequisicaoDTO curso){
        return new Curso(curso.)
    }

}
