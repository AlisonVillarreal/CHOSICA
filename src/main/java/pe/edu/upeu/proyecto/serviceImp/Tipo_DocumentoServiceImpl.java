package pe.edu.upeu.proyecto.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.proyecto.dao.Tipo_DocumentoDao;
import pe.edu.upeu.proyecto.entity.Tipo_Documento;
import pe.edu.upeu.proyecto.service.Tipo_DocumentoService;

@Service
public class Tipo_DocumentoServiceImpl implements Tipo_DocumentoService {

	@Autowired
	private Tipo_DocumentoDao tipo_DocumentoDao;
	
	@Override
	public int create(Tipo_Documento tipo_documento) {
		// TODO Auto-generated method stub
		return tipo_DocumentoDao.create(tipo_documento);
	}

	@Override
	public int update(Tipo_Documento tipo_documento) {
		// TODO Auto-generated method stub
		return tipo_DocumentoDao.update(tipo_documento);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return tipo_DocumentoDao.delete(id);
	}

	@Override
	public Map<String, Object> buscar(int id) {
		// TODO Auto-generated method stub
		return tipo_DocumentoDao.buscar(id);
	}

	@Override
	public Map<String, Object> listar() {
		// TODO Auto-generated method stub
		return tipo_DocumentoDao.listar();
	}

}
