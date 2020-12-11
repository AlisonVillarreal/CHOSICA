package pe.edu.upeu.proyecto.entity;

import java.util.Date;

public class Organizacion {
	private int id_organizacion;
	private int id_tipodeno;
	private int id_org_padre;
	private String nombreorg;
	private String numpartreg;
	private int totalmiembros;
	private Date fec_iniactv;
	private Date fec_registro;
	private Date fec_vigencia;
	private String estado;
	public Organizacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Organizacion(int id_organizacion, int id_tipodeno, int id_org_padre, String nombreorg, String numpartreg,
			int totalmiembros, Date fec_iniactv, Date fec_registro, Date fec_vigencia, String estado) {
		super();
		this.id_organizacion = id_organizacion;
		this.id_tipodeno = id_tipodeno;
		this.id_org_padre = id_org_padre;
		this.nombreorg = nombreorg;
		this.numpartreg = numpartreg;
		this.totalmiembros = totalmiembros;
		this.fec_iniactv = fec_iniactv;
		this.fec_registro = fec_registro;
		this.fec_vigencia = fec_vigencia;
		this.estado = estado;
	}
	public int getId_organizacion() {
		return id_organizacion;
	}
	public void setId_organizacion(int id_organizacion) {
		this.id_organizacion = id_organizacion;
	}
	public int getId_tipodeno() {
		return id_tipodeno;
	}
	public void setId_tipodeno(int id_tipodeno) {
		this.id_tipodeno = id_tipodeno;
	}
	public int getId_org_padre() {
		return id_org_padre;
	}
	public void setId_org_padre(int id_org_padre) {
		this.id_org_padre = id_org_padre;
	}
	public String getNombreorg() {
		return nombreorg;
	}
	public void setNombreorg(String nombreorg) {
		this.nombreorg = nombreorg;
	}
	public String getNumpartreg() {
		return numpartreg;
	}
	public void setNumpartreg(String numpartreg) {
		this.numpartreg = numpartreg;
	}
	public int getTotalmiembros() {
		return totalmiembros;
	}
	public void setTotalmiembros(int totalmiembros) {
		this.totalmiembros = totalmiembros;
	}
	public Date getFec_iniactv() {
		return fec_iniactv;
	}
	public void setFec_iniactv(Date fec_iniactv) {
		this.fec_iniactv = fec_iniactv;
	}
	public Date getFec_registro() {
		return fec_registro;
	}
	public void setFec_registro(Date fec_registro) {
		this.fec_registro = fec_registro;
	}
	public Date getFec_vigencia() {
		return fec_vigencia;
	}
	public void setFec_vigencia(Date fec_vigencia) {
		this.fec_vigencia = fec_vigencia;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
