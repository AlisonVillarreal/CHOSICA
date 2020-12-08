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
import pe.edu.upeu.proyecto.dao.Tipo_DenominacionDao;
import pe.edu.upeu.proyecto.entity.Tipo_Denominacion;
@Repository
@Component
public class Tipo_DenominacionDaoImpl implements Tipo_DenominacionDao{
@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Tipo_Denominacion d) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_TIPO_DENOMINACION.SP_INS_TIPO_DENOMINACION(?,?,?)", d.getId_tiporg(), d.getNombre(), d.getEstado());
	}

	@Override
	public int update(Tipo_Denominacion d) {
		// TODO Auto-generated method stub
		return  jdbcTemplate.update("call PKG_TIPO_DENOMINACION.SP_INS_UPD_DENOMINACION(?,?,?,?)", d.getId_tipodeno(), d.getId_tiporg(), d.getNombre(), d.getEstado());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_TIPO_DENOMINACION.SP_DEL_TIPO_DENOMINACION(?)", id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_TIPO_DENOMINACION")
				.withProcedureName("SP_BUS_TIPO_DENOMINACION")
				.declareParameters(new SqlOutParameter("CUR_TIPO_DENOMINACION", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("ID_TIPODENO", Types.INTEGER));
				SqlParameterSource in = new MapSqlParameterSource().addValue("ID_TIPODENO", id);
				return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_TIPO_DENOMINACION") //nombre del paquete
				.withProcedureName("SP_LIS_TIPO_DENOMINACION") //nombre del procedimiento
				.declareParameters(new SqlOutParameter("CUR_TIPO_DENOMINACION", OracleTypes.CURSOR, new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();
	}

}
