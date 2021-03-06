package pe.edu.upeu.proyecto.dao;

import java.util.Date;
import java.util.Map;

import pe.edu.upeu.proyecto.entity.Organizacion;
import pe.edu.upeu.proyecto.entity.Solicitud;

public interface SolicitudDao {
	int create(int id_usuariosol, Organizacion org);
	int update(Solicitud s);
	int delete(int id);
	Map<String, Object> buscar(int id);
	Map<String, Object> listar();
	
}
