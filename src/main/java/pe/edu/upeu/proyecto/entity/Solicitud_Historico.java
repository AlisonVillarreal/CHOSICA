package pe.edu.upeu.proyecto.entity;

public class Solicitud_Historico {
	private int id_solicitudorg;
	private int id_solestado;
	private int id_usuarioact;
	private String fec_act;
	private String estado;
	public Solicitud_Historico() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Solicitud_Historico(int id_solicitudorg, int id_solestado, int id_usuarioact, String fec_act,
			String estado) {
		super();
		this.id_solicitudorg = id_solicitudorg;
		this.id_solestado = id_solestado;
		this.id_usuarioact = id_usuarioact;
		this.fec_act = fec_act;
		this.estado = estado;
	}
	public int getId_solicitudorg() {
		return id_solicitudorg;
	}
	public void setId_solicitudorg(int id_solicitudorg) {
		this.id_solicitudorg = id_solicitudorg;
	}
	public int getId_solestado() {
		return id_solestado;
	}
	public void setId_solestado(int id_solestado) {
		this.id_solestado = id_solestado;
	}
	public int getId_usuarioact() {
		return id_usuarioact;
	}
	public void setId_usuarioact(int id_usuarioact) {
		this.id_usuarioact = id_usuarioact;
	}
	public String getFec_act() {
		return fec_act;
	}
	public void setFec_act(String fec_act) {
		this.fec_act = fec_act;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}