package com.sindocker.parcial.controller;

import com.sindocker.parcial.dto.PlanVenganzaDTO;
import com.sindocker.parcial.model.PlanVenganza;
import com.sindocker.parcial.service.PlanVenganzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/planvenganza")
public class PlanVenganzaController {
    @Autowired
    private PlanVenganzaService planVenganzaService;

    @GetMapping("/")
    public List<PlanVenganzaDTO> getPlanVenganza(){
        return this.planVenganzaService.getPlanVenganza();
    }

    @GetMapping("/{id}")
    public PlanVenganza getPlanVenganzaById(@PathVariable Long id){
        return this.planVenganzaService.getPlanVenganzaById(id);
    }

    @PostMapping("/")
    public void save(@RequestBody PlanVenganzaDTO planVenganza){
        this.planVenganzaService.save(planVenganza);
    }

    @DeleteMapping("/{id}")
    public void deletePlanVenganzaById(@PathVariable Long id){
        this.planVenganzaService.deletePlanVenganzaById(id);
    }
}
