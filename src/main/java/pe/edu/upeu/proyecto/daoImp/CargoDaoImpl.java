package pe.edu.upeu.proyecto.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import oracle.jdbc.internal.OracleTypes;
import pe.edu.upeu.proyecto.dao.CargoDao;
import pe.edu.upeu.proyecto.entity.Cargo;

@Repository
@Component
public class CargoDaoImpl implements CargoDao {
@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public Map<String, Object> listar() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_CARGO") //nombre del paquete
				.withProcedureName("SP_LIS_CARGO") //nombre del procedimiento
				.declareParameters(new SqlOutParameter("CUR_CARGO", OracleTypes.CURSOR, new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();
	} 
	@Override
	public int create(Cargo c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Cargo c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map<String, Object> buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
