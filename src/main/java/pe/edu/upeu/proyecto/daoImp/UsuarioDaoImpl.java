package pe.edu.upeu.proyecto.daoImp;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;

import oracle.jdbc.OracleTypes;
import pe.edu.upeu.proyecto.dao.UsuarioDao;
import pe.edu.upeu.proyecto.entity.Persona;
import pe.edu.upeu.proyecto.entity.Usuario;


@Component
public class UsuarioDaoImpl implements UsuarioDao{

Gson g = new Gson();
@Autowired
private JdbcTemplate jdbcTemplate;
private SimpleJdbcCall simpleJdbcCall;

	@Override
	public Usuario validarUsuario(String nomuser) {
		String SQL = "select id_usuario, nombre, usuario, clave, id_rol, estado from usuarios where usuario=?";
		Usuario usuario = jdbcTemplate.queryForObject(SQL, new Object[] {nomuser}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
		return usuario;
	}
	@Override
	public Map<String, Object> datosUsuario(String username) {
		String SQL = "SELECT u.idusuario, r.idrol, p.nombres, u.username, r.nombre FROM persona p " + 
				"INNER JOIN usuarios u ON u.idpersona = p.idpersona " + 
				"INNER JOIN usuarios_roles ur ON u.idusuario = ur.idusuario " + 
				"INNER JOIN roles r ON r.idrol=ur.idrol "+
				"where u.username = ?";
		Map<String, Object> map= jdbcTemplate.queryForMap(SQL, username);
		return map;
	}
	
	@Override
	public int create(Usuario u) {
		
		return jdbcTemplate.update("call PKG_USUARIOS.SP_REG_USUARIO(?,?,?,?)"
				,u.getNombre()
				,u.getUsuario()
				,u.getClave()
				,u.getId_rol());
	}
	@Override
	public int updUsuario(Usuario u) {
		
		return jdbcTemplate.update("call PKG_USUARIOS.SP_UPD_USUARIO(?,?,?,?,?)"
				,u.getId_usuario()
				,u.getNombre()
				,u.getUsuario()
				,u.getClave()
				,u.getId_rol());
	}
	@Override
	public int delete(int id) {
		return jdbcTemplate.update("call PKG_USUARIOS.SP_DEL_USUARIO(?)", id);
	}
	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select id_usuario, nombre, usuario, clave, id_rol, estado  from usuarios where id_usuario=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {id}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}
	@Override
	public Usuario read(String nomusuario) {
		String SQL = "SELECT id_usuario, nombre, usuario, clave, id_rol, estado FROM usuarios WHERE usuario=?";
		Usuario user = new Usuario();
		
		try {
			user = jdbcTemplate.queryForObject(SQL, new Object[] {nomusuario}, new BeanPropertyRowMapper<Usuario>(Usuario.class));	
		} catch (Exception e) {
			user = null;
		}
		
		
		return user; 
	}
	@Override
	public int regUsuario(String clave, Persona persona) {
	int response = 0;
	// Verificación de correo en uso
	if (read(persona.getCorreo())==null) {		
		response = jdbcTemplate.update("call PKG_USUARIOS.SP_REG_USUARIOSOL(?,?,?,?,?,?,?,?,?,?)"
				,persona.getId_tipodoc()
				,persona.getNombres()
				,persona.getApepat()
				,persona.getApemat()
				,persona.getNumero_doc()
				,persona.getFec_nac()
				,persona.getDireccion()
				,persona.getTelefono()
				,persona.getCorreo()
				,clave
				);
		System.out.println("El usuario fue creado");
		System.out.println(response);
	} else { System.out.println("El usuario ya está en uso"); } 
	return response;
	}
	@Override
	public List<Map<String, Object>> getAllUsers() {
		List<Map<String,Object>> usuario = new ArrayList<>();
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_USUARIOS").withProcedureName("SP_LIS_USUARIOS")
				.declareParameters(new SqlOutParameter("CUR_USUARIOS", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		Map<String, Object> map = simpleJdbcCall.execute();
		usuario.add(map);
		return usuario;
	}
	@Override
	public List<Usuario> getAll() {
		return jdbcTemplate.query("Select * from usuarios", 
				BeanPropertyRowMapper.newInstance(Usuario.class));
	}
}
