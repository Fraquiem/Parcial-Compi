package com.sindocker.parcial.controller;

import com.sindocker.parcial.dto.MediaDTO;
import com.sindocker.parcial.model.Media;
import com.sindocker.parcial.service.IMediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/media")
public class MediaController {
    @Autowired
    private IMediaService mediaService;

    @GetMapping("/")
    public List<MediaDTO> getMedia(){
        return this.mediaService.getMedia();
    }
    @GetMapping("/{id}")
    public Media getMediaById(@PathVariable Long id){
        return this.mediaService.getMediaById(id);
    }
    @PostMapping("/")
    public void save(@RequestBody MediaDTO mediaDTO){
        this.mediaService.save(mediaDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteMediaById(@PathVariable Long id){
        this.mediaService.deleteMediaById(id);
    }
}
