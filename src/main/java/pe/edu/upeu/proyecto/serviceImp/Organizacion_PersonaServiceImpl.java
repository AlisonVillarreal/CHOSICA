package pe.edu.upeu.proyecto.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.proyecto.dao.Organizacion_PersonaDao;
import pe.edu.upeu.proyecto.service.Organizacion_PersonaService;
@Service
public class Organizacion_PersonaServiceImpl  implements Organizacion_PersonaService{
	@Autowired
	private Organizacion_PersonaDao organizacion_PersonaDao;

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return organizacion_PersonaDao.readAll();
	}

}
