package pe.edu.upeu.proyecto;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import oracle.jdbc.OracleTypes;
import pe.edu.upeu.proyecto.dao.AccesoDao;
import pe.edu.upeu.proyecto.dao.Historial_OrgDirectivoDao;
import pe.edu.upeu.proyecto.dao.Organizacion_PersonaDao;
import pe.edu.upeu.proyecto.dao.ResolucionDao;
import pe.edu.upeu.proyecto.dao.SolicitudDao;
import pe.edu.upeu.proyecto.entity.Organizacion;
import pe.edu.upeu.proyecto.dao.UsuarioDao;

@SpringBootTest
class ProyectoApplicationTests {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private SimpleJdbcCall simpleJdbcCall;
    //private ResolucionDao resol;
    //private Historial_OrgDirectivoDao histo;
    //private Organizacion_PersonaDao orgperso;
    private SolicitudDao solidao;
    private AccesoDao accesoDao;
    @Test
    void contextLoads() {
    	//Organizacion org = new Organizacion();
    	//org.setNombreorg("Programadores");
    	//org.setId_tipodeno(1);
    	//org.setNumpartreg("347837555");
    	//org.setTotalmiembros(153);
    	//org.setFec_iniactv("12/12/2018");
    	//solidao.create(23, org);
    	
    	List<Map<String, Object>> accesos = new ArrayList<>();
    	//accesos = accesoDao.getAccesos(4);
    	//System.out.println(accesos.size());
    	int id_user = 4;
		String SQL ="SELECT A.ID_ACCESO, A.NOMBRE, A.URL, A.ICONO "+
			 	"FROM USUARIOS U " + 
				"INNER JOIN ROLES_ACCESOS R ON R.ID_ROL = U.ID_ROL " + 
				"INNER JOIN ACCESO A ON A.ID_ACCESO = R.ID_ACCESO " + 
				"WHERE U.ID_USUARIO = ? " ;
		accesos = jdbcTemplate.queryForList(SQL,new Object[] {id_user});
		System.out.println(accesos);
		
    }
}