package pe.edu.upeu.proyecto.entity;

public class Organizacion_Persona {
	private int id_asociado;
	private int id_organizacion;
	private int id_solicitudorg;
	private int id_cargo;
	private String fec_registro;
	private String fec_desvincula;
	private String fec_inicio;
	private String fec_fin;
	private int estado;
	public Organizacion_Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Organizacion_Persona(int id_asociado, int id_organizacion, int id_solicitudorg, int id_cargo,
			String fec_registro, String fec_desvincula, String fec_inicio, String fec_fin, int estado) {
		super();
		this.id_asociado = id_asociado;
		this.id_organizacion = id_organizacion;
		this.id_solicitudorg = id_solicitudorg;
		this.id_cargo = id_cargo;
		this.fec_registro = fec_registro;
		this.fec_desvincula = fec_desvincula;
		this.fec_inicio = fec_inicio;
		this.fec_fin = fec_fin;
		this.estado = estado;
	}
	public int getId_asociado() {
		return id_asociado;
	}
	public void setId_asociado(int id_asociado) {
		this.id_asociado = id_asociado;
	}
	public int getId_organizacion() {
		return id_organizacion;
	}
	public void setId_organizacion(int id_organizacion) {
		this.id_organizacion = id_organizacion;
	}
	public int getId_solicitudorg() {
		return id_solicitudorg;
	}
	public void setId_solicitudorg(int id_solicitudorg) {
		this.id_solicitudorg = id_solicitudorg;
	}
	public int getId_cargo() {
		return id_cargo;
	}
	public void setId_cargo(int id_cargo) {
		this.id_cargo = id_cargo;
	}
	public String getFec_registro() {
		return fec_registro;
	}
	public void setFec_registro(String fec_registro) {
		this.fec_registro = fec_registro;
	}
	public String getFec_desvincula() {
		return fec_desvincula;
	}
	public void setFec_desvincula(String fec_desvincula) {
		this.fec_desvincula = fec_desvincula;
	}
	public String getFec_inicio() {
		return fec_inicio;
	}
	public void setFec_inicio(String fec_inicio) {
		this.fec_inicio = fec_inicio;
	}
	public String getFec_fin() {
		return fec_fin;
	}
	public void setFec_fin(String fec_fin) {
		this.fec_fin = fec_fin;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	

}
