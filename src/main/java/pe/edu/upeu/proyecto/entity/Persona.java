package pe.edu.upeu.proyecto.entity;

import java.util.Date;

public class Persona {

	private int idpersona;
	private int id_tipodoc;
	private int id_estcivil;
	private String nombres;
	private String apepat;
	private String apemat;
	private String numero_doc;
	private String sexo;
	private Date fec_nac;
	private String direccion;
	private String telefono;
	private String correo;
	private String fallecido;
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(int idpersona, int id_tipodoc, int id_estcivil, String nombres, String apepat, String apemat,
			String numero_doc, String sexo, Date fec_nac, String direccion, String telefono, String correo,
			String fallecido) {
		super();
		this.idpersona = idpersona;
		this.id_tipodoc = id_tipodoc;
		this.id_estcivil = id_estcivil;
		this.nombres = nombres;
		this.apepat = apepat;
		this.apemat = apemat;
		this.numero_doc = numero_doc;
		this.sexo = sexo;
		this.fec_nac = fec_nac;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
		this.fallecido = fallecido;
	}

	public int getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}

	public int getId_tipodoc() {
		return id_tipodoc;
	}

	public void setId_tipodoc(int id_tipodoc) {
		this.id_tipodoc = id_tipodoc;
	}

	public int getId_estcivil() {
		return id_estcivil;
	}

	public void setId_estcivil(int id_estcivil) {
		this.id_estcivil = id_estcivil;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApepat() {
		return apepat;
	}

	public void setApepat(String apepat) {
		this.apepat = apepat;
	}

	public String getApemat() {
		return apemat;
	}

	public void setApemat(String apemat) {
		this.apemat = apemat;
	}

	public String getNumero_doc() {
		return numero_doc;
	}

	public void setNumero_doc(String numero_doc) {
		this.numero_doc = numero_doc;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getFec_nac() {
		return fec_nac;
	}

	public void setFec_nac(Date fec_nac) {
		this.fec_nac = fec_nac;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getFallecido() {
		return fallecido;
	}

	public void setFallecido(String fallecido) {
		this.fallecido = fallecido;
	}
}
