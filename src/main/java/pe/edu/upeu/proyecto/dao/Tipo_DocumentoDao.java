package pe.edu.upeu.proyecto.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.proyecto.entity.Tipo_Documento;;

public interface Tipo_DocumentoDao {

	int create (Tipo_Documento tipo_documento);
	int update (Tipo_Documento tipo_documento);
	int delete (int id);
	Map<String, Object> buscar(int id);
	Map<String, Object> listar();
	List<Map<String, Object>> listar2();
}
