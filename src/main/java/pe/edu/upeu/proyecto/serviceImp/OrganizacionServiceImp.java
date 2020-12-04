package pe.edu.upeu.proyecto.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.proyecto.dao.OrganizacionDao;
import pe.edu.upeu.proyecto.entity.Organizacion;
import pe.edu.upeu.proyecto.service.OrganizacionService;
@Service
public class OrganizacionServiceImp implements OrganizacionService{
	@Autowired
	private OrganizacionDao organizacionDao;
	@Override
	public int create(Organizacion o) {
		// TODO Auto-generated method stub
		return organizacionDao.create(o);
	}

	@Override
	public int update(Organizacion o) {
		// TODO Auto-generated method stub
		return organizacionDao.update(o);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return organizacionDao.delete(id);
	}

	@Override
	public Map<String, Object> buscar(int id) {
		// TODO Auto-generated method stub
		return organizacionDao.buscar(id);
	}

	@Override
	public Map<String, Object> listar() {
		// TODO Auto-generated method stub
		return organizacionDao.listar();
	}

}
