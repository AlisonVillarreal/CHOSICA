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
import pe.edu.upeu.proyecto.dao.Tipo_SolicitudDao;
import pe.edu.upeu.proyecto.entity.Tipo_Solicitud;
@Component
public class Tipo_SolicitudDaoImp implements Tipo_SolicitudDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Tipo_Solicitud tp) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_TIPO_SOLICITUD.SP_INS_TIPO_SOLICITUD(?)", tp.getNombre());
	}

	@Override
	public int update(Tipo_Solicitud tp) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_TIPO_SOLICITUD.SP_INS_TIPO_SOLICITUD(?,?)", tp.getId_tiposol(),tp.getNombre());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_TIPO_SOLICITUD.SP_DEL_TIPO_SOLICITUD(?)", id);
	}

	@Override
	public Map<String, Object> buscar(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_TIPO_DOCUMENTO").withProcedureName("SP_BUS_TIPO_DOCUMENTO")
				.declareParameters(new SqlOutParameter("CUR_TIPO_DOCUMENTO", OracleTypes.CURSOR, new ColumnMapRowMapper()),
						new SqlOutParameter("ID_TIPO_DOCUMENTO", Types.INTEGER));
		SqlParameterSource end = new MapSqlParameterSource().addValue("ID_TIPO_DOCUMENTO", id);
		return simpleJdbcCall.execute(end);
	}

	@Override
	public Map<String, Object> listar() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_TIPO_SOLICITUD").withProcedureName("SP_BUS_TIPO_SOLICITUD")
				.declareParameters(new SqlOutParameter("CUR_TIPO_SOLICITUD", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

}
