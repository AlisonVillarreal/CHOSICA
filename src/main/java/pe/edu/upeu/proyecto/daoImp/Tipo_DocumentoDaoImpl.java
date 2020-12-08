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
import pe.edu.upeu.proyecto.dao.Tipo_DocumentoDao;
import pe.edu.upeu.proyecto.entity.Tipo_Documento;

@Component
public class Tipo_DocumentoDaoImpl implements Tipo_DocumentoDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(Tipo_Documento tipo_documento) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_TIPO_DOCUMENTO.SP_INS_TIPO_DOCUMENTO(?,?,?)", tipo_documento.getNombre(),
															tipo_documento.getAbreviativo(), tipo_documento.getLongitud());
	}

	@Override
	public int update(Tipo_Documento tipo_documento) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_TIPO_DOCUMENTO.SP_UPD_TIPO_DOCUMENTO(?,?,?,?)", tipo_documento.getId_tipodoc(),
															tipo_documento.getNombre(), tipo_documento.getAbreviativo(),
															tipo_documento.getLongitud());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_TIPO_DOCUMENTO.SP_DEL.TIPO_DOCUMENTO(?)", id);
	}

	@Override
	public Map<String, Object> buscar(int id) {
		// TODO Auto-generated method stub
		
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_TIPO_DOCUMENTO").withProcedureName("SP_BUS_TIPO_DOCUMENTO")
				.declareParameters(new SqlOutParameter("CUR_TIPO_DOCUMENTO", OracleTypes.CURSOR, new ColumnMapRowMapper()),
						new SqlOutParameter("ID_TIPO_DOCUMENTO", Types.INTEGER));
		
		SqlParameterSource dato = new MapSqlParameterSource().addValue("ID_TIPO_DOCUMENTO", id);
		
		return simpleJdbcCall.execute(dato);
	}

	@Override
	public Map<String, Object> listar() {
		// TODO Auto-generated method stub
		
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_TIPO_DOCUMENTO").withProcedureName("SP_LIS_TIPO_DOCUMENTO")
				.declareParameters(new SqlOutParameter("CUR_TIPO_DOCUMENTO", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		
		return simpleJdbcCall.execute();
	}

}
