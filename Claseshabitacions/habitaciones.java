package Claseshabitacions;

public class habitaciones {
	private int id_habitacio;
	private String desc;
	private int Nort;
	private int Sud;
	private int Est;
	private int Oest;
	
	public habitaciones(int id_habitacio, String desc, int nort, int sud, int est, int oest) {
		
		this.id_habitacio = id_habitacio;
		this.desc = desc;
		this.Nort = nort;
		this.Sud = sud;
		this.Est = est;
		this.Oest = oest;
	}
	
	public int getId_habitacio() {
		return id_habitacio;
	}

	public void setId_habitacio(int id_habitacio) {
		this.id_habitacio = id_habitacio;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getNort() {
		return Nort;
	}

	public void setNort(int nort) {
		Nort = nort;
	}

	public int getSud() {
		return Sud;
	}

	public void setSud(int sud) {
		Sud = sud;
	}

	public int getEst() {
		return Est;
	}

	public void setEst(int est) {
		Est = est;
	}

	public int getOest() {
		return Oest;
	}

	public void setOest(int oest) {
		Oest = oest;
	}
	
	
	
}
