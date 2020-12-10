package pe.edu.upeu.proyecto.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.proyecto.entity.Persona;

public interface PersonaService {

	int create (Persona persona);
	int update (Persona persona);
	int delete (int id);
	Map<String, Object> buscar(int id);
	Map<String, Object> listar();
	List<Map<String, Object>> listar2();
}
