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

import oracle.jdbc.OracleTypes;
import pe.edu.upeu.proyecto.dao.Estado_CivilDao;
import pe.edu.upeu.proyecto.entity.Estado_Civil;

@Component
public class Estado_CivilDaoImpl implements Estado_CivilDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(Estado_Civil estado_civil) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_ESTADO_CIVIL.SP_INS_ESTADO_CIVIL(?)", estado_civil.getNombre());
	}

	@Override
	public int update(Estado_Civil estado_civil) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_ESTADO_CIVIL.SP_UPD_ESTADO_CIVIL(?,?)", estado_civil.getId_estcivil(),
																					 estado_civil.getNombre());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_ESTADO_CIVIL.SP_DEL_ESTADO_CIVIL(?)", id);
	}

	@Override
	public Map<String, Object> buscar(int id) {
		// TODO Auto-generated method stub
		
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_ESTADO_CIVIL").withProcedureName("SP_BUS_ESTADO_CIVIL")
				.declareParameters(new SqlOutParameter("CUR_ESTADO_CIVIL", OracleTypes.CURSOR, new ColumnMapRowMapper()),
						new SqlParameter("ID_ESTADOCIVIL", Types.INTEGER));
		
		SqlParameterSource dato = new MapSqlParameterSource().addValue("ID_ESTADOCIVIL", id);
		
		return simpleJdbcCall.execute(dato);
	}

	@Override
	public Map<String, Object> listar() {
		// TODO Auto-generated method stub
		
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_ESTADO_CIVIL").withProcedureName("SP_LIS_ESTADO_CIVIL")
				.declareParameters(new SqlOutParameter("CUR_ESTADO_CIVIL", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		
		return simpleJdbcCall.execute();
	}

}
