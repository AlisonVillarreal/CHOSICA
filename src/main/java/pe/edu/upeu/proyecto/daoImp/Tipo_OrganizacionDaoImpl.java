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
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import oracle.jdbc.internal.OracleTypes;
import pe.edu.upeu.proyecto.dao.Tipo_OrganizacionDao;
import pe.edu.upeu.proyecto.entity.Tipo_Organizacion;
@Repository
@Component
public class Tipo_OrganizacionDaoImpl implements Tipo_OrganizacionDao{
@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Tipo_Organizacion o) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_TIPO_ORGANIZACION.SP_INS_TIPO_ORGANIZACION(?,?)", o.getNombre(), o.getEstado());
	}

	@Override
	public int update(Tipo_Organizacion o) {
		// TODO Auto-generated method stub
		return  jdbcTemplate.update("call PKG_TIPO_ORGANIZACION.SP_UPD_TIPO_ORGANIZACION(?,?,?)", o.getId_tiporg(),o.getNombre(),o.getEstado());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_TIPO_ORGANIZACION.SP_DEL_TIPO_ORGANIZACION(?)", id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_TIPO_ORGANIZACION")
				.withProcedureName("SP_BUS_TIPO_ORGANIZACION")
				.declareParameters(new SqlOutParameter("CUR_TIPO_ORGANIZACION", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("ID_TIPORG", Types.INTEGER));
				SqlParameterSource in = new MapSqlParameterSource().addValue("ID_TIPORG", id);
				return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_TIPO_ORGANIZACION") //nombre del paquete
				.withProcedureName("SP_LIS_TIPO_ORGANIZACION") //nombre del procedimiento
				.declareParameters(new SqlOutParameter("CUR_TIPO_ORGANIZACION", OracleTypes.CURSOR, new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();
	}

	@Override
	public List<Map<String, Object>> listar2() {
		// TODO Auto-generated method stub
		List<Map<String,Object>> organizacion = new ArrayList<>();
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_TIPO_ORGANIZACION") //nombre del paquete
				.withProcedureName("SP_LIS_TIPO_ORGANIZACION") //nombre del procedimiento
				.declareParameters(new SqlOutParameter("CUR_TIPO_ORGANIZACION", OracleTypes.REF_CURSOR, new ColumnMapRowMapper()));	
				Map<String, Object> map = simpleJdbcCall.execute();
				organizacion.add(map);
		return organizacion;
	}
}
