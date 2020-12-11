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

import pe.edu.upeu.proyecto.entity.Tipo_Solicitud;
import pe.edu.upeu.proyecto.service.Tipo_SolicitudService;

@CrossOrigin(origins = "*", allowedHeaders = " ")
@RestController
<<<<<<< HEAD
@RequestMapping("/tiposol")
=======
@RequestMapping("/tiposolicitud")
>>>>>>> branch 'master' of https://github.com/AlisonVillarreal/CHOSICA.git
public class Tipo_SolicitudController {
	@Autowired
	private Tipo_SolicitudService tipo_solicitudService;
	@PostMapping("/add")
	public int create(@RequestBody Tipo_Solicitud tipo_Solicitud) {
		return tipo_solicitudService.create(tipo_Solicitud);
	}
	
	@PutMapping("/update/{id}")
	public int update(@RequestBody Tipo_Solicitud tipo_Solicitud, @PathVariable int id) {
		tipo_Solicitud.setId_tiposol(id);
		return tipo_solicitudService.update(tipo_Solicitud);
	}
	
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return tipo_solicitudService.delete(id);
	}
	
	@GetMapping("/listar")
	public Map<String, Object> get(){
		return tipo_solicitudService.listar();
	}
	
	@GetMapping("/buscar/{id}")
	public Map<String, Object> read(@PathVariable int id){
		return tipo_solicitudService.buscar(id);
	}
}
