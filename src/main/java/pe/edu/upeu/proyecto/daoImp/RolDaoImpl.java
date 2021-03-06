package pe.edu.upeu.proyecto.daoImp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import oracle.jdbc.internal.OracleTypes;
import pe.edu.upeu.proyecto.dao.RolDao;
import pe.edu.upeu.proyecto.entity.Rol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;
import com.google.gson.Gson;

@Component
public class RolDaoImpl implements RolDao {
@Autowired
private JdbcTemplate jdbcTemplate;
private SimpleJdbcCall simpleJdbcCall;
Gson gson =new Gson();
@Override
	public Map<String, Object> read(int id) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)			
		.withCatalogName("pk_roles") //nombre del paquete
		.withProcedureName("sp_read_rol") //nombre del procedimiento
		.declareParameters(new SqlOutParameter("cursor_roles", OracleTypes.REF_CURSOR, new ColumnMapRowMapper()), new SqlParameter("idrol", OracleTypes.NUMBER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("idrol", id);
        Map<String, Object> map= simpleJdbcCall.execute(in);	
		return map;	
	}

@Override
public Map<String, Object> readAll() {
	simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
			.withCatalogName("PKG_ROLES") //nombre del paquete
			.withProcedureName("SP_LIS_ROLES") //nombre del procedimiento
			.declareParameters(new SqlOutParameter("CUR_ROLES", OracleTypes.REF_CURSOR, new ColumnMapRowMapper()));	
			Map<String, Object> map = simpleJdbcCall.execute();
	return map;
}


@Override
public int delete(int id) {
	// TODO Auto-generated method stub
	return jdbcTemplate.update("call pk_roles.sp_delete_rol(?)", id);
}
@Override
public void convertitMap(Map<String, Object> map) {
	Gson rr = new Gson();
	/*
	for (Entry<String, Object> entry : map.entrySet()) {
        System.out.println("entry key : "+entry.getKey());
        System.out.println("Object value :"+entry.getValue());     
        System.out.println("Object value :"+entry.getClass().toString());     
	}*/
		Object lista =rr.toJson(map.get("cursor_roles"));
	System.out.println(lista.toString());
}

@Override
public List<GrantedAuthority> buscarRolUser(int iduser) {
	List<GrantedAuthority> autores = new ArrayList<GrantedAuthority>();
	String SQL = "SELECT r.id_rol, r.nombre FROM usuarios u " + 
			"INNER JOIN roles r ON u.id_rol=r.id_rol " +  
			"WHERE u.id_usuario = ?";
	List<Rol> roles = jdbcTemplate.query(SQL, new Object[]{iduser}, new BeanPropertyRowMapper<Rol>(Rol.class));		
	for(int i=0;i<roles.size();i++) {		
		autores.add(new SimpleGrantedAuthority(roles.get(i).getNombre()));
	}
	return autores;
}


@Override
public int updName(Rol r) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public List<Rol> getAll() {
			simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
			.withCatalogName("PKG_ROLES") //nombre del paquete
			.withProcedureName("SP_LIS_ROLES") //nombre del procedimiento
			.declareParameters(new SqlOutParameter("CUR_ROLES", OracleTypes.REF_CURSOR, new BeanPropertyRowMapper<Rol>(Rol.class)));	
	List<Rol> roles = (List<Rol>) simpleJdbcCall.execute();
	return roles; 
}
}
