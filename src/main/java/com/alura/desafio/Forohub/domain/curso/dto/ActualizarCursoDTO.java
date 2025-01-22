package com.alura.desafio.Forohub.domain.curso.dto;

import com.alura.desafio.Forohub.domain.curso.Categoria;


public record ActualizarCursoDTO(
        String name,
        Categoria categoria,
        Boolean activo) {
}
