package com.sindocker.parcial.service;

import com.sindocker.parcial.dto.MediaDTO;
import com.sindocker.parcial.model.Media;

import java.util.List;

public interface IMediaService {
    List<MediaDTO> getMedia();
    Media getMediaById(Long id);
    void deleteMediaById(Long id);
    void save(MediaDTO mediaDTO);
}
