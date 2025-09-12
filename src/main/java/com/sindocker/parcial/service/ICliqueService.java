package com.sindocker.parcial.service;

import com.sindocker.parcial.dto.CliqueDTO;
import com.sindocker.parcial.model.Clique;

import java.util.List;

public interface ICliqueService {
    List<CliqueDTO> getCliques();
    Clique getCliqueById(Long id);
    void deleteCliqueById(Long id);
    void save(CliqueDTO cliqueDTO);
}
