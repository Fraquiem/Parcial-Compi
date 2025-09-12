package com.sindocker.parcial.controller;

import com.sindocker.parcial.dto.HptasDTO;
import com.sindocker.parcial.model.Hptas;
import com.sindocker.parcial.service.IHptasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hptas")
public class HptasController {
    @Autowired
    private IHptasService hptasService;

    @GetMapping("/")
    public List<HptasDTO> getHptas(){
        return this.hptasService.getHptas();
    }



    @PostMapping("/")
    public void save(@RequestBody HptasDTO hptasDTO){
        this.hptasService.save(hptasDTO);
    }

    @GetMapping("/{id}")
    public Hptas getHptasById(Long id){
        return this.hptasService.getHptasById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteHptasById(@PathVariable Long id){
        this.hptasService.deleteHptasById(id);
    }
}
