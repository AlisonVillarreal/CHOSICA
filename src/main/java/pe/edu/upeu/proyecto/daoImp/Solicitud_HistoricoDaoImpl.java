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

import pe.edu.upeu.proyecto.dao.Solicitud_HistoricoDao;
import pe.edu.upeu.proyecto.entity.Solicitud_Historico;
@Component
public class Solicitud_HistoricoDaoImpl implements Solicitud_HistoricoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Solicitud_Historico sh) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_SOLICITUD_HISTORICO.SP_INS_SOLICITUD_HISTORICO(?,?,?,?,?,?)",sh.getId_solicitudorg(),
				sh.getId_solestado(), sh.getId_usuarioact(), sh.getFec_act(), sh.getFec_act(), sh.getEstado());

	}

	@Override
	public int update(Solicitud_Historico sh) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_SOLICITUD_HISTORICO.SP_INS_SOLICITUD_HISTORICO(?,?,?,?,?,?)",sh.getId_solicitudorg(),
				sh.getId_solestado(), sh.getId_usuarioact(), sh.getFec_act(), sh.getFec_act(), sh.getEstado());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_SOLICITUD_HISTORICO.SOLICITUD_HISTORICO(?)", id);
	}

	@Override
	public Map<String, Object> buscar(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_SOLICITUD_HISTORICO").withProcedureName("SP_BUS_SOLICITUD_HISTORICO").
			declareParameters(new SqlOutParameter("CUR_SOLICITUD_HISTORICO", OracleTypes.CURSOR,
			new ColumnMapRowMapper()), new SqlOutParameter("ID_SOLICITUD_HISTORICO", Types.INTEGER));
			SqlParameterSource in = new MapSqlParameterSource().addValue("ID_SOLICITUD_HISTORICO", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> listar() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_SOLICITUD_HISTORICO").withProcedureName("SP_LIS_SOLICITUD_HISTORICO").
				declareParameters(new SqlOutParameter("CUR_SOLICITUD_HISTORICO", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
}
