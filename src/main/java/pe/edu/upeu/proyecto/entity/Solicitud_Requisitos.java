package pe.edu.upeu.proyecto.entity;

import java.util.Date;

public class Solicitud_Requisitos {
	private int id_solrequisito;
	private int id_solicitudorg;
	private int id_requisito;
	private int id_usuariorev;
	private String archivo;
	private Date fec_revision;
	private String estado;
	public Solicitud_Requisitos() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Solicitud_Requisitos(int id_solrequisito, int id_solicitudorg, int id_requisito, int id_usuariorev,
			String archivo, Date fec_revision, String estado) {
		super();
		this.id_solrequisito = id_solrequisito;
		this.id_solicitudorg = id_solicitudorg;
		this.id_requisito = id_requisito;
		this.id_usuariorev = id_usuariorev;
		this.archivo = archivo;
		this.fec_revision = fec_revision;
		this.estado = estado;
	}
	public int getId_solrequisito() {
		return id_solrequisito;
	}
	public void setId_solrequisito(int id_solrequisito) {
		this.id_solrequisito = id_solrequisito;
	}
	public int getId_solicitudorg() {
		return id_solicitudorg;
	}
	public void setId_solicitudorg(int id_solicitudorg) {
		this.id_solicitudorg = id_solicitudorg;
	}
	public int getId_requisito() {
		return id_requisito;
	}
	public void setId_requisito(int id_requisito) {
		this.id_requisito = id_requisito;
	}
	public int getId_usuariorev() {
		return id_usuariorev;
	}
	public void setId_usuariorev(int id_usuariorev) {
		this.id_usuariorev = id_usuariorev;
	}
	public String getArchivo() {
		return archivo;
	}
	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}
	public Date getFec_revision() {
		return fec_revision;
	}
	public void setFec_revision(Date fec_revision) {
		this.fec_revision = fec_revision;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
