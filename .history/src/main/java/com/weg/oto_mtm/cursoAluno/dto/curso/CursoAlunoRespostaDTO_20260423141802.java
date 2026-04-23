package com.weg.oto_mtm.cursoAluno.dto.curso;

import java.util.List;

import com.weg.oto_mtm.cursoAluno.dto.aluno.AlunoRespostaDTO;
import com.weg.oto_mtm.cursoAluno.model.Aluno;

public record CursoAlunoRespostaDTO(
    CursoRespostaDTO curso,
    List<AlunoRespostaDTO
) {

}
