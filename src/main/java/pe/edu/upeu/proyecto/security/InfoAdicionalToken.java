package pe.edu.upeu.proyecto.security;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

import pe.edu.upeu.proyecto.dao.AccesoDao;
import pe.edu.upeu.proyecto.dao.UsuarioDao;
import pe.edu.upeu.proyecto.entity.Usuario;



@Component
public class InfoAdicionalToken implements TokenEnhancer{
	@Autowired
	private UsuarioDao usuarioDao;
	@Autowired
	private AccesoDao accesoDao;
Gson g = new Gson();
	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		Usuario user = usuarioDao.read(authentication.getName());
		List<Map<String,Object>> accesos = new ArrayList<>();
		accesos = accesoDao.getAccesos(user.getId_usuario());
		List<Map<String,Object>> grupos = new ArrayList<>();
		grupos = accesoDao.getAcsGrupo(user.getId_usuario());
		Map<String, Object> datos= new HashMap<>();
		datos.put("iduser", user.getId_usuario());
		datos.put("nombre", user.getNombre());
		datos.put("user", user.getUsuario());
		datos.put("grupos", grupos);
		datos.put("accesos", accesos);
		
		
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(datos);

		return accessToken;
	}

}
