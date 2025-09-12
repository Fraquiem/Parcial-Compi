package com.sindocker.parcial.dto;

import com.sindocker.parcial.model.Rol;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record HptasDTO(
        @NotBlank
        Long clique_id,
        @NotBlank
        String nombre,
        @NotBlank
        @Min(value=1)
        @Max(value =10)
        int nivelCanson,
        @NotBlank
        Rol rol
) {
}
