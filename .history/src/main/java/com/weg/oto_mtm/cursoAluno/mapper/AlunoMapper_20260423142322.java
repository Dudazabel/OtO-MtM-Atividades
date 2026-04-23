package com.weg.oto_mtm.cursoAluno.mapper;

import org.springframework.stereotype.Component;

import com.weg.oto_mtm.cursoAluno.dto.aluno.AlunoRequisicaoDTO;
import com.weg.oto_mtm.cursoAluno.dto.aluno.AlunoRespostaDTO;
import com.weg.oto_mtm.cursoAluno.model.Aluno;

@Component
public class AlunoMapper {

    public Aluno DTOParaEntidade(AlunoRequisicaoDTO aluno){
        return new Aluno(aluno.nome());
    }

    public AlunoRespostaDTO EntidadeParaDTO
}
