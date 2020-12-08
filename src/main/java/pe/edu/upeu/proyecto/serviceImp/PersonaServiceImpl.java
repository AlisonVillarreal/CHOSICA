package pe.edu.upeu.proyecto.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.proyecto.dao.PersonaDao;
import pe.edu.upeu.proyecto.entity.Persona;
import pe.edu.upeu.proyecto.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService{

	@Autowired
	private PersonaDao personaDao;
	
	
	@Override
	public int create(Persona persona) {
		// TODO Auto-generated method stub
		return personaDao.create(persona);
	}

	@Override
	public int update(Persona persona) {
		// TODO Auto-generated method stub
		return personaDao.update(persona);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return personaDao.delete(id);
	}

	@Override
	public Map<String, Object> buscar(int id) {
		// TODO Auto-generated method stub
		return personaDao.buscar(id);
	}

	@Override
	public Map<String, Object> listar() {
		// TODO Auto-generated method stub
		return personaDao.listar();
	}

}
