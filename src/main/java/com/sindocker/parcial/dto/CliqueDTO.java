package com.sindocker.parcial.dto;

import jakarta.validation.constraints.NotBlank;

public record CliqueDTO(
        @NotBlank
        String nombre
) {
}
