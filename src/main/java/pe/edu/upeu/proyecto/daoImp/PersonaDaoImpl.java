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

import oracle.jdbc.OracleTypes;
import pe.edu.upeu.proyecto.dao.PersonaDao;
import pe.edu.upeu.proyecto.entity.Persona;

@Component
public class PersonaDaoImpl implements PersonaDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(Persona persona) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_PERSONA.SP_INS_PERSONA(?,?,?,?,?,?,?,?,?,?,?,?)", persona.getId_tipodoc(), 
																	persona.getId_estcivil(),persona.getNombres(), persona.getApepat(),
																	persona.getApemat(), persona.getNumero_doc(), persona.getSexo(), 
																	persona.getFec_nac(), persona.getDireccion(), persona.getTelefono(),
																	persona.getCorreo(), persona.getFallecido());
	}

	@Override
	public int update(Persona persona) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_PERSONA.SP_UPD_PERSONA(?,?,?,?,?,?,?,?,?,?,?,?,?)", persona.getIdpersona(),
												 persona.getId_tipodoc(), persona.getId_estcivil(),persona.getNombres(),
												 persona.getApepat(), persona.getApemat(), persona.getNumero_doc(),
												 persona.getSexo(), persona.getFec_nac(), persona.getDireccion(),
												 persona.getTelefono(), persona.getCorreo(), persona.getFallecido());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_PERSONA.SP_DEL_PERSONA(?)", id);
	}

	@Override
	public Map<String, Object> buscar(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_PERSONA").withProcedureName("SP_BUS_PERSONA")
				 .declareParameters(new SqlOutParameter("CUR_PERSONA", OracleTypes.CURSOR,
				  new ColumnMapRowMapper()), new SqlParameter("ID_PERSONA", Types.INTEGER));
				  SqlParameterSource in = new MapSqlParameterSource().addValue("ID_PERSONA", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> listar() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_PERSONA").withProcedureName("SP_LIS_PERSONA")
				.declareParameters(new SqlOutParameter("CUR_PERSONA", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		
		return simpleJdbcCall.execute();
	}

}
