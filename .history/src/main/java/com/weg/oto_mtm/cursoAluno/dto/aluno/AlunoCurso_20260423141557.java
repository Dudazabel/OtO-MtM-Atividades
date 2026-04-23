package com.weg.oto_mtm.cursoAluno.dto.aluno;

import java.util.List;

public record AlunoCurso(
    AlunoRespostaDTO aluno,
    List<CursoRespostaDTO> cursos
) {

}
