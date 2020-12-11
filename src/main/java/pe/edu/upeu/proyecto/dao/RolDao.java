package pe.edu.upeu.proyecto.dao;

import java.util.List;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;

import pe.edu.upeu.proyecto.entity.Rol;


public interface RolDao {
//int create(Rol r);
//int update(Rol r);
int updName(Rol r);
int delete(int id);
List<Rol> getAll();
Map<String, Object> read(int id);
Map<String, Object> readAll();
List<GrantedAuthority> buscarRolUser(int iduser);
void convertitMap(Map<String, Object> map);
}
