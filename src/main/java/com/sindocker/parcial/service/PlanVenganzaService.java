package com.sindocker.parcial.service;

import com.sindocker.parcial.dao.IPlanVenganzaDAO;
import com.sindocker.parcial.dto.PlanVenganzaDTO;
import com.sindocker.parcial.model.Hptas;
import com.sindocker.parcial.model.PlanVenganza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanVenganzaService implements IPlanVenganzaService{
    @Autowired
    private IPlanVenganzaDAO planVenganzaDAO;

    @Override
    public List<PlanVenganzaDTO> getPlanVenganza() {
        return this.planVenganzaDAO.findAll().stream().map(pv->new PlanVenganzaDTO(
                pv.getTitulo(),
                pv.getHpta(),
                pv.getEsEjecutado(),
                pv.getDiaPlaneado(),
                pv.getNiveldeExito()
        )).toList();
    }

    @Override
    public PlanVenganza getPlanVenganzaById(Long id) {
        return this.planVenganzaDAO.findById(id).orElse(null);
    }

    @Override
    public void deletePlanVenganzaById(Long id) {
        this.planVenganzaDAO.deleteById(id);
    }

    @Override
    public void save(PlanVenganzaDTO planVenganza) {
        PlanVenganza planVenganzaEntity = new PlanVenganza();
        Hptas hptasEntity = planVenganzaEntity.getHpta();
        planVenganzaEntity.setHpta(hptasEntity);
        planVenganzaEntity.setEsEjecutado(planVenganza.esEjecutado());
        planVenganzaEntity.setDiaPlaneado(planVenganza.diaPlaneado());
        planVenganzaEntity.setNiveldeExito(planVenganza.niveldeExito());
        planVenganzaEntity.setTitulo(planVenganza.titulo());
        this.planVenganzaDAO.save(planVenganzaEntity);
    }
}
