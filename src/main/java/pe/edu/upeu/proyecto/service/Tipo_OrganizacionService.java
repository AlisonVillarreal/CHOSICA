package pe.edu.upeu.proyecto.service;

import java.util.Map;

import pe.edu.upeu.proyecto.entity.Tipo_Organizacion;


public interface Tipo_OrganizacionService {
	int create (Tipo_Organizacion o);
	int update (Tipo_Organizacion o);
	int delete (int id);
	Map<String, Object> read(int id);
	Map<String, Object> readAll();
}


