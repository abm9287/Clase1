package com.example.demo.Compania;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Esta anotación indica a Spring que esta clase es un controlador.
@RequestMapping("/api/prueba") // Esta anotación indica a Spring que esta clase es un controlador.
public class CompaniaController 
{
    @Autowired // Esta anotación indica a Spring que inyecte la instancia CompaniaService en el CompaniaController.
    private CompaniaService companiaService;// Inyección de dependencias desde el controller hasta el service

    @PostMapping("/save") // Este método se asigna a la ruta /api/prueba/save.
    public Compania save(@RequestBody Compania entity)
    {
        return companiaService.save(entity);
    }

    
}
