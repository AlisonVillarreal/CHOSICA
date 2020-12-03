package pe.edu.upeu.proyecto.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.proyecto.dao.Historial_OrgDirectivoDao;
import pe.edu.upeu.proyecto.service.Historial_OrgDirectivoService;
@Service
public class Historial_OrgDirectivoServiceImpl implements Historial_OrgDirectivoService {
	@Autowired
	private Historial_OrgDirectivoDao historial_OrgDirectivoDao;

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return historial_OrgDirectivoDao.readAll();
	}

}
