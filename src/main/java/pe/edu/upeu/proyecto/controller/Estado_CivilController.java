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

import pe.edu.upeu.proyecto.entity.Estado_Civil;
import pe.edu.upeu.proyecto.service.Estado_CivilService;

@CrossOrigin(origins = "*", allowedHeaders = " ")
@RestController
@RequestMapping("/civil")
public class Estado_CivilController {

	@Autowired
	private Estado_CivilService estado_CivilService;
	
	@PostMapping("/add")
	//este metodo permite registrar una persona
	public int create(@RequestBody Estado_Civil estadocivil) {
		return estado_CivilService.create(estadocivil);
	}

	@PutMapping("/update/{id}")
	//este metodo permite modificar una persona
    public int update(@RequestBody Estado_Civil estadocivil,@PathVariable int id) {
		estadocivil.setId_estcivil(id);
		
	return estado_CivilService.update(estadocivil);
	}
	
	@DeleteMapping("/delete/{id}")
	//este metodo permite eliminar una persona
	public int delete(@PathVariable int id) {
		return estado_CivilService.delete(id);
	}	
	
	@GetMapping("/listar")
	//este metodo permite listar todas las personas
	public Map<String, Object> get(){
		return estado_CivilService.listar();
	}
	
	@GetMapping("/buscar/{id}")
	//este metodo permite buscar una persona
	public Map<String, Object> read(@PathVariable int id) {
		return estado_CivilService.buscar(id);
	}
}
