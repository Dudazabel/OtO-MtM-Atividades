package com.weg.oto_mtm.funcionarioEndereco.dto.funcionario;

import com.weg.oto_mtm.funcionarioEndereco.dto.endereco.EnderecoRequisicaoDTO;

public record FuncionarioRequisicaoDTO(
    String nome, 
    EnderecoRequisicaoDTO e
) {

}
