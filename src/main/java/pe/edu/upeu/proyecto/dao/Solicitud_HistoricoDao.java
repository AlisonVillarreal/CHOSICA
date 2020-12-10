package pe.edu.upeu.proyecto.dao;

import java.util.Map;

import pe.edu.upeu.proyecto.entity.Solicitud_Historico;

public interface Solicitud_HistoricoDao {
	int create(Solicitud_Historico sh);
	int update(Solicitud_Historico sh);
	int delete(int id);
	Map<String, Object> buscar(int id);
	Map<String, Object> listar();
}