package pe.edu.upeu.proyecto.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.proyecto.dao.Tipo_SolicitudDao;
import pe.edu.upeu.proyecto.entity.Tipo_Solicitud;
import pe.edu.upeu.proyecto.service.Tipo_SolicitudService;
@Service
public class Tipo_SolicitudServiceImp implements Tipo_SolicitudService{
	@Autowired
	private Tipo_SolicitudDao tipo_solicitudDao;
	@Override
	public int create(Tipo_Solicitud tp) {
		// TODO Auto-generated method stub
		return tipo_solicitudDao.create(tp);
	}

	@Override
	public int update(Tipo_Solicitud tp) {
		// TODO Auto-generated method stub
		return tipo_solicitudDao.update(tp);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return tipo_solicitudDao.delete(id);
	}

	@Override
	public Map<String, Object> buscar(int id) {
		// TODO Auto-generated method stub
		return tipo_solicitudDao.buscar(id);
	}

	@Override
	public Map<String, Object> listar() {
		// TODO Auto-generated method stub
		return tipo_solicitudDao.listar();
	}

}
