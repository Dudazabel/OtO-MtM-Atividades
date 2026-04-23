package com.weg.oto_mtm.cursoAluno.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.weg.oto_mtm.cursoAluno.dto.curso.CursoAlunoRespostaDTO;
import com.weg.oto_mtm.cursoAluno.dto.curso.CursoRequisicaoDTO;
import com.weg.oto_mtm.cursoAluno.dto.curso.CursoRespostaDTO;
import com.weg.oto_mtm.cursoAluno.model.Curso;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CursoMapper {

    private final AlunoMapper mapper;

    public Curso DTOParaEntidade(CursoRequisicaoDTO curso){
        return new Curso(curso.nome());
    }

    public CursoRespostaDTO EntidadeParaDTO(Curso curso){
        return new CursoRespostaDTO(curso.getId(), curso.getNome());
    }

    public List<CursoRespostaDTO> EntidadeParaDTOList(List<Curso> cursos){
        return cursos
            .stream()
            .map(this::EntidadeParaDTO)
            .toList();
    }

    public CursoAlunoRespostaDTO CursoAlunoRespostaDTO()

}
