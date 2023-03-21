package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.entities.Estudiante;
import com.example.services.EstudianteService;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private EstudianteService estudianteService;



    // Un controlador en el patrón MVC de Spring responde a una request concreta. Y la delega posteriormente en un método que tiene en cuenta
    // el verbo  del protocolo HTTP utilizado para realizarla. Los verbos son get, post, put, delete, option. Y la enformación llega viajando a través del protocolo HTPP. 


    // Este método devuelve un listado de estudiantes. 

    @GetMapping("/listar")
    public ModelAndView listar() {

        List<Estudiante> estudiantes = estudianteService.findAll();

        ModelAndView mav = new ModelAndView("views/listarEstudiantes");

        mav.addObject("estudiantes", estudiantes);


        

        return mav;
    }

    /** 
     * Muestra el formulario de alta de estudiantes.
     */
    @GetMapping("/frmAltaEstudiante")
     public String formularioAltaEstudiante(Model model) {
        
        model.addAttribute("estudiante", new Estudiante());
        
        
        
        return "views/formularioAltaEstudiante";
     }
    
}
