package com.weg.oto_mtm.service;

import org.springframework.stereotype.Service;

import com.weg.oto_mtm.mapper.DocumentoMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DocumentoService {

    private final DocumentoMapper mapper;

}
