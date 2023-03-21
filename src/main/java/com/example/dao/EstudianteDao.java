package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Estudiante;

// Con esta anotación creamos bins automáticamente. 


public interface EstudianteDao extends JpaRepository<Estudiante, Integer> {
    

    
}
