package com.weg.oto_mtm.cursoAluno.service;

import org.springframework.stereotype.Service;

import com.weg.oto_mtm.cursoAluno.dto.aluno.AlunoCursoRespostaDTO;
import com.weg.oto_mtm.cursoAluno.dto.aluno.AlunoRequisicaoDTO;
import com.weg.oto_mtm.cursoAluno.dto.aluno.AlunoRespostaDTO;
import com.weg.oto_mtm.cursoAluno.mapper.AlunoMapper;
import com.weg.oto_mtm.cursoAluno.model.Aluno;
import com.weg.oto_mtm.cursoAluno.model.Curso;
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

        return mapper.EntidadeParaDTO(repository.save(alunoSalvo));
    }

    public AlunoCursoRespostaDTO buscarAluno(Long id){
        Aluno aluno = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Aluno não encontrado!"));

        return mapper.alunoCursoRespostaDTO(aluno);
    }

    public AlunoCursoRespostaDTO matricular(Long idAluno, Long idCurso){
        Aluno aluno = repository.findById(idAluno)
            .orElseThrow(() -> new RuntimeException("Aluno não encontrado!"));

        Curso curso = cursoRepository.findById(idCurso)
            .orElseThrow(() -> new RuntimeException("Curso não encontrado!"));

        if
        aluno.getCursos().add(curso);

        return mapper.alunoCursoRespostaDTO(repository.save(aluno));
    }
}
