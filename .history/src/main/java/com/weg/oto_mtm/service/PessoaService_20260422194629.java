package com.weg.oto_mtm.service;

import org.springframework.stereotype.Service;

import com.weg.oto_mtm.mapper.PessoaMapper;
import com.weg.oto_mtm.repository.DocumentoRepository;
import com.weg.oto_mtm.repository.PessoaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PessoaService {

    private final PessoaMapper mapper;
    private final PessoaRepository repository;
    private final DocumentoRepository documentoRepository
}
