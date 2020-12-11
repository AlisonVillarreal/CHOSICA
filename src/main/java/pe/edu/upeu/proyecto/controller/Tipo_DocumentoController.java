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

import pe.edu.upeu.proyecto.entity.Tipo_Documento;
import pe.edu.upeu.proyecto.service.Tipo_DocumentoService;

@CrossOrigin(origins = "*", allowedHeaders = " ")
@RestController
@RequestMapping("/tipodoc")
public class Tipo_DocumentoController {

	@Autowired
	private Tipo_DocumentoService documentoService;
	
	@PostMapping("/add")
	//este metodo permite registrar una persona
	public int create(@RequestBody Tipo_Documento tipo_Documento) {
		return documentoService.create(tipo_Documento);
	}

	@PutMapping("/update/{id}")
	//este metodo permite modificar una persona
    public int update(@RequestBody Tipo_Documento tipo_Documento,@PathVariable int id) {
		tipo_Documento.setId_tipodoc(id);
		
	return documentoService.update(tipo_Documento);
	}
	
	@DeleteMapping("/delete/{id}")
	//este metodo permite eliminar una persona
	public int delete(@PathVariable int id) {
		return documentoService.delete(id);
	}	
	
	@GetMapping("/listar")
	//este metodo permite listar todas las personas
	public Map<String, Object> get(){
		return documentoService.listar();
	}
	
	@GetMapping("/buscar/{id}")
	//este metodo permite buscar una persona
	public Map<String, Object> read(@PathVariable int id) {
		return documentoService.buscar(id);
	}
}
