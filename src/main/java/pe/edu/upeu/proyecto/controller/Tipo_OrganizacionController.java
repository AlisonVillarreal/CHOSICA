package pe.edu.upeu.proyecto.controller;

import java.util.List;
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

import pe.edu.upeu.proyecto.entity.Tipo_Organizacion;
import pe.edu.upeu.proyecto.service.Tipo_OrganizacionService;



@RestController
@RequestMapping("/tiporganizacion")
public class Tipo_OrganizacionController {

	@Autowired
	private Tipo_OrganizacionService tipo_OrganizacionService;
	
	@GetMapping("/all")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> get(){
		return tipo_OrganizacionService.readAll();
	}
	
	@GetMapping("/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> read(@PathVariable int id) {
		return tipo_OrganizacionService.read(id);
	}
	@PostMapping("/add")
	@CrossOrigin(origins = "http://localhost:4200")
	//este metodo permite registrar una competencia
	public int create(@RequestBody Tipo_Organizacion o) {
		return tipo_OrganizacionService.create(o);		
	}
	@DeleteMapping("/delete/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	//este metodo permite eliminar una competencia
	public int delete(@PathVariable int id) {
		return tipo_OrganizacionService.delete(id);
	}	
	
	@PutMapping("/edit/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	//este metodo permite modificar una competencia
    public int update(@RequestBody Tipo_Organizacion o,@PathVariable int id) {
		o.setId_tiporg(id);
		
	return tipo_OrganizacionService.update(o);
	}	
	
	@GetMapping("/listar2")
	public List<Map<String, Object>> listar2(){
	    return tipo_OrganizacionService.listar2();
	}
}
