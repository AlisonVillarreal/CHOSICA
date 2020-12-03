package pe.edu.upeu.proyecto.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.proyecto.dao.Estado_CivilDao;
import pe.edu.upeu.proyecto.entity.Estado_Civil;
import pe.edu.upeu.proyecto.service.Estado_CivilService;

@Service
public class Estado_CivilServiceImpl implements Estado_CivilService {

	@Autowired
	private Estado_CivilDao estado_CivilDao;
	
	@Override
	public int create(Estado_Civil estado_civil) {
		// TODO Auto-generated method stub
		return estado_CivilDao.create(estado_civil);
	}

	@Override
	public int update(Estado_Civil estado_civil) {
		// TODO Auto-generated method stub
		return estado_CivilDao.update(estado_civil);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return estado_CivilDao.delete(id);
	}

	@Override
	public Map<String, Object> buscar(int id) {
		// TODO Auto-generated method stub
		return estado_CivilDao.buscar(id);
	}

	@Override
	public Map<String, Object> listar() {
		// TODO Auto-generated method stub
		return estado_CivilDao.listar();
	}

}
