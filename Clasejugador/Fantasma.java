package Clasejugador;

public class Fantasma extends Personatge {
			private int habitacion;
			
	public Fantasma(int vidas, String desc, int atac,int habitacion) {
		super(vidas, desc, atac);
		this.habitacion = habitacion;
	}

	public int getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(int habitacion) {
		this.habitacion = habitacion;
	}
	
	

}
