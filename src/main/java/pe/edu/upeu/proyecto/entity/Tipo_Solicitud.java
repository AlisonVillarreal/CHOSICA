package pe.edu.upeu.proyecto.entity;

public class Tipo_Solicitud {
	private int id_tiposol;
	private String nombre;
	public Tipo_Solicitud() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tipo_Solicitud(int id_tiposol, String nombre) {
		super();
		this.id_tiposol = id_tiposol;
		this.nombre = nombre;
	}
	public int getId_tiposol() {
		return id_tiposol;
	}
	public void setId_tiposol(int id_tiposol) {
		this.id_tiposol = id_tiposol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
