package pe.edu.upeu.proyecto.serviceImp;


import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSendException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmailSendService {
	
	private JavaMailSender javaMailSender;
	private Logger logger = LoggerFactory.getLogger(EmailSendService.class);

	@Autowired
	public EmailSendService(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}

	@Async
	public void sendEmail(SimpleMailMessage email) {
		javaMailSender.send(email);
	}
	/**
	 * metodo que envia correo electronico
	 * @param from - parametro correo desde donde se enviará
	 * @param to - parametro correo a quien se enviara el mensaje
	 * @param cc - parametro correo copia a quien se enviara el mensaje
	 * @param subject - parametro asunto del correo electronico
	 * @param msg - parametro cuerpo o mensaje del correo electronico
	 * @return parametro true si se envio satisfactoriamente sino false
	 */
	@Async
	public Boolean sendEmailHTML( String to, String subject, String msg) {
		boolean result = true;
		try {
			MimeMessage message = javaMailSender.createMimeMessage();

			message.setSubject(subject);
			MimeMessageHelper helper;
			helper = new MimeMessageHelper(message, true, "utf-8");
		
			helper.setTo(to);
			helper.setText(msg, true);
			javaMailSender.send(message);
		} catch (MessagingException|MailSendException ex) {
			logger.error("EmailSendService.sendEmailHTML : {}", ex.getMessage());
			result = false;
		}
		return result;
	}

}
