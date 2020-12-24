package pe.edu.upeu.proyecto.serviceImp;

import java.util.Map;

import javax.mail.MessagingException;

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

	@Override
	public int notificar(int id) {
		// TODO Auto-generated method stub
		return resolucionDao.notificar(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return resolucionDao.read(id);
	}

	@Override
	public void send(String to, String subject, String body) throws MessagingException {
		// TODO Auto-generated method stub
		
	}

}
