package pe.edu.upeu.proyecto.entity;

public class Solicitud {
	private int id_solicitudorg;
	private int id_usuariosol;
	private int id_organizacion;
	private int id_tiposol;
	private String fec_registro;
	private String codigo_exp;
	private String observaciones;
	private int id_solestado;
	public Solicitud() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Solicitud(int id_solicitudorg, int id_usuariosol, int id_organizacion, int id_tiposol, String fec_registro,
			String codigo_exp, String observaciones, int id_solestado) {
		super();
		this.id_solicitudorg = id_solicitudorg;
		this.id_usuariosol = id_usuariosol;
		this.id_organizacion = id_organizacion;
		this.id_tiposol = id_tiposol;
		this.fec_registro = fec_registro;
		this.codigo_exp = codigo_exp;
		this.observaciones = observaciones;
		this.id_solestado = id_solestado;
	}
	public int getId_solicitudorg() {
		return id_solicitudorg;
	}
	public void setId_solicitudorg(int id_solicitudorg) {
		this.id_solicitudorg = id_solicitudorg;
	}
	public int getId_usuariosol() {
		return id_usuariosol;
	}
	public void setId_usuariosol(int id_usuariosol) {
		this.id_usuariosol = id_usuariosol;
	}
	public int getId_organizacion() {
		return id_organizacion;
	}
	public void setId_organizacion(int id_organizacion) {
		this.id_organizacion = id_organizacion;
	}
	public int getId_tiposol() {
		return id_tiposol;
	}
	public void setId_tiposol(int id_tiposol) {
		this.id_tiposol = id_tiposol;
	}
	public String getFec_registro() {
		return fec_registro;
	}
	public void setFec_registro(String fec_registro) {
		this.fec_registro = fec_registro;
	}
	public String getCodigo_exp() {
		return codigo_exp;
	}
	public void setCodigo_exp(String codigo_exp) {
		this.codigo_exp = codigo_exp;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public int getId_solestado() {
		return id_solestado;
	}
	public void setId_solestado(int id_solestado) {
		this.id_solestado = id_solestado;
	}
	

}
