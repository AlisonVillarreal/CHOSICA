package pe.edu.upeu.proyecto.entity;

public class Solicitud_Estado {
	private int id_solestado;
	private String nombre;
	public Solicitud_Estado() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Solicitud_Estado(int id_solestado, String nombre) {
		super();
		this.id_solestado = id_solestado;
		this.nombre = nombre;
	}
	public int getId_solestado() {
		return id_solestado;
	}
	public void setId_solestado(int id_solestado) {
		this.id_solestado = id_solestado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}