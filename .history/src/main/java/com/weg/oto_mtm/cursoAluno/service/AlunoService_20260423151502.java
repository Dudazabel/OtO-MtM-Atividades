package com.weg.oto_mtm.cursoAluno.service;

import org.springframework.stereotype.Service;

import com.weg.oto_mtm.cursoAluno.dto.aluno.AlunoCursoRespostaDTO;
import com.weg.oto_mtm.cursoAluno.dto.aluno.AlunoRequisicaoDTO;
import com.weg.oto_mtm.cursoAluno.dto.aluno.AlunoRespostaDTO;
import com.weg.oto_mtm.cursoAluno.mapper.AlunoMapper;
import com.weg.oto_mtm.cursoAluno.model.Aluno;
import com.weg.oto_mtm.cursoAluno.repository.AlunoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AlunoService {

    private final AlunoMapper mapper;
    private final AlunoRepository repository;

    public AlunoRespostaDTO cadastrarAluno(AlunoRequisicaoDTO aluno){
        Aluno alunoSalvo = mapper.DTOParaEntidade(aluno);

        return mapper.EntidadeParaDTO(repository.save(alunoSalvo));
    }

    public AlunoCursoRespostaDTO buscarAluno(Long id){
        return mapper.AlunoCursoRespostaDTO(repository.findById(id)
    .orElseThrow(() -> new RuntimeException("")))
    }
}
