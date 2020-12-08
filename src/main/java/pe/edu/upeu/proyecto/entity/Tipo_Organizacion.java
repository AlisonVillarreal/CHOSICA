package pe.edu.upeu.proyecto.entity;

public class Tipo_Organizacion {
	private int id_tiporg;
	private String nombre;
	private String estado;
	public Tipo_Organizacion() {
	
	}
	public Tipo_Organizacion(int id_tiporg, String nombre, String estado) {
		super();
		this.id_tiporg = id_tiporg;
		this.nombre = nombre;
		this.estado = estado;
	}
	public int getId_tiporg() {
		return id_tiporg;
	}
	public void setId_tiporg(int id_tiporg) {
		this.id_tiporg = id_tiporg;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	

}
