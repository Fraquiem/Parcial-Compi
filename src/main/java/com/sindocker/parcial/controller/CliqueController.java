package com.sindocker.parcial.controller;

import com.sindocker.parcial.dto.CliqueDTO;
import com.sindocker.parcial.model.Clique;
import com.sindocker.parcial.service.ICliqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clique")
public class CliqueController {
    @Autowired
    private ICliqueService cliqueService;

    @GetMapping("/")
    public List<CliqueDTO> getCliques(){
        return this.cliqueService.getCliques();
    }

    @GetMapping("/{id}")
    public Clique getCliqueById(@PathVariable Long id){
        return this.cliqueService.getCliqueById(id);
    }

    @PostMapping("/")
    public void save(@RequestBody CliqueDTO cliqueDTO){
        this.cliqueService.save(cliqueDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteCliqueById(@PathVariable Long id){
        this.cliqueService.deleteCliqueById(id);
    }

}
