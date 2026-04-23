package com.weg.oto_mtm.cursoAluno.dto.aluno;

import java.util.List;

import com.weg.oto_mtm.cursoAluno.dto.curso.CursoRespostaDTO;

public record AlunoCurso(
    AlunoRespostaDTO aluno,
    List<CursoRespostaDTO> cursos
) {

}
