package com.weg.oto_mtm.funcionarioEndereco.dto.funcionario;

import com.weg.oto_mtm.funcionarioEndereco.dto.endereco.EnderecoRespostaDTO;

public record FuncionarioComEndereco(
    FuncionarioRespostaDTO funcionario,
    EnderecoRespostaDTO
) {

}
