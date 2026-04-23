package com.weg.oto_mtm.cursoAluno.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.weg.oto_mtm.cursoAluno.dto.aluno.AlunoCursoRespostaDTO;
import com.weg.oto_mtm.cursoAluno.dto.aluno.AlunoRequisicaoDTO;
import com.weg.oto_mtm.cursoAluno.dto.aluno.AlunoRespostaDTO;
import com.weg.oto_mtm.cursoAluno.dto.curso.CursoRespostaDTO;
import com.weg.oto_mtm.cursoAluno.model.Aluno;

@Component
public class AlunoMapper {

    public Aluno DTOParaEntidade(AlunoRequisicaoDTO aluno){
        return new Aluno(aluno.nome());
    }

    public AlunoRespostaDTO EntidadeParaDTO(Aluno aluno){
        return new AlunoRespostaDTO(aluno.getId(), aluno.getNome());
    }

    public List<AlunoRespostaDTO> EntidadeParaDTOList(List<Aluno> alunos){
        return alunos
            .stream()
            .map(this::EntidadeParaDTO)
            .toList();
    }

    public AlunoCursoRespostaDTO alunoCursoRespostaDTO(Aluno aluno){
        List<CursoRespostaDTO> cursos = 
    }
}
