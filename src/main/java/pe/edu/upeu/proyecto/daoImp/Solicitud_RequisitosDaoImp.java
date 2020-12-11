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
import pe.edu.upeu.proyecto.dao.Solicitud_RequisitosDao;
import pe.edu.upeu.proyecto.entity.Solicitud_Requisitos;
@Component
public class Solicitud_RequisitosDaoImp implements Solicitud_RequisitosDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Solicitud_Requisitos sr) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_SOLICITUD_REQUISITOS.SP_INS_SOLICITUD_REQUISITOS(?,?,?,?,?,?)", sr.getId_solicitudorg(),
				sr.getId_requisito(), sr.getId_usuariorev(), sr.getArchivo(), sr.getFec_revision(), sr.getEstado());
	}

	@Override
	public int update(Solicitud_Requisitos sr) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_SOLICITUD_REQUISITOS.SP_UPD_SOLICITUD_REQUISITOS(?,?,?,?,?,?,?)", sr.getId_solrequisito(),
				sr.getId_solicitudorg(), sr.getId_requisito(), sr.getId_usuariorev(), sr.getArchivo(), sr.getFec_revision(), sr.getEstado());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_SOLICITUD_REQUISITOS.SP_DEL_SOLICITUD_REQUISITOS(?)", id);
	}

	@Override
	public Map<String, Object> buscar(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_SOLICITUD_REQUISITOS").withProcedureName("SP_BUS_SOLICITUD_REQUISITOS")
				.declareParameters(new SqlOutParameter("CUR_SOLICITUD_REQUISITOS", OracleTypes.CURSOR, new ColumnMapRowMapper()),
				new SqlOutParameter("ID_SOLICITUD_REQUISITOS", Types.INTEGER));
		SqlParameterSource lol = new MapSqlParameterSource().addValue("ID_SOLICITUD_REQUISITOS", id);
		return simpleJdbcCall.execute(lol);
	}

	@Override
	public Map<String, Object> listar() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_SOLICITUD_REQUISITOS").withProcedureName("SP_BUS_SOLICITUD_REQUISITOS")
				.declareParameters(new SqlOutParameter("CUR_SOLICITUD_REQUISITOS", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}
	
}
