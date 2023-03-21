package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EstudianteDao;
import com.example.entities.Estudiante;

@Service


public class EstudianteServiceImpl implements EstudianteService{

    @Autowired
    private EstudianteDao estudianteDao;


    @Override
    public List<Estudiante> findAll() {
        // TODO Auto-generated method stub
        return estudianteDao.findAll();
    }

    @Override
    public Estudiante findById(int idEstudiante) {
        // TODO Auto-generated method stub
        return estudianteDao.findById(idEstudiante).get();
    }

    @Override
    public void save(Estudiante estudiante) {
        // TODO Auto-generated method stub
        estudianteDao.save(estudiante);
    }

    @Override
    public void deleteById(int idEstudiante) {
        // TODO Auto-generated method stub
        estudianteDao.deleteById(idEstudiante);
    }
    

}
