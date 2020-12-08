package pe.edu.upeu.proyecto.entity;

public class Roles {
	private int id_rol;
	private String nombre;
	private String estado;
	
	public Roles() {
		
	}

	public Roles(int id_rol, String nombre, String estado) {
		super();
		this.id_rol = id_rol;
		this.nombre = nombre;
		this.estado = estado;
	}

	public int getId_rol() {
		return id_rol;
	}

	public void setId_rol(int id_rol) {
		this.id_rol = id_rol;
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
