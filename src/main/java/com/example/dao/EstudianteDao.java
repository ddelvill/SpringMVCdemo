package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Estudiante;

@Repository // Con esta anotación creamos bins automáticamente. 


public interface EstudianteDao extends JpaRepository<Estudiante, Integer> {
    

    
}
