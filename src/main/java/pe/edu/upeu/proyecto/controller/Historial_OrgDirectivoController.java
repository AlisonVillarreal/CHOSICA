package pe.edu.upeu.proyecto.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.proyecto.service.Historial_OrgDirectivoService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/HistorialOrgDirectivo")
public class Historial_OrgDirectivoController {
	@Autowired
	private Historial_OrgDirectivoService historial_OrgDirectivoService;
	
	@GetMapping("/all")
	public Map<String, Object> readAll(){
		return historial_OrgDirectivoService.readAll();
	}

}
