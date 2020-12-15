package pe.edu.upeu.proyecto.daoImp;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import oracle.jdbc.OracleTypes;
import pe.edu.upeu.proyecto.dao.AccesoDao;

@Repository
public class AccesoDaoImpl implements AccesoDao {
@Autowired JdbcTemplate jdbcTemplate;
	@Override
	public List<Map<String, Object>> getAccesos(int id_user) {	
		
		//List<Map<String, Object>> accesos = new ArrayList<>();
		//simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_ACCESO")
		//		.withProcedureName("SP_LIS_ACCESOS")
		//		.declareParameters(new SqlOutParameter("CUR_ACCESO", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("VAR_ID_USUARIO", Types.VARCHAR));
		//SqlParameterSource in = new MapSqlParameterSource().addValue("VAR_ID_USUARIO", 4);
		//Map<String, Object> map = simpleJdbcCall.execute(in);
		//accesos.add(map);
		
		String SQL ="SELECT A.ID_ACCESO, A.NOMBRE, A.URL, A.ICONO, A.ID_GRUPO "+
				 	"FROM USUARIOS U " + 
					"INNER JOIN ROLES_ACCESOS R ON R.ID_ROL = U.ID_ROL " + 
					"INNER JOIN ACCESO A ON A.ID_ACCESO = R.ID_ACCESO " + 
					"WHERE U.ID_USUARIO = ? " +
					"ORDER BY A.NOMBRE ";
		return jdbcTemplate.queryForList(SQL,new Object[] {id_user});
	}
	@Override
	public List<Map<String, Object>> getAcsGrupo(int id_user) {
		String SQL ="SELECT DISTINCT G.ID_GRUPO, G.NOMBRE, G.ICONO "+
				 	"FROM USUARIOS U " + 
					"INNER JOIN ROLES_ACCESOS R ON R.ID_ROL = U.ID_ROL " + 
					"INNER JOIN ACCESO A ON A.ID_ACCESO = R.ID_ACCESO " + 
					"INNER JOIN ACCESO_GRUPO G ON A.ID_GRUPO = G.ID_GRUPO "+
					"WHERE U.ID_USUARIO = ? " ;
	return jdbcTemplate.queryForList(SQL,new Object[] {id_user});
	}

}
