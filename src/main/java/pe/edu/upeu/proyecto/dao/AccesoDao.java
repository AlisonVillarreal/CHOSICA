package pe.edu.upeu.proyecto.dao;

import java.util.List;
import java.util.Map;

public interface AccesoDao {
	List<Map<String, Object>> getAccesos(int id_user);
	List<Map<String, Object>> getAcsGrupo(int id_user);
}
