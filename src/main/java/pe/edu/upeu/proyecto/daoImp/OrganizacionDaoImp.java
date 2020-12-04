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
import pe.edu.upeu.proyecto.dao.OrganizacionDao;
import pe.edu.upeu.proyecto.entity.Organizacion;
@Component
public class OrganizacionDaoImp implements OrganizacionDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Organizacion o) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_ORGANIZACION.SP_INS_ORGANIZACION(?,?,?,?,?,?,?,?,?)", o.getId_tipodeno(),
				o.getId_org_padre(), o.getNombreorg(), o.getNumpartreg(), o.getTotalmiembros(), o.getFec_iniactv(), 
				o.getFec_registro(), o.getFec_vigencia(), o.getEstado());
	}

	@Override
	public int update(Organizacion o) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_ORGANIZACION.SP_UPD_ORGANIZACION(?,?,?,?,?,?,?,?,?,?)", o.getId_organizacion(),
				o.getId_tipodeno(), o.getId_org_padre(), o.getNombreorg(), o.getNumpartreg(), o.getTotalmiembros(),
				o.getFec_iniactv(), o.getFec_registro(), o.getFec_vigencia(), o.getEstado());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_ORGANIZACION.SP_DEL_ORGANIZACION(?)", id);
	}

	@Override
	public Map<String, Object> buscar(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_ORGANIZACION").withProcedureName("SP_BUS_ORGANIZACION").
			declareParameters(new SqlOutParameter("CUR_ORGANIZACION", OracleTypes.CURSOR,
			new ColumnMapRowMapper()), new SqlOutParameter("ID_ORGANIZACION", Types.INTEGER));
			SqlParameterSource in = new MapSqlParameterSource().addValue("ID_ORGANIZACION", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> listar() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_ORGANIZACION").withProcedureName("SP_LIS_ORGANIZACION").
				declareParameters(new SqlOutParameter("CUR_ORGANIZACION", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

}
