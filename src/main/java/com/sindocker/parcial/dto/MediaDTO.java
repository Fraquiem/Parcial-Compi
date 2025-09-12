package com.sindocker.parcial.dto;

import com.sindocker.parcial.model.MediaType;
import com.sindocker.parcial.model.PlanVenganza;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;

public record MediaDTO(
        @NotBlank
        PlanVenganza planVenganza,
        @NotBlank
        MediaType tipo,
        @NotBlank
        String url
){
}
