package pe.edu.upeu.proyecto.dao;

import java.util.Map;

import pe.edu.upeu.proyecto.entity.Persona;

public interface PersonaDao {

	int create (Persona persona);
	int update (Persona persona);
	int delete (int id);
	Map<String, Object> buscar(int id);
	Map<String, Object> listar();
	
}
