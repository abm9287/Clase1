package com.example.demo.Compania;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/api/comp/") 
public class CompaniaController 
{
    @Autowired
    private CompaniaService companiaService;

    @PostMapping("/")
    public Campania save(@RequestBody Campania entity)
    {
        return companiaService.save(entity);
    }


}
