package com.sindocker.parcial.dto;

import com.sindocker.parcial.model.Hptas;
import com.sindocker.parcial.model.NiveldeExito;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record PlanVenganzaDTO(
        @NotBlank
        String titulo,
        @NotBlank
        Hptas hptas,
        @NotBlank
        Boolean esEjecutado,
        @NotBlank
        LocalDate diaPlaneado,
        @NotBlank
        NiveldeExito niveldeExito
) {
}
