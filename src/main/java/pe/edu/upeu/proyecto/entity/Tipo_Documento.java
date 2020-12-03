package pe.edu.upeu.proyecto.entity;

public class Tipo_Documento {

	private int id_tipodoc;
	private String nombre;
	private String abreviativo;
	private int longitud;
	
	public Tipo_Documento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tipo_Documento(int id_tipodoc, String nombre, String abreviativo, int longitud) {
		super();
		this.id_tipodoc = id_tipodoc;
		this.nombre = nombre;
		this.abreviativo = abreviativo;
		this.longitud = longitud;
	}

	public int getId_tipodoc() {
		return id_tipodoc;
	}

	public void setId_tipodoc(int id_tipodoc) {
		this.id_tipodoc = id_tipodoc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAbreviativo() {
		return abreviativo;
	}

	public void setAbreviativo(String abreviativo) {
		this.abreviativo = abreviativo;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
}
