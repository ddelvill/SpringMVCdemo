package com.example;

import java.time.LocalDate;
import java.time.Month;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entities.Estudiante;
import com.example.entities.Facultad;
import com.example.entities.Telefono;
import com.example.entities.Estudiante.Genero;
import com.example.services.EstudianteService;
import com.example.services.FacultadService;
import com.example.services.TelefonoService;

@SpringBootApplication
public class SpringMvCdemoApplication implements CommandLineRunner {

	@Autowired // Para inyectar una dependencia automáticamente.. 
	private FacultadService facultadService;

	@Autowired
	private EstudianteService estudianteService;

	@Autowired
	private TelefonoService telefonoService;


	public static void main(String[] args) {
		SpringApplication.run(SpringMvCdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		/** 
		 * Agregar registros de muestras para Facultad, Estudiante y Telefono.
		 */
	
		facultadService.save(Facultad.builder()
			.nombre("Informatica")
			.build());

		facultadService.save(Facultad.builder()
			.nombre("Biologia")
			.build());


		estudianteService.save(Estudiante.builder()
			.id(1)
			.nombre("Dayana")
			.primerApellido("Del Villar")
			.segundoApellido("Gutierrez")
			.fechaAlta(LocalDate.of(2022, Month.SEPTEMBER, 9))
			.fechaNacimiento(LocalDate.of(1993, Month.NOVEMBER, 9))
			.genero(Genero.MUJER)
			.beca(6500.00)
			.facultad(facultadService.findById(1))
			.build());

		telefonoService.save(Telefono.builder()
			.id(1)
			.numero("676376043")
			.estudiante(estudianteService.findById(1))
			.build());

		telefonoService.save(Telefono.builder()
			.id(2)
			.numero("968967910")
			.estudiante(estudianteService.findById(1))
			.build());

		}

}
