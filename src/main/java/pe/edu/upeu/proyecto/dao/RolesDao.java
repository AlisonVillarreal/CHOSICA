package pe.edu.upeu.proyecto.dao;

import java.util.Map;

import pe.edu.upeu.proyecto.entity.Roles;

public interface RolesDao {
	int create(Roles r);
	int update(Roles r);
	int delete(int id);
	Map<String, Object> read(int id);
	Map<String, Object> readAll();
	}




