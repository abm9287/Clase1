package com.example.demo.Compania;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // Esta anotación indica a Spring que esta clase es un servicio.
public class CompaniaService 
{
    @Autowired // Esta anotación indica a Spring que inyecte la instancia CompaniaRepository en el CompaniaService.
    private CompaniaRepository companiaRepository;
    
    // Este método recupera todos los registros de la tabla Compania.
    public Campania save(Campania entity)
    {
        // Este método guarda un registro en la tabla Compania.
        return companiaRepository.save(entity);
    }

    public Campania findById(Long id)
    {
        return companiaRepository.findById(id).orElse(null);
    }
}
