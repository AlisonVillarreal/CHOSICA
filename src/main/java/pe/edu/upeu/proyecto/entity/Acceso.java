package pe.edu.upeu.proyecto.entity;

public class Acceso {
private int id_acceso;
private String nombre;
private String url;
private String icono;

public Acceso(int id_acceso, String nombre, String url, String icono) {
	super();
	this.id_acceso = id_acceso;
	this.nombre = nombre;
	this.url = url;
	this.icono = icono;
}

public Acceso() {
	
}


public int getId_acceso() {
	return id_acceso;
}
public void setId_acceso(int id_acceso) {
	this.id_acceso = id_acceso;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getIcono() {
	return icono;
}
public void setIcono(String icono) {
	this.icono = icono;
}



}
