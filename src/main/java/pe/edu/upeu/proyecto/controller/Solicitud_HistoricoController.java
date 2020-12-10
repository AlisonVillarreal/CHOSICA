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

import pe.edu.upeu.proyecto.entity.Solicitud_Historico;
import pe.edu.upeu.proyecto.service.Solicitud_HistoricoService;




@CrossOrigin(origins = "*", allowedHeaders = " ")
@RestController
@RequestMapping("/historico")

public class Solicitud_HistoricoController {
	@Autowired
	private Solicitud_HistoricoService solicitud_historicoService;
	
	@PostMapping("/add")
	//este metodo permite registrar 
	public int create(@RequestBody Solicitud_Historico sh) {
		return solicitud_historicoService.create(sh);
	}

	@PutMapping("/update/{id}")
	//este metodo permite modificar 
    public int update(@RequestBody Solicitud_Historico sh,@PathVariable int id) {
		sh.setId_solicitudorg(id);
		
	return solicitud_historicoService.update(sh);
	}
	
	@DeleteMapping("/delete/{id}")
	//este metodo permite eliminar 
	public int delete(@PathVariable int id) {
		return solicitud_historicoService.delete(id);
	}	
	
	@GetMapping("/listar")
	//este metodo permite listar 
	public Map<String, Object> get(){
		return solicitud_historicoService.listar();
	}
	
	@GetMapping("/buscar/{id}")
	//este metodo permite buscar 
	public Map<String, Object> read(@PathVariable int id) {
		return solicitud_historicoService.buscar(id);
	}
}
