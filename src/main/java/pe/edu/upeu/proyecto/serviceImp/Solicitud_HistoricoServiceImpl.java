package pe.edu.upeu.proyecto.serviceImp;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.proyecto.dao.Solicitud_HistoricoDao;
import pe.edu.upeu.proyecto.entity.Solicitud_Historico;
import pe.edu.upeu.proyecto.service.Solicitud_HistoricoService;
@Service
public class Solicitud_HistoricoServiceImpl implements Solicitud_HistoricoService{
	@Autowired
	private Solicitud_HistoricoDao solicitud_historicoDao;
	@Override
	public int create(Solicitud_Historico sh) {
		// TODO Auto-generated method stub
		return solicitud_historicoDao.create(sh);
	}

	@Override
	public int update(Solicitud_Historico sh) {
		// TODO Auto-generated method stub
		return solicitud_historicoDao.update(sh);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return solicitud_historicoDao.delete(id);
	}

	@Override
	public Map<String, Object> buscar(int id) {
		// TODO Auto-generated method stub
		return solicitud_historicoDao.buscar(id);
	}

	@Override
	public Map<String, Object> listar() {
		// TODO Auto-generated method stub
		return solicitud_historicoDao.listar();
	}
}
