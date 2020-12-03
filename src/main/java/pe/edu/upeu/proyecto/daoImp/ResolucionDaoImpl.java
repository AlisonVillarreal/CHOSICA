package pe.edu.upeu.proyecto.daoImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import oracle.jdbc.OracleTypes;
import pe.edu.upeu.proyecto.dao.ResolucionDao;
@Component
public class ResolucionDaoImpl implements ResolucionDao {
	@Autowired
	private  JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simplejdbcCall;


	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		List<Map<String,Object>> lista = new ArrayList<>();
		simplejdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_RESOLUCION") //nombre del paquete
				.withProcedureName("SP_LIS_RESOLUCION") //nombre del procedimiento
				.declareParameters(new SqlOutParameter("CUR_RESOLUCION", OracleTypes.REF_CURSOR, new ColumnMapRowMapper()));
		Map<String, Object> map = simplejdbcCall.execute();
		lista.add(map);
		return  simplejdbcCall.execute();
	}

}
