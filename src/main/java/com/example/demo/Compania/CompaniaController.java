package com.example.demo.Compania;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController 
@RequestMapping("/api/comp/") 
@CrossOrigin("{*}")
@Tag(name = "Controller de compania")
public class CompaniaController 
{
    @Autowired
    private CompaniaService companiaService;

    @PostMapping("/")
    @Operation(summary = "Guarda un dato")
    public Campania save(@RequestBody Campania entity)
    {
        return companiaService.save(entity);
    }

    //Method create to find id
    @GetMapping("/{id}/")
    public Campania findById(@PathVariable long id)
    {
        return companiaService.findById(id);
    }

    //Method to find all
    @GetMapping("/{id}")
    public Campania getCompaniaById(@PathVariable long id) {
        return companiaService.findById(id);
    }

    //Method 
    @PutMapping("/")
    public Campania update(@RequestBody Campania entity)
    {
        return companiaService.save(entity);
    }

}
