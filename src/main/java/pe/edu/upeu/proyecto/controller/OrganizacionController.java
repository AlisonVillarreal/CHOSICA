package pe.edu.upeu.proyecto.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.proyecto.entity.Organizacion;
import pe.edu.upeu.proyecto.service.OrganizacionService;

@CrossOrigin(origins = "*", allowedHeaders = " ")
@RestController
@RequestMapping("/")
public class OrganizacionController {
	
	@Autowired
	private OrganizacionService organizacionService;
	
	@PostMapping("/add")
	public int create(@RequestBody Organizacion organizacion) {
		return organizacionService.create(organizacion);
	}
	
	@PutMapping("/update/{id}")
	public int update(@RequestBody Organizacion organizacion, @PathVariable int id) {
		organizacion.setId_organizacion(id);
		return organizacionService.update(organizacion);
	}
	
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return organizacionService.delete(id);
	}
	
	@GetMapping("/buscar/{id}")
	public Map<String, Object> read(@PathVariable int id){
		return organizacionService.buscar(id);
	}
	
	@GetMapping("/listar")
	public Map<String, Object> get(){
		return organizacionService.listar();
	}
}
