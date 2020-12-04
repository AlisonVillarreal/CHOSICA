package pe.edu.upeu.proyecto;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.proyecto.dao.Historial_OrgDirectivoDao;
import pe.edu.upeu.proyecto.dao.Organizacion_PersonaDao;
import pe.edu.upeu.proyecto.dao.ResolucionDao;

@SpringBootTest
class ProyectoApplicationTests {	
	@Autowired
	//private ResolucionDao resol;
	//private Historial_OrgDirectivoDao histo;
	private Organizacion_PersonaDao orgperso;

	@Test
	void contextLoads() {
		System.out.println(orgperso.readAll());
	}

}
