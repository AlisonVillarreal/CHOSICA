package pe.edu.upeu.proyecto.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.proyecto.entity.Tipo_Denominacion;

public interface Tipo_DenominacionDao {
	int create(Tipo_Denominacion d);
	int update(Tipo_Denominacion d);
	int delete(int id);
	Map<String, Object> read(int id);
	Map<String, Object> readAll();
	List<Map<String, Object>> listar2();
}



