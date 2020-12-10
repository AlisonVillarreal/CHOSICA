package pe.edu.upeu.proyecto.service;

import java.util.Map;

import pe.edu.upeu.proyecto.entity.Cargo;


public interface CargoService {
	int create (Cargo c);
	int update (Cargo c);
	int delete (int id);
	Map<String, Object> buscar(int id);
	Map<String, Object> listar();

}
