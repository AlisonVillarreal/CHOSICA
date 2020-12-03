package pe.edu.upeu.proyecto.entity;

public class Estado_Civil {
	
	private int id_estcivil;
	private String nombre;
	
	public Estado_Civil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estado_Civil(int id_estcivil, String nombre) {
		super();
		this.id_estcivil = id_estcivil;
		this.nombre = nombre;
	}

	public int getId_estcivil() {
		return id_estcivil;
	}

	public void setId_estcivil(int id_estcivil) {
		this.id_estcivil = id_estcivil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
