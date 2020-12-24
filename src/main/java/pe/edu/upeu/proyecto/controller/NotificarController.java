package pe.edu.upeu.proyecto.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.proyecto.service.ResolucionService;
import pe.edu.upeu.proyecto.serviceImp.EmailSendService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/Notificar")
public class NotificarController {
	@Autowired
	private EmailSendService emailSendService;
	
	
	@RequestMapping("/send-mail/{to}")
	public void sendMail( @PathVariable String to) throws MessagingException{
		emailSendService.sendEmailHTML( to, "Muni", "Su Resolucion fue Emitida...");
	 
	}


}
