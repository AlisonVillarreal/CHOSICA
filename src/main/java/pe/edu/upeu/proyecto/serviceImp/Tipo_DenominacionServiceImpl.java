package pe.edu.upeu.proyecto.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.proyecto.dao.Tipo_DenominacionDao;
import pe.edu.upeu.proyecto.entity.Tipo_Denominacion;
import pe.edu.upeu.proyecto.service.Tipo_DenominacionService;

@Service
public class Tipo_DenominacionServiceImpl implements Tipo_DenominacionService{
@Autowired
	private Tipo_DenominacionDao tipo_DenominacionDao;

	@Override
	public int create(Tipo_Denominacion d) {
	// TODO Auto-generated method stub
		return tipo_DenominacionDao.create(d);
	}

	@Override
	public int update(Tipo_Denominacion d) {
	// TODO Auto-generated method stub
		return tipo_DenominacionDao.update(d);
	}

	@Override
	public int delete(int id) {
	// TODO Auto-generated method stub
		return tipo_DenominacionDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
	// TODO Auto-generated method stub
		return tipo_DenominacionDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
	// TODO Auto-generated method stub
		return tipo_DenominacionDao.readAll();
	}
	
	@Override
	public List<Map<String, Object>> listar2() {
        // TODO Auto-generated method stub
        return tipo_DenominacionDao.listar2();
    }
}
