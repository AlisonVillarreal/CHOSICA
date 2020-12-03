package pe.edu.upeu.proyecto.entity;

public class Historial_Orgdirectivo {
	private int id_historganodirdet;
	private int id_persona;
	private int id_cargo;
	private String fec_inicio;
	private String fec_fin;
	public Historial_Orgdirectivo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Historial_Orgdirectivo(int id_historganodirdet, int id_persona, int id_cargo, String fec_inicio,
			String fec_fin) {
		super();
		this.id_historganodirdet = id_historganodirdet;
		this.id_persona = id_persona;
		this.id_cargo = id_cargo;
		this.fec_inicio = fec_inicio;
		this.fec_fin = fec_fin;
	}
	public int getId_historganodirdet() {
		return id_historganodirdet;
	}
	public void setId_historganodirdet(int id_historganodirdet) {
		this.id_historganodirdet = id_historganodirdet;
	}
	public int getId_persona() {
		return id_persona;
	}
	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}
	public int getId_cargo() {
		return id_cargo;
	}
	public void setId_cargo(int id_cargo) {
		this.id_cargo = id_cargo;
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
