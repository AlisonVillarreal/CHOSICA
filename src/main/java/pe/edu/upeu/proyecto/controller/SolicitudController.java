package pe.edu.upeu.proyecto.controller;
import  java.util.Map ;


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

import com.google.gson.Gson;

import pe.edu.upeu.proyecto.entity.Organizacion;
import pe.edu.upeu.proyecto.entity.Solicitud;
import pe.edu.upeu.proyecto.entity.Usuario;
import  pe.edu.upeu.proyecto.service.SolicitudService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/solicitud")

public class SolicitudController {
	
	@Autowired
	private SolicitudService solicitudService;
	
	@PostMapping("/add")
	public int create(@RequestBody String multi) {
		
		Gson gson = new Gson();
		
		Organizacion organizacion = gson.fromJson(multi, Organizacion.class);
		Solicitud soli = gson.fromJson(multi, Solicitud.class);
		
		return solicitudService.create(soli.getId_usuariosol(), organizacion);
		
	}
	
	@PutMapping("/update/{id}")
	public int update(@RequestBody Solicitud s, @PathVariable int id) {
		s.setId_solicitudorg(id);
		return solicitudService.update(s);
	}
	
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return solicitudService.delete(id);
	}
	
	@GetMapping("/buscar/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return solicitudService.buscar(id);
	}
	
	@GetMapping("/listar/{id}")
	public Map<String, Object> get(){
		return solicitudService.listar();
	}
}
