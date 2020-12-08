package pe.edu.upeu.proyecto.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.proyecto.entity.Solicitud_Requisitos;
import pe.edu.upeu.proyecto.service.Solicitud_RequisitosService;

@CrossOrigin(origins = "*", allowedHeaders = " ")
@RestController
@RequestMapping("/solirequisitos")
public class Solicitud_RequisitosController {
	
	@Autowired
	private Solicitud_RequisitosService solicitud_requisitosService;
	
	@PostMapping("/add")
	public int create(@RequestBody Solicitud_Requisitos solicitud_Requisitos) {
		return solicitud_requisitosService.create(solicitud_Requisitos);
	}
	
	@PutMapping("/update/{id}")
	public int update(@RequestBody Solicitud_Requisitos solicitud_Requisitos, @PathVariable int id) {
		solicitud_Requisitos.setId_solrequisito(id);
		return solicitud_requisitosService.update(solicitud_Requisitos);
	}
	
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return solicitud_requisitosService.delete(id);
	}
	
	@GetMapping("/buscar/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return solicitud_requisitosService.buscar(id);
	}
	
	@GetMapping("/listar")
	public Map<String, Object> get(){
		return solicitud_requisitosService.listar();
	}
}
