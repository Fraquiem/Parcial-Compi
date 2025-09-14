package com.sindocker.parcial.service;

import com.sindocker.parcial.dao.IReflexionDAO;
import com.sindocker.parcial.dto.ReflexionDTO;
import com.sindocker.parcial.model.Reflexion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReflexionService implements IReflexionService{
    @Autowired
    private IReflexionDAO reflexionDAO;
    @Override
    public List<ReflexionDTO> getReflexiones() {
        return this.reflexionDAO.findAll().stream().map(reflexion -> new ReflexionDTO(
                reflexion.getFecha(),
                reflexion.getNivelEmocional(),
                reflexion.getNota()
        )).toList();
    }

    @Override
    public Reflexion getReflexionById(Long id) {
        return this.reflexionDAO.findById(id).orElse(null);
    }

    @Override
    public void deleteReflexionById(Long id) {
        this.reflexionDAO.deleteById(id);
    }

    @Override
    public void save(Reflexion reflexion) {
        Reflexion reflexionEntity = new Reflexion();
        reflexionEntity.setFecha(reflexion.getFecha());
        reflexionEntity.setNota(reflexion.getNota());
        reflexionEntity.setNivelEmocional(reflexion.getNivelEmocional());
        this.reflexionDAO.save(reflexionEntity);
    }
}
