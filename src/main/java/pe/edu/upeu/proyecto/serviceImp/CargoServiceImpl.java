package pe.edu.upeu.proyecto.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.proyecto.dao.CargoDao;

import pe.edu.upeu.proyecto.entity.Cargo;
import pe.edu.upeu.proyecto.service.CargoService;

@Service
public class CargoServiceImpl implements CargoService{
	@Autowired
	private CargoDao cargoDao;

	@Override
	public int create(Cargo c) {
		// TODO Auto-generated method stub
		return cargoDao.create(c);
	}

	@Override
	public int update(Cargo c) {
		// TODO Auto-generated method stub
		return cargoDao.update(c);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return cargoDao.delete(id);
	}

	@Override
	public Map<String, Object> buscar(int id) {
		// TODO Auto-generated method stub
		return cargoDao.buscar(id);
	}

	@Override
	public Map<String, Object> listar() {
		// TODO Auto-generated method stub
		return cargoDao.listar();
	}
	
	@Override
	public List<Map<String, Object>> listar2() {
        // TODO Auto-generated method stub
        return cargoDao.listar2();
    }

}
