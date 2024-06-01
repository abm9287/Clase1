package com.example.demo.Compania;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity // Esta clase se asignará a una tabla en la base de datos.
@Data  // Métodos Getters and Setters
public class Campania 
{
    @Id // Primary Key define la clave principal.
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // Este atributo indica a Spring que genere un valor único para este atributo.
    private Long id;    
    private String name;
    private String description;
}
