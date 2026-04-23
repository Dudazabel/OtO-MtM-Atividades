package com.weg.oto_mtm.cursoAluno.dto.aluno;

public record AlunoCurso(
    AlunoRespostaDTO aluno,
    List<CursoRespostaDTO> cursos
) {

}
