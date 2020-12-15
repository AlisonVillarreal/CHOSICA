package pe.edu.upeu.proyecto.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.proyecto.entity.Persona;
import pe.edu.upeu.proyecto.entity.Usuario;


public interface UsuarioService {
	
	List<Map<String, Object>> getAllUsers(); //Listar usuarios con datos personales
	Map<String, Object> datosUsuario(String username); //Datos por nombre usuario
	List<Usuario> getAll(); //Listar usuarios y estados
	int regUsuario(String clave, Persona p); //Registra el usuario y crea una persona
	int updUsuario(Usuario u); //Actualiza el usuario trabajador
	int create(Usuario u); //Crear usuario trabajador
	int activacion(int id); //Acticación de correo
	int delete(int id);
	Usuario read(int id);
	Usuario read(String nomusuario);
	Usuario validarUsuario(String nomusuario);
	
}
