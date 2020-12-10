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

import pe.edu.upeu.proyecto.entity.Solicitud_Estado;
import pe.edu.upeu.proyecto.service.Solicitud_EstadoService;


@CrossOrigin(origins = "*", allowedHeaders = " ")
@RestController
@RequestMapping("/estado")
public class Solicitud_EstadoController {

	@Autowired
	private Solicitud_EstadoService solicitud_EstadoService;
	
	@PostMapping("/add")
	//este metodo permite registra
	public int create(@RequestBody Solicitud_Estado se) {
		return solicitud_EstadoService.create(se);
	}

	@PutMapping("/update/{id}")
	//este metodo permite modificar
    public int update(@RequestBody Solicitud_Estado se,@PathVariable int id) {
		se.setId_solestado(id);  
		
	return solicitud_EstadoService.update(se);
	}
	
	@DeleteMapping("/delete/{id}")
	//este metodo permite eliminar 
	public int delete(@PathVariable int id) {
		return solicitud_EstadoService.delete(id);
	}	
	
	@GetMapping("/listar")
	//este metodo permite listar
	public Map<String, Object> get(){
		return solicitud_EstadoService.listar();
	}
	
	@GetMapping("/buscar/{id}")
	//este metodo permite buscar
	public Map<String, Object> read(@PathVariable int id) {
		return solicitud_EstadoService.buscar(id);
	}
}
