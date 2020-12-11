package pe.edu.upeu.proyecto.entity;

public class Rol {
private int idrol;
private String nombre;
private int estado;

public Rol() {
}


public Rol(int idrol, String nombre, int estado) {
	super();
	this.idrol = idrol;
	this.nombre = nombre;
	this.estado = estado;
}


public int getIdrol() {
	return idrol;
}
public void setIdrol(int idrol) {
	this.idrol = idrol;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEstado() {
	return estado;
}
public void setEstado(int estado) {
	this.estado = estado;
} 




}