package pe.edu.upeu.proyecto.entity;

public class Usuario {
private int id_usuario;
private int id_rol;
private int id_persona;
private String nombre;
private String usuario;
private String clave;
private int estado;
private String correo_activacion;



public Usuario(int id_usuario, int id_rol, int id_persona, String nombre, String usuario, String clave, int estado,
		String correo_activacion) {
	super();
	this.id_usuario = id_usuario;
	this.id_rol = id_rol;
	this.id_persona = id_persona;
	this.nombre = nombre;
	this.usuario = usuario;
	this.clave = clave;
	this.estado = estado;
	this.correo_activacion = correo_activacion;
}



public Usuario(int id_usuario, int id_rol, String nombre, String usuario, String clave) {
	super();
	this.id_usuario = id_usuario;
	this.id_rol = id_rol;
	this.nombre = nombre;
	this.usuario = usuario;
	this.clave = clave;
}



public Usuario() {
}

public int getId_usuario() {
	return id_usuario;
}
public void setId_usuario(int id_usuario) {
	this.id_usuario = id_usuario;
}
public int getId_rol() {
	return id_rol;
}
public void setId_rol(int id_rol) {
	this.id_rol = id_rol;
}
public String getUsuario() {
	return usuario;
}
public void setUsuario(String usuario) {
	this.usuario = usuario;
}
public String getClave() {
	return clave;
}
public void setClave(String clave) {
	this.clave = clave;
}
public int getEstado() {
	return estado;
}
public void setEstado(int estado) {
	this.estado = estado;
}

public int getId_persona() {
	return id_persona;
}

public void setId_persona(int id_persona) {
	this.id_persona = id_persona;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getCorreo_activacion() {
	return correo_activacion;
}



public void setCorreo_activacion(String correo_activacion) {
	this.correo_activacion = correo_activacion;
}


}