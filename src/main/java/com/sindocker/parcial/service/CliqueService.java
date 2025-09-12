package com.sindocker.parcial.service;

import com.sindocker.parcial.dao.ICliqueDAO;
import com.sindocker.parcial.dto.CliqueDTO;
import com.sindocker.parcial.model.Clique;
import com.sindocker.parcial.model.Hptas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CliqueService implements ICliqueService{
    @Autowired
    private ICliqueDAO cliqueDAO;

    @Override
    public List<CliqueDTO> getCliques() {
        return this.cliqueDAO.findAll().stream().map(clique->new CliqueDTO(
                clique.getNombre())).toList();
    }

    @Override
    public Clique getCliqueById(Long id) {
        return this.cliqueDAO.findById(id).orElse(null);
    }

    @Override
    public void deleteCliqueById(Long id) {
        this.cliqueDAO.deleteById(id);
    }

    @Override
    public void save(CliqueDTO cliqueDTO) {
        Clique cliqueEntity = new Clique();
        cliqueEntity.setNombre(cliqueDTO.nombre());
        this.cliqueDAO.save(cliqueEntity);
    }
}
