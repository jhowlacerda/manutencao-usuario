package com.br.manutencao_usuario.dto;

import jakarta.validation.constraints.NotNull;

public record UserUpdateDto(
        String name,
        String surname,
        String email,
        String cellPhone,
        @NotNull
        String cpf) {
}
