package pe.edu.upeu.proyecto.service;

import java.util.Map;

import pe.edu.upeu.proyecto.entity.Organizacion;

public interface OrganizacionService {
	int create(Organizacion o);
	int update(Organizacion o);
	int delete(int id);
	Map<String, Object> buscar(int id);
	Map<String, Object> listar();
}
