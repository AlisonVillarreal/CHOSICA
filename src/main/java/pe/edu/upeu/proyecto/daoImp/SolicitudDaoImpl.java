package pe.edu.upeu.proyecto.daoImp;
import java.sql.Types;

import java.text.SimpleDateFormat;
import java.util.Date;
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
import pe.edu.upeu.proyecto.dao.SolicitudDao;
import pe.edu.upeu.proyecto.entity.Organizacion;
import pe.edu.upeu.proyecto.entity.Solicitud;

@Component
public class SolicitudDaoImpl implements SolicitudDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
		@Override
		public int create(int id_usuariosol, Organizacion org) {
			
			//this.s.getFec_registro() = new SimpleDateFormat("dd-MM-yyyy").format(fecha);
			//Solicitud soli = new Solicitud();
			java.util.Date fecha = new Date();
			String a = new SimpleDateFormat("dd/MM/yyyy").format(fecha);
			
			return jdbcTemplate.update("call PKG_SOLICITUD.SP_INS_SOLICITUD(?,?,?,?,?,?,?)", id_usuariosol, a
					, org.getNombreorg(), org.getNumpartreg(), org.getId_tipodeno(), org.getTotalmiembros(), org.getFec_iniactv());
		}

		@Override
		public int update(Solicitud s) {
			// TODO Auto-generated method stub
			return jdbcTemplate.update("call PKG_SOLICITUD.SP_INS_SOLICITUD(?,?,?,?,?,?,?,?)", s.getId_solicitudorg(),
					s.getId_usuariosol(), s.getId_organizacion(), s.getId_tiposol(), s.getFec_registro(), s.getCodigo_exp(), 
					s.getObservaciones(), s.getId_solestado());
		}

		@Override
		public int delete(int id) {
			// TODO Auto-generated method stub
			return jdbcTemplate.update("call PKG_SOLICITUD.SP_INS_SOLICITUD(?)", id);
		}

		@Override
		public Map<String, Object> buscar(int id) {
			// TODO Auto-generated method stub
			
			simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_SOLICITUD").withProcedureName("SP_BUS_SOLICITUD")
					.declareParameters(new SqlOutParameter("CUR_SOLICITUD", OracleTypes.CURSOR, new ColumnMapRowMapper()),
							new SqlOutParameter("ID_SOLICITUD", Types.INTEGER));
			
			SqlParameterSource in = new MapSqlParameterSource().addValue("ID_SOLICITUD", id);
			
			return simpleJdbcCall.execute(in);
		}

		@Override
		public Map<String, Object> listar() {
			// TODO Auto-generated method stub
			simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_SOLICITUD").withProcedureName("SP_BUS_SOLICITUD")
					.declareParameters(new SqlOutParameter("CUR_SOLICITUD", OracleTypes.CURSOR, new ColumnMapRowMapper()));
			
		
			return simpleJdbcCall.execute();
		}

}
