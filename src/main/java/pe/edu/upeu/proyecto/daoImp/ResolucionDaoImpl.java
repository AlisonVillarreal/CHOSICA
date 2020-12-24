package pe.edu.upeu.proyecto.daoImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import oracle.jdbc.OracleTypes;
import pe.edu.upeu.proyecto.dao.ResolucionDao;
@Component
public class ResolucionDaoImpl implements ResolucionDao {
	@Autowired
	private  JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simplejdbcCall;
	private JavaMailSender javaMailSender;


	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		List<Map<String,Object>> lista = new ArrayList<>();
		simplejdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_RESOLUCION") //nombre del paquete
				.withProcedureName("SP_LIS_RESOLUCION") //nombre del procedimiento
				.declareParameters(new SqlOutParameter("CUR_RESOLUCION", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		Map<String, Object> map = simplejdbcCall.execute();
		lista.add(map);
		return  simplejdbcCall.execute();
	}


	@Override
	public int notificar(int id) {
		// TODO Auto-generated method stub
		 return jdbcTemplate.update("call pkg_resolucion.sp_notificar(?)",id);
	}


	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		simplejdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_RESOLUCION")
				.withProcedureName("SP_BUS_RESOLUCION")
				.declareParameters(new SqlOutParameter("CURSOR_RESOLUCION", OracleTypes.REF_CURSOR, new ColumnMapRowMapper()), new SqlParameter("id_resolucion", OracleTypes.NUMBER));
				SqlParameterSource in = new MapSqlParameterSource().addValue("VAR_ID_RESOLUCION", id);
		return simplejdbcCall.execute(in);
		
	}
	@Override
	public void send(String to, String subject, String body) throws MessagingException  {
		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper;
		helper = new MimeMessageHelper(message, true);
		helper.setSubject(subject);
		helper.setTo(to);
		helper.setText(body,true);
		
		javaMailSender.send(message);
		System.out.println("fue enviado con exito..!");	
	}

}
