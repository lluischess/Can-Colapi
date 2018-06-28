package Clasejugador;

public abstract class Personatge {
	
	private int Vidas;
	private String Desc;
	private int Atac;
	
	public Personatge(int vidas, String desc, int atac) {
		this.Vidas = vidas;
		this.Desc = desc;
		this.Atac = atac;
	}

	public int getVidas() {
		return Vidas;
	}

	public void setVidas(int vidas) {
		Vidas = vidas;
	}

	public String getDesc() {
		return Desc;
	}

	public void setDesc(String desc) {
		Desc = desc;
	}

	public int getAtac() {
		return Atac;
	}

	public void setAtac(int atac) {
		Atac = atac;
	}
	
	

}
