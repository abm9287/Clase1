package com.example.demo.Compania;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity // Esta clase se asignará a una tabla en la base de datos.
@Data  // Métodos Getters and Setters
public class Compania 
{
    @Id // Primary Key define la clave principal.
    private Long id;    
    private String name;
    private String description;
}
