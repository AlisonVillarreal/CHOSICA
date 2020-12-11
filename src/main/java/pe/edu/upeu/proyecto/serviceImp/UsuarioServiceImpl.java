package pe.edu.upeu.proyecto.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.proyecto.service.UsuarioService;
import pe.edu.upeu.proyecto.dao.UsuarioDao;
import pe.edu.upeu.proyecto.entity.Persona;
import pe.edu.upeu.proyecto.entity.Usuario;

@Repository
public class UsuarioServiceImpl implements UsuarioService{
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private UsuarioDao usuarioDao;
	
	@Override
	public int create(Usuario u) {
		
		return usuarioDao.create(u);
	}

	@Override
	public int updUsuario(Usuario u) {
		return usuarioDao.updUsuario(u);
	}

	@Override
	public int delete(int id) {
		return usuarioDao.delete(id);
	}

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		return usuarioDao.read(id);
	}

	@Override
	public Usuario validarUsuario(String nomuser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> datosUsuario(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario read(String nomusuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int regUsuario(String clave, Persona p) {
		clave = passwordEncoder.encode(clave);
		return usuarioDao.regUsuario(clave, p);
	}

	@Override
	public List<Usuario> getAll() {
		// TODO Auto-generated method stub
		return usuarioDao.getAll();
	}

	@Override
	public List<Map<String, Object>> getAllUsers() {
		
		return usuarioDao.getAllUsers();
	}

}
