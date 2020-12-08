package pe.edu.upeu.proyecto.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.proyecto.dao.Tipo_OrganizacionDao;
import pe.edu.upeu.proyecto.entity.Tipo_Organizacion;
import pe.edu.upeu.proyecto.service.Tipo_OrganizacionService;

@Service
public class Tipo_OrganizacionServiceImpl implements Tipo_OrganizacionService{
@Autowired
	private Tipo_OrganizacionDao tipo_OrganizaionDao;

@Override
public int create(Tipo_Organizacion o) {
	// TODO Auto-generated method stub
	return tipo_OrganizaionDao.create(o);
}

@Override
public int update(Tipo_Organizacion o) {
	// TODO Auto-generated method stub
	return tipo_OrganizaionDao.update(o);
}

@Override
public int delete(int id) {
	// TODO Auto-generated method stub
	return tipo_OrganizaionDao.delete(id);
}

@Override
public Map<String, Object> read(int id) {
	// TODO Auto-generated method stub
	return tipo_OrganizaionDao.read(id);
}

@Override
public Map<String, Object> readAll() {
	// TODO Auto-generated method stub
	return tipo_OrganizaionDao.readAll();
}

	

}
