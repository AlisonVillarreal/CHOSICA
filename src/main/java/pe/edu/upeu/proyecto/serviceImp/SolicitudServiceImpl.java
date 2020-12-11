package pe.edu.upeu.proyecto.serviceImp;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.proyecto.dao.SolicitudDao;
import pe.edu.upeu.proyecto.entity.Solicitud;
import pe.edu.upeu.proyecto.service.SolicitudService;
@Service
public class SolicitudServiceImpl  implements SolicitudService{

@Autowired
private SolicitudDao solicitudDao;
@Override
public int create(Solicitud s) {
	// TODO Auto-generated method stub
	return solicitudDao.create(s);
}

@Override
public int update(Solicitud s) {
	// TODO Auto-generated method stub
	return solicitudDao.update(s);
}

@Override
public int delete(int id) {
	// TODO Auto-generated method stub
	return solicitudDao.delete(id);
}

@Override
public Map<String, Object> buscar(int id) {
	// TODO Auto-generated method stub
	return solicitudDao.buscar(id);
}

@Override
public Map<String, Object> listar() {
	// TODO Auto-generated method stub
	return solicitudDao.listar();
}

}
