package pe.edu.upeu.proyecto.serviceImp;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.proyecto.dao.Solicitud_EstadoDao;
import pe.edu.upeu.proyecto.entity.Solicitud_Estado;
import pe.edu.upeu.proyecto.service.Solicitud_EstadoService;
@Service
public class Solicitud_EstadoServiceImpl implements Solicitud_EstadoService{
	@Autowired
	private Solicitud_EstadoDao solicitud_EstadoDao;
	
	@Override
	public int create(Solicitud_Estado se) {
		// TODO Auto-generated method stub
		return solicitud_EstadoDao.create(se);
	}

	@Override
	public int update(Solicitud_Estado se) {
		// TODO Auto-generated method stub
		return solicitud_EstadoDao.update(se);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return solicitud_EstadoDao.delete(id);
	}

	@Override
	public Map<String, Object> buscar(int id) {
		// TODO Auto-generated method stub
		return solicitud_EstadoDao.buscar(id);
	}

	@Override
	public Map<String, Object> listar() {
		// TODO Auto-generated method stub
		return solicitud_EstadoDao.listar();
	}
}
