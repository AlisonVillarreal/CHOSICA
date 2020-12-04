package pe.edu.upeu.proyecto.dao;

import java.util.Map;

import pe.edu.upeu.proyecto.entity.Organizacion;

public interface OrganizacionDao {
	int create(Organizacion o);
	int update(Organizacion o);
	int delete(int id);
	Map<String, Object> buscar(int id);
	Map<String, Object> listar();
}
