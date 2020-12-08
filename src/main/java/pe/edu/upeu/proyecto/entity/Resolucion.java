package pe.edu.upeu.proyecto.entity;

public class Resolucion {
	private int id_resolucion;
	private int id_organizacion;
	private int id_solicitudorg;
	private int id_usuario_emi;
	private int numero;
	private String fec_inicio;
	private String fec_fin;
	public Resolucion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Resolucion(int id_resolucion, int id_organizacion, int id_solicitudorg, int id_usuario_emi, int numero,
			String fec_inicio, String fec_fin) {
		super();
		this.id_resolucion = id_resolucion;
		this.id_organizacion = id_organizacion;
		this.id_solicitudorg = id_solicitudorg;
		this.id_usuario_emi = id_usuario_emi;
		this.numero = numero;
		this.fec_inicio = fec_inicio;
		this.fec_fin = fec_fin;
	}
	public int getId_resolucion() {
		return id_resolucion;
	}
	public void setId_resolucion(int id_resolucion) {
		this.id_resolucion = id_resolucion;
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
	public int getId_usuario_emi() {
		return id_usuario_emi;
	}
	public void setId_usuario_emi(int id_usuario_emi) {
		this.id_usuario_emi = id_usuario_emi;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
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

}
