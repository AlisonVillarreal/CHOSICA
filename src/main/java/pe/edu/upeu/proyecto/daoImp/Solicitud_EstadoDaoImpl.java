package pe.edu.upeu.proyecto.daoImp;
import java.sql.Types;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import oracle.jdbc.OracleTypes;
import pe.edu.upeu.proyecto.dao.Solicitud_EstadoDao;
import pe.edu.upeu.proyecto.entity.Solicitud_Estado;

@Component

public class Solicitud_EstadoDaoImpl implements Solicitud_EstadoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Solicitud_Estado se) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_SOLICITUD_ESTADO.SP_INS_SOLICITUD_ESTADO(?)",se.getNombre());

	}

	@Override
	public int update(Solicitud_Estado se) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_SOLICITUD_ESTADO.SP_INS_SOLICITUD_ESTADO(?,?)",se.getId_solestado(),
				se.getNombre());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_SOLICITUD_ESTADO.SOLICITUD_ESTADO(?)", id);
	}

	@Override
	public Map<String, Object> buscar(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_SOLICITUD_ESTADO").withProcedureName("SP_BUS_SOLICITUD_ESTADO").
			declareParameters(new SqlOutParameter("CUR_SOLICITUD_ESTADO", OracleTypes.CURSOR,
			new ColumnMapRowMapper()), new SqlOutParameter("ID_SOLICITUD_ESTADO", Types.INTEGER));
			SqlParameterSource in = new MapSqlParameterSource().addValue("ID_SOLICITUD_ESTADO", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> listar() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_SOLICITUD_ESTADO").withProcedureName("SP_LIS_SOLICITUD_ESTADO").
				declareParameters(new SqlOutParameter("CUR_SOLICITUD_ESTADO", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

}
