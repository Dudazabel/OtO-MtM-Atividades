package com.weg.oto_mtm.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weg.oto_mtm.dto.documento.DocumentoRequisicaoDTO;
import com.weg.oto_mtm.dto.documento.DocumentoRespostaDTO;
import com.weg.oto_mtm.service.DocumentoService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/documento")
@RequiredArgsConstructor
public class DocumentoController {

    private final DocumentoService service;

    @PostMapping
    public ResponseEntity<DocumentoRespostaDTO> cadastrarDocumento(@Valid @RequestBody DocumentoRequisicaoDTO documento){
        DocumentoRespostaDTO documentoSalvo = service.cadastrarDocumento(documento);
        return ResponseEntity
    }
}
