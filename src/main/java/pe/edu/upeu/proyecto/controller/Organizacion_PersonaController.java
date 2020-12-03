package pe.edu.upeu.proyecto.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.proyecto.service.Organizacion_PersonaService;
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/OrganizacionPersona")
public class Organizacion_PersonaController {
	@Autowired
	private Organizacion_PersonaService organizacion_PersonaService;
	
	@GetMapping("/all")
	public Map<String, Object> readAll(){
		return organizacion_PersonaService.readAll();
	}
		

}
