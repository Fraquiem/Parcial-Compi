package com.sindocker.parcial.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record ReflexionDTO(
        @NotBlank
        LocalDate localDate,
        @NotBlank
        @Min(value=1)
        @Max(value=10)
        int moodLevel,
        String nota
) {
}
