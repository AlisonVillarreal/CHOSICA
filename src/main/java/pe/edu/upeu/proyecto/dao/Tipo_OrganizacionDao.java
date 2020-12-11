package pe.edu.upeu.proyecto.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.proyecto.entity.Tipo_Organizacion;

public interface Tipo_OrganizacionDao {
	int create(Tipo_Organizacion o);
	int update(Tipo_Organizacion o);
	int delete(int id);
	Map<String, Object> read(int id);
	Map<String, Object> readAll();
	List<Map<String, Object>> listar2();
}


