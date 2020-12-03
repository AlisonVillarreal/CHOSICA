package pe.edu.upeu.proyecto.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.proyecto.dao.ResolucionDao;
import pe.edu.upeu.proyecto.service.ResolucionService;
@Service
public class ResolucionServiceImpl implements ResolucionService {
	@Autowired
	private ResolucionDao resolucionDao;

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return resolucionDao.readAll();
	}

}
