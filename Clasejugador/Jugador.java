package Clasejugador;


public class Jugador extends Personatge {
	
	private int habitacion;
	private String nombre;
	private Motx Moxila_jugador = new Motx();
	
	

	public Jugador(int vidas, String desc, int atac,int habitacion,String nombre) {
		super(vidas, desc, atac);
		this.habitacion = habitacion;
		this.nombre = nombre;
	}
	
	
	
	// Geters i setters
	public int getHabitacion() {
		return habitacion;
	}
	public void setHabitacion(int habitacion) {
		this.habitacion = habitacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Motx getMoxila_jugador() {
		return Moxila_jugador;
	}
	public void setMoxila_jugador(Motx moxila_jugador) {
		Moxila_jugador = moxila_jugador;
	}


	
	
	
}
