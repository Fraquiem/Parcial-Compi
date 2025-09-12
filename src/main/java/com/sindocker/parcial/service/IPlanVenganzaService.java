package com.sindocker.parcial.service;

import com.sindocker.parcial.dto.PlanVenganzaDTO;
import com.sindocker.parcial.model.PlanVenganza;

import java.util.List;

public interface IPlanVenganzaService {
    List<PlanVenganzaDTO> getPlanVenganza();
    PlanVenganza getPlanVenganzaById(Long id);
    void deletePlanVenganzaById(Long id);
    void save(PlanVenganzaDTO planVenganza);
}
