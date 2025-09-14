package com.sindocker.parcial.service;


import com.sindocker.parcial.dto.ReflexionDTO;
import com.sindocker.parcial.model.Reflexion;

import java.util.List;

public interface IReflexionService {
    List<ReflexionDTO> getReflexiones();
    Reflexion getReflexionById(Long id);
    void deleteReflexionById(Long id);
    void save(Reflexion reflexion);
}
