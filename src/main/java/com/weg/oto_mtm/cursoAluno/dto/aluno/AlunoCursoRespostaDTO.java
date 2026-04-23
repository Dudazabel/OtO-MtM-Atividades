package com.weg.oto_mtm.cursoAluno.dto.aluno;

import java.util.List;

import com.weg.oto_mtm.cursoAluno.dto.curso.CursoRespostaDTO;

public record AlunoCursoRespostaDTO(
    AlunoRespostaDTO aluno,
    List<CursoRespostaDTO> cursos
) {

}
