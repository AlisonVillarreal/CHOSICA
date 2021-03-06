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

import pe.edu.upeu.proyecto.entity.Roles;
import pe.edu.upeu.proyecto.service.RolesService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/roles")
public class RolesController {
	@Autowired
	private RolesService rolesService;
	
	@GetMapping("/all")
	public Map<String, Object> get(){
		return rolesService.readAll();
	}
	
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return rolesService.read(id);
	}
	@PostMapping("/add")
	//este metodo permite registrar una competencia
	public int create(@RequestBody Roles r) {
		return rolesService.create(r);		
	}
	@DeleteMapping("/delete/{id}")
	//este metodo permite eliminar una competencia
	public int delete(@PathVariable int id) {
		return rolesService.delete(id);
	}	
	
	@PutMapping("/edit/{id}")
	//este metodo permite modificar una competencia
    public int update(@RequestBody Roles r,@PathVariable int id) {
		r.setId_rol(id);
		
	return rolesService.update(r);
	}	

}
