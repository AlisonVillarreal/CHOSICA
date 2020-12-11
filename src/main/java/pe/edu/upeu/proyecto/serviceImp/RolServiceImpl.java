package pe.edu.upeu.proyecto.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;
import pe.edu.upeu.proyecto.dao.RolDao;
import pe.edu.upeu.proyecto.entity.Rol;
import pe.edu.upeu.proyecto.service.RolService;

@Service
public class RolServiceImpl implements RolService{
@Autowired
private RolDao rolDao;
	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return rolDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return rolDao.readAll();
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return rolDao.delete(id);
	}
	@Override
	public int updName(Rol r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Rol> getAll() {
		// TODO Auto-generated method stub
		return rolDao.getAll();
	}

	@Override
	public List<GrantedAuthority> buscarRolUser(int iduser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void convertitMap(Map<String, Object> map) {
		// TODO Auto-generated method stub
		
	}

}
