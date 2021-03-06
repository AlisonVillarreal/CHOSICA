package pe.edu.upeu.proyecto.dao;

import java.util.Map;

import pe.edu.upeu.proyecto.entity.Solicitud_Requisitos;

public interface Solicitud_RequisitosDao {
	int create(Solicitud_Requisitos sr);
	int update(Solicitud_Requisitos sr);
	int delete(int id);
	Map<String, Object> buscar(int id);
	Map<String, Object> listar();
}
