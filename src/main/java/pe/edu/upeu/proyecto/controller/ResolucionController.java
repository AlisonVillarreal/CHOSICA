package pe.edu.upeu.proyecto.controller;

import java.util.Map;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.proyecto.daoImp.ResolucionDaoImpl;
import pe.edu.upeu.proyecto.service.ResolucionService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/Resoluciones")

public class ResolucionController {
	@Autowired
	private ResolucionService resolucionService;
	
	@GetMapping("/all")
	public Map<String, Object> readAll(){
		return resolucionService.readAll();
				
	}
	@PutMapping("/update/notificar/{id}")
	public int notificar(@PathVariable int id) {
		System.out.println(id);
		return resolucionService.notificar(id);
	}
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id ) {
		try {
			 return resolucionService.read(id);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
			return null;
		}
	}
	 @RequestMapping("/send-mail")
		public void sendMail() throws MessagingException{
		 resolucionService.send("carlosanamurov@upeu.edu.pe", "Municipalidad Lurigancho Chosica", "Sr. Representante33 "); 
		}

}
