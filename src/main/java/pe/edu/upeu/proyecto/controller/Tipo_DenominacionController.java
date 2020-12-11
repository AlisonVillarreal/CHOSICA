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

import pe.edu.upeu.proyecto.entity.Tipo_Denominacion;
import pe.edu.upeu.proyecto.service.Tipo_DenominacionService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/tipodenominaciones")
public class Tipo_DenominacionController {
	@Autowired
	private Tipo_DenominacionService tipo_DenominacionService;
	
	@GetMapping("/all")
	public Map<String, Object> get(){
		return tipo_DenominacionService.readAll();
	}
	
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return tipo_DenominacionService.read(id);
	}
	@PostMapping("/add")
	//este metodo permite registrar una competencia
	public int create(@RequestBody Tipo_Denominacion d) {
		return tipo_DenominacionService.create(d);		
	}
	@DeleteMapping("/delete/{id}")
	//este metodo permite eliminar una competencia
	public int delete(@PathVariable int id) {
		return tipo_DenominacionService.delete(id);
	}	
	
	@PutMapping("/edit/{id}")
	//este metodo permite modificar una competencia
    public int update(@RequestBody Tipo_Denominacion d,@PathVariable int id) {
		d.setId_tipodeno(id);
		
	return tipo_DenominacionService.update(d);
	}	
	
	@GetMapping("/listar2")
	public List<Map<String, Object>> listar2(){
	    return tipo_DenominacionService.listar2();
	}
}
