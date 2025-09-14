package com.sindocker.parcial.service;

import com.sindocker.parcial.dao.IMediaDAO;
import com.sindocker.parcial.dao.IPlanVenganzaDAO;
import com.sindocker.parcial.dto.MediaDTO;
import com.sindocker.parcial.model.Media;
import com.sindocker.parcial.model.PlanVenganza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaService implements IMediaService{
    @Autowired
    private IMediaDAO mediaDAO;

    @Autowired
    private IPlanVenganzaDAO planVenganzaDAO;

    @Override
    public List<MediaDTO> getMedia() {
        return this.mediaDAO.findAll().stream().map(mediaDTO->new MediaDTO(
                mediaDTO.getPlanVenganza().getId(),
                mediaDTO.getTipo(),
                mediaDTO.getUrl()
        )).toList();
    }

    @Override
    public Media getMediaById(Long id) {
        return this.mediaDAO.findById(id).orElse(null);
    }

    @Override
    public void deleteMediaById(Long id) {
        this.mediaDAO.deleteById(id);
    }

    @Override
    public void save(MediaDTO mediaDTO) {
        Media mediaEntity = new Media();
        PlanVenganza pvEntity = this.planVenganzaDAO.findById(mediaDTO.planvenganza_id()).orElse(null);
        if(pvEntity==null){
            throw new IllegalArgumentException("El plan de venganza con id: "+mediaDTO.planvenganza_id()+" no existe");
        }

        mediaEntity.setPlanVenganza(pvEntity);
        mediaEntity.setTipo(mediaDTO.tipo());
        mediaEntity.setUrl(mediaDTO.url());

        this.mediaDAO.save(mediaEntity);
    }
}
