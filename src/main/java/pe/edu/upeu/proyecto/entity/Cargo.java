package pe.edu.upeu.proyecto.entity;

public class Cargo {
	private int id_cargo;
	private String nombre;
	private String estado;
	
	public Cargo() {
		super();

	}

	public Cargo(int id_cargo, String nombre, String estado) {
		super();
		this.id_cargo = id_cargo;
		this.nombre = nombre;
		this.estado = estado;
	}

	public int getId_cargo() {
		return id_cargo;
	}

	public void setId_cargo(int id_cargo) {
		this.id_cargo = id_cargo;
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
