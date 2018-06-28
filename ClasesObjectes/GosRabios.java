package ClasesObjectes;

public class GosRabios {
	private int habitacion;
	private int Atac;
	private boolean Rabios;
	
	

	public GosRabios(int atac, boolean Rabios,int habitacion) {
		super();
		this.Atac = atac;
		Rabios = true;
		this.Rabios = Rabios;
		habitacion = 9;
		this.habitacion = habitacion;
	}
	public int getAtac() {
		return Atac;
	}
	public void setAtac(int atac) {
		Atac = atac;
	}
	public boolean isRabios() {
		return Rabios;
	}
	public void setRabios(boolean rabios) {
		Rabios = rabios;
	}
	// Accio escala
	public boolean Atacgos(){

		return false;

	}
	public int getHabitacion() {
		return habitacion;
	}
	public void setHabitacion(int habitacion) {
		this.habitacion = habitacion;
	}

}
