package pe.edu.upeu.proyecto;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.proyecto.dao.Historial_OrgDirectivoDao;
import pe.edu.upeu.proyecto.dao.Organizacion_PersonaDao;
import pe.edu.upeu.proyecto.dao.ResolucionDao;
import pe.edu.upeu.proyecto.dao.SolicitudDao;
import pe.edu.upeu.proyecto.entity.Organizacion;

@SpringBootTest
class ProyectoApplicationTests {
    @Autowired
    //private ResolucionDao resol;
    //private Historial_OrgDirectivoDao histo;
    //private Organizacion_PersonaDao orgperso;
    private SolicitudDao solidao;
    
    @Test
    void contextLoads() {
    	Organizacion org = new Organizacion();
    	org.setNombreorg("Programadores");
    	org.setId_tipodeno(1);
    	org.setNumpartreg("347837555");
    	org.setTotalmiembros(153);
    	org.setFec_iniactv("12/12/2018");
    	solidao.create(23, org);
    }
}