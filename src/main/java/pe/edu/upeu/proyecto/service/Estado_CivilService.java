package pe.edu.upeu.proyecto.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.proyecto.entity.Estado_Civil;

public interface Estado_CivilService {

	int create (Estado_Civil estado_civil);
	int update (Estado_Civil estado_civil);
	int delete (int id);
	Map<String, Object> buscar(int id);
	Map<String, Object> listar();
	List<Map<String, Object>> listar2();
}
