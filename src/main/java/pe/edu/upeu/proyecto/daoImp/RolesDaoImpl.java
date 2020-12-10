package pe.edu.upeu.proyecto.daoImp;

import java.sql.Types;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import oracle.jdbc.internal.OracleTypes;
import pe.edu.upeu.proyecto.dao.RolesDao;
import pe.edu.upeu.proyecto.entity.Roles;

@Repository
@Component
public class RolesDaoImpl implements RolesDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Roles r) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_ROLES.SP_INS_ROLES(?,?)", r.getNombre(), r.getEstado());
	}

	@Override
	public int update(Roles r) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_ROLES.SP_UPD_ROLES(?,?.?)", r.getId_rol(),r.getNombre(),r.getEstado());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_ROLES.SP_DEL_ROLES(?)", id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_ROLES")
				.withProcedureName("SP_BUS_ROLES")
				.declareParameters(new SqlOutParameter("CUR_ROLES", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("ID_ROL", Types.INTEGER));
				SqlParameterSource in = new MapSqlParameterSource().addValue("ID_ROL", id);
				return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_ROLES") //nombre del paquete
				.withProcedureName("SP_LIS_ROLES") //nombre del procedimiento
				.declareParameters(new SqlOutParameter("CUR_ROLES", OracleTypes.CURSOR, new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();
	}

}
