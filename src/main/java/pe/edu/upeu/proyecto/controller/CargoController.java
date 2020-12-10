package pe.edu.upeu.proyecto.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.proyecto.service.CargoService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/Cargo")
public class CargoController {
	@Autowired
	private CargoService cargoService;
	
	@GetMapping("/all")
	public Map<String, Object> listar(){
		return cargoService.listar();
	}
	
	@GetMapping("/all2")
	public List<Map<String, Object>> listar2(){
	    return cargoService.listar2();
	}
}
