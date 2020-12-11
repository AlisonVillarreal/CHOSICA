package pe.edu.upeu.proyecto.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.proyecto.dao.Solicitud_RequisitosDao;
import pe.edu.upeu.proyecto.entity.Solicitud_Requisitos;
import pe.edu.upeu.proyecto.service.Solicitud_RequisitosService;
@Service
public class Solicitud_RequisitosServiceImp implements Solicitud_RequisitosService{
	@Autowired
	private Solicitud_RequisitosDao solicitud_requisitosDao;
	@Override
	public int create(Solicitud_Requisitos sr) {
		// TODO Auto-generated method stub
		return solicitud_requisitosDao.create(sr);
	}

	@Override
	public int update(Solicitud_Requisitos sr) {
		// TODO Auto-generated method stub
		return solicitud_requisitosDao.update(sr);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return solicitud_requisitosDao.delete(id);
	}

	@Override
	public Map<String, Object> buscar(int id) {
		// TODO Auto-generated method stub
		return solicitud_requisitosDao.buscar(id);
	}

	@Override
	public Map<String, Object> listar() {
		// TODO Auto-generated method stub
		return solicitud_requisitosDao.listar();
	}

}
