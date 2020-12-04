package pe.edu.upeu.proyecto.dao;

import java.util.Map;

import pe.edu.upeu.proyecto.entity.Tipo_Solicitud;

public interface Tipo_SolicitudDao {
	int create(Tipo_Solicitud tp);
	int update(Tipo_Solicitud tp);
	int delete(int id);
	Map<String, Object> buscar(int id);
	Map<String, Object> listar();
}
