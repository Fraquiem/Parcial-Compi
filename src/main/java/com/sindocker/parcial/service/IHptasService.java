package com.sindocker.parcial.service;

import com.sindocker.parcial.dto.HptasDTO;
import com.sindocker.parcial.model.Hptas;

import java.util.List;

public interface IHptasService {
    List<HptasDTO> getHptas();
    Hptas getHptasById(Long id);
    void deleteHptasById(Long id);
    void save(HptasDTO hptasDTO);
    default String predeterminado(){return "Soy un hpta.";}
}
