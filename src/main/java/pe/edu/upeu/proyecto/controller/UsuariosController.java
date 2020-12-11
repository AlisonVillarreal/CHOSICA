package pe.edu.upeu.proyecto.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.proyecto.entity.Persona;
import pe.edu.upeu.proyecto.entity.Usuario;
import pe.edu.upeu.proyecto.service.UsuarioService;

import com.google.gson.Gson;

@CrossOrigin(origins = "*", allowedHeaders = " ")
@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
	@Autowired UsuarioService usuarioService;

	@PostMapping("/registrosol")
	public int Registersol (@RequestBody String body) {
		Gson gson = new Gson();
		Persona persona = gson.fromJson(body, Persona.class);
		Usuario usuario = gson.fromJson(body, Usuario.class);
		return usuarioService.regUsuario(usuario.getClave(), persona); //
	}
	
	@PostMapping("/registro")
	public int Register (@RequestBody String body) {
		Gson gson = new Gson();
		Usuario usuario = gson.fromJson(body, Usuario.class);
		return usuarioService.create(usuario); //
	}

	@GetMapping("/lista")
	public List<Map<String, Object>> getAllUsers() {
		return usuarioService.getAllUsers();
	}
	@GetMapping("/list")
	public List<Usuario> getAll() {
		return usuarioService.getAll();
	}
	@GetMapping("/{id}")
	public Usuario getById(@PathVariable int id) {
		return usuarioService.read(id);
	}
	@PutMapping("/edit/{id}")
	public int updUsuario(@PathVariable int id, @RequestBody Usuario usuario) {
		usuario.setId_usuario(id);
		return usuarioService.updUsuario(usuario);
	}
	@DeleteMapping("/{id}")
	public int delete(@PathVariable int id) {
		return usuarioService.delete(id);
	}
}
