package com.sindocker.parcial.controller;

import com.sindocker.parcial.dto.ReflexionDTO;
import com.sindocker.parcial.model.Reflexion;
import com.sindocker.parcial.service.IReflexionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reflexion")
public class ReflexionController {
    @Autowired
    private IReflexionService reflexionService;

    @GetMapping("/")
    public List<ReflexionDTO> getReflexiones(){
        return this.reflexionService.getReflexiones();
    }

    @GetMapping("/{id}")
    public Reflexion getReflexionById(@PathVariable Long id){
        return this.reflexionService.getReflexionById(id);
    }

    @PostMapping("/")
    public void saveReflexion(@RequestBody Reflexion reflexion){
        this.reflexionService.save(reflexion);
    }

    @DeleteMapping("/{id}")
    public void deleteReflexionById(@PathVariable Long id){
        this.reflexionService.deleteReflexionById(id);
    }
}
