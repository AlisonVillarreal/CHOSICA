package pe.edu.upeu.proyecto.entity;

public class Tipo_Denominacion {
	private int id_tipodeno;
	private int id_tiporg;
	private String nombre;
	private String estado;
	public Tipo_Denominacion() {
		
	}
	public Tipo_Denominacion(int id_tipodeno, int id_tiporg, String nombre, String estado) {
		super();
		this.id_tipodeno = id_tipodeno;
		this.id_tiporg = id_tiporg;
		this.nombre = nombre;
		this.estado = estado;
	}
	public int getId_tipodeno() {
		return id_tipodeno;
	}
	public void setId_tipodeno(int id_tipodeno) {
		this.id_tipodeno = id_tipodeno;
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
