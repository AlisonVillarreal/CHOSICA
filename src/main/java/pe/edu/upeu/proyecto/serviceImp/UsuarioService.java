package pe.edu.upeu.proyecto.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;

import pe.edu.upeu.proyecto.dao.RolDao;
import pe.edu.upeu.proyecto.dao.UsuarioDao;
import pe.edu.upeu.proyecto.entity.Usuario;



@Service("userService")
public class UsuarioService implements UserDetailsService{
	Gson g = new Gson();
   @Autowired
	private UsuarioDao usuarioDao;
   @Autowired
	private RolDao rolDao;
   
	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {	
		
		Usuario usuario = new Usuario();
		usuario = usuarioDao.validarUsuario(username);
		UserDetails details = new User(usuario.getUsuario(),usuario.getClave(),rolDao.buscarRolUser(usuario.getId_usuario()));
		System.out.println("paso" + usuario.getCorreo_activacion());	
		if (usuario.getCorreo_activacion()  == "1" ) {
			System.out.println(usuario.getCorreo_activacion());	
		} 
//		else {
//			return details = null;
//		}
			return details;
	}

}
