package pe.edu.upeu.proyecto.service;

import java.util.Map;

import pe.edu.upeu.proyecto.entity.Solicitud_Estado;

public interface Solicitud_EstadoService {

	int create(Solicitud_Estado se);
	int update(Solicitud_Estado se);
	int delete(int id);
	Map<String, Object> buscar(int id);
	Map<String, Object> listar();

}
