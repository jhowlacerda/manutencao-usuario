package com.br.manutencao_usuario.dto;

import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record UserUpdateDto(
        @NotNull
        UUID id,
        String name,
        String surname,
        String email,
        String cellPhone,
        String cpf) {
}
