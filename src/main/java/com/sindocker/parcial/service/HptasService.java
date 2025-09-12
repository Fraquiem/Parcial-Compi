package com.sindocker.parcial.service;

import com.sindocker.parcial.dao.ICliqueDAO;
import com.sindocker.parcial.dao.IHptasDAO;
import com.sindocker.parcial.dto.HptasDTO;
import com.sindocker.parcial.model.Clique;
import com.sindocker.parcial.model.Hptas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class HptasService implements IHptasService{
    @Autowired
    private IHptasDAO hptasDAO;
    private ICliqueDAO cliqueDAO;
    @Override
    public List<HptasDTO> getHptas() {
        return this.hptasDAO.findAll().stream().map(hptas -> new HptasDTO(
                hptas.getClique().getId(),
                hptas.getNombre(),
                hptas.getNivelCanson(),
                hptas.getRol()))
                .toList();
    }

    @Override
    public Hptas getHptasById(Long id) {
        return this.hptasDAO.findHptasById(id).orElse(null);
    }

    @Override
    public void save(HptasDTO hptasDTO) {
        Hptas hptasEntity = new Hptas();
        Clique cliqueEntity = this.cliqueDAO.findById(hptasDTO.clique_id()).orElse(null);
        if(cliqueEntity==null){
            throw new IllegalArgumentException("El clique con id: "+hptasDTO.clique_id()+" no existe");
        }
        hptasEntity.setClique(cliqueEntity);
        hptasEntity.setNombre(hptasDTO.nombre());
        hptasEntity.setNivelCanson(hptasDTO.nivelCanson());
        hptasEntity.setRol(hptasDTO.rol());
        this.hptasDAO.save(hptasEntity);
    }

    @Override
    public void deleteHptasById(Long id) {

    }
}
