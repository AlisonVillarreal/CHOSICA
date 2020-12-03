package pe.edu.upeu.proyecto.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.proyecto.service.ResolucionService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/Resoluciones")

public class ResolucionController {
	@Autowired
	private ResolucionService resolucionService;
	@GetMapping("/all")
	public Map<String, Object> readAll(){
		return resolucionService.readAll();
				
	}

}
