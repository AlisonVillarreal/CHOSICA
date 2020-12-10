package pe.edu.upeu.proyecto.service;
import java.util.Map;

import pe.edu.upeu.proyecto.entity.Solicitud;

public interface SolicitudService {
	int create(Solicitud s);
	int update(Solicitud s);
	int delete(int id);
	Map<String, Object> buscar(int id);
	Map<String, Object> listar();
}
