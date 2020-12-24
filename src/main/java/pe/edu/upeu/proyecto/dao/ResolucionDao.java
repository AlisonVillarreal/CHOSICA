package pe.edu.upeu.proyecto.dao;

import java.util.Map;

import javax.mail.MessagingException;

public interface ResolucionDao {
	int notificar ( int  id );
	public void send(String to, String subject, String body)throws MessagingException;
    Map< String , Object >  read( int id );
	Map< String , Object >  readAll();

}
