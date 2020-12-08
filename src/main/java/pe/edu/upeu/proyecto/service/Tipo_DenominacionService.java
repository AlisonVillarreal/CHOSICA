package pe.edu.upeu.proyecto.service;

import java.util.Map;

import pe.edu.upeu.proyecto.entity.Tipo_Denominacion;


public interface Tipo_DenominacionService {
	int create (Tipo_Denominacion d);
	int update (Tipo_Denominacion d);
	int delete (int id);
	Map<String, Object> read(int id);
	Map<String, Object> readAll();
}
