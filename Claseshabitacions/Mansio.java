package Claseshabitacions;

import java.util.ArrayList;

import Clasejugador.Motx;
import ClasesObjectes.Clau;
import ClasesObjectes.Escala;
import ClasesObjectes.Objetos;
import ClasesObjectes.Os;
import ClasesObjectes.Wija;

public class Mansio {
	
	//Array de habitaciones-----------------------------------------------------------
	habitaciones Taula_habitacions [] = new habitaciones [9];
	 ArrayList<Objetos> Objetos_Mansion = new ArrayList<Objetos>();
	
	
	 public ArrayList<Objetos> getObjetos_Mansion() {
		return Objetos_Mansion;
	}

	public void setObjetos_Mansion(ArrayList<Objetos> objetos_Mansion) {
		Objetos_Mansion = objetos_Mansion;
	}

	public boolean leerlistaobjetos(int idhabitacion){
		 boolean Objetos_encontrados = false;
		 for(Objetos objeto : Objetos_Mansion) {
				if(objeto.getHabitacion() == idhabitacion) {
					Objetos_encontrados= true;
				}
				 
			}
		 return Objetos_encontrados;
	 }
	
	public ArrayList<Objetos> getContingut2() {
		return Objetos_Mansion;
	}
	 
	 public ArrayList<Objetos> devolver_objeto (int idhabitacion) {
		 ArrayList<Objetos> ObjetosEnHabitacion = new ArrayList <Objetos>();
		 for(Objetos objeto : Objetos_Mansion) {
				if(objeto.getHabitacion() == idhabitacion) {
					ObjetosEnHabitacion.add(objeto);
				}
				 
			}
		 return ObjetosEnHabitacion;
		}

	
	
	public habitaciones[] getTaula_habitacions() {
		return Taula_habitacions;
	}

	public void setTaula_habitacions(habitaciones[] taula_habitacions) {
		Taula_habitacions = taula_habitacions;
	}
	
	// Crearemos las habitaciones-------------------------------------------------------------------------
	public void Iniciar_Habitaciones(){
		
		habitaciones habitacion1 = new habitaciones(1, "Habitacion1", 0, 4, 0, 0);
		habitaciones habitacion2 = new habitaciones(2, "Habitacion2", 0, 5, 0, 0);
		habitaciones habitacion3 = new habitaciones(3, "Habitacion3", 0, 6, 0, 0);
		habitaciones habitacion4 = new habitaciones(4, "Habitacion4", 1, 7, 0, 5);
		habitaciones habitacion5 = new habitaciones(5, "Habitacion5", 2, 8, 4, 6);
		habitaciones habitacion6 = new habitaciones(6, "Habitacion6", 3, 9, 5, 0);
		habitaciones habitacion7 = new habitaciones(7, "Habitacion7", 4, 0, 0, 0);
		habitaciones habitacion8 = new habitaciones(8, "Habitacion8", 5, 0, 0, 0);
		habitaciones habitacion9 = new habitaciones(9, "Habitacion9", 6, 0, 0, 0);
		
		Taula_habitacions[0] = habitacion1;
		Taula_habitacions[1] = habitacion2;
		Taula_habitacions[2] = habitacion3;
		Taula_habitacions[3] = habitacion4;
		Taula_habitacions[4] = habitacion5;
		Taula_habitacions[5] = habitacion6;
		Taula_habitacions[6] = habitacion7;
		Taula_habitacions[7] = habitacion8;
		Taula_habitacions[8] = habitacion9;
	}
	
	 public habitaciones BuscarHabitacion(int idhabitacion) {
		 int cont;
		 int numero = 0;
		 
		 for(cont=0;cont<9;cont++) {
			 if(Taula_habitacions[cont].getId_habitacio() == idhabitacion) {
				 numero = cont;
			 }
		 }
		 
		 return Taula_habitacions[numero];
	 }
	 
	
	
	// Añadir Objetos_Mansion----------------------------------------------------------------------------------------------
			public void Añadir_Objetos_Mansion(){
				
				Clau clau = new Clau(3, "Llave, supongo que abrira alguna puerta.");
				Objetos_Mansion.add(clau);
				Escala escala = new Escala(9, "Escalera... podria ser util!.");
				Objetos_Mansion.add(escala);
				Os os = new Os(2, "Un monton de huesos");
				Objetos_Mansion.add(os);
				Wija wija = new Wija(7, "Una wija? en un lugar tan horroroso!! :S");
				Objetos_Mansion.add(wija);
			}
	
	
	
	
	
	
}
