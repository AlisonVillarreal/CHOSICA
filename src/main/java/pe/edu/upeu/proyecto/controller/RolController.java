package pe.edu.upeu.proyecto.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.proyecto.entity.Rol;
import pe.edu.upeu.proyecto.service.RolService;

@CrossOrigin(origins = "*", allowedHeaders = " ")
@RestController
@RequestMapping("/roles")
public class RolController {
	@Autowired RolService rolService;
	
	@GetMapping("/listar")
	public Map<String, Object> getAll2() {
		return rolService.readAll();
	}
	@GetMapping("/")
	public List<Rol> getAll() {
		return rolService.getAll();
	}
}
