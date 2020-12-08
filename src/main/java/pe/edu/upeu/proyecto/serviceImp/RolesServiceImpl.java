package pe.edu.upeu.proyecto.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.proyecto.dao.RolesDao;
import pe.edu.upeu.proyecto.entity.Roles;
import pe.edu.upeu.proyecto.service.RolesService;

@Service
public class RolesServiceImpl implements RolesService{
@Autowired
	private RolesDao rolesDao;

@Override
public int create(Roles r) {
	// TODO Auto-generated method stub
	return rolesDao.create(r);
}

@Override
public int update(Roles r) {
	// TODO Auto-generated method stub
	return rolesDao.update(r);
}

@Override
public int delete(int id) {
	// TODO Auto-generated method stub
	return rolesDao.delete(id);
}

@Override
public Map<String, Object> read(int id) {
	// TODO Auto-generated method stub
	return rolesDao.read(id);
}

@Override
public Map<String, Object> readAll() {
	// TODO Auto-generated method stub
	return rolesDao.readAll();
}


}
