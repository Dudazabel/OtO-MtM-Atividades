package com.weg.oto_mtm.cursoAluno.service;

import org.springframework.stereotype.Service;

import com.weg.oto_mtm.cursoAluno.dto.curso.CursoAlunoRespostaDTO;
import com.weg.oto_mtm.cursoAluno.dto.curso.CursoRequisicaoDTO;
import com.weg.oto_mtm.cursoAluno.dto.curso.CursoRespostaDTO;
import com.weg.oto_mtm.cursoAluno.mapper.CursoMapper;
import com.weg.oto_mtm.cursoAluno.model.Curso;
import com.weg.oto_mtm.cursoAluno.repository.CursoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CursoService {

    private final CursoMapper mapper;
    private final CursoRepository repository;

    public CursoRespostaDTO cadastrarCurso(CursoRequisicaoDTO curso){
        Curso cursoSalvo = mapper.DTOParaEntidade(curso);

        return mapper.EntidadeParaDTO(repository.save(cursoSalvo));
    }

    public CursoAlunoRespostaDTO buscarCurso(Long id){
        Curso curso = repository.findById(id)
            .orElseThrow(() -> new RuntimeException(""))
    }
}
