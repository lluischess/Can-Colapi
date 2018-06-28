package A.Runprogram;

import java.util.ArrayList;
import java.util.Scanner;

import Clasejugador.Fantasma;
import Clasejugador.Jugador;
import Clasejugador.Motx;
import ClasesObjectes.Clau;
import ClasesObjectes.Escala;
import ClasesObjectes.GosRabios;
import ClasesObjectes.Objetos;
import ClasesObjectes.Os;
import ClasesObjectes.Wija;
import Claseshabitacions.Mansio;

public class Run {
	
	java.util.Random Random;
	
	//Random
		public  int Random(int habdesde, int habasta) {
			
			int RandomN;
			habasta++;
			RandomN = (int) (Math.random() * ( habasta - habdesde )+2);
			return RandomN;	
		}
		
		
		// variables
	private  String nombre = null;
	
	private  boolean victory = false;

	private  int movimento = 0;

	private  int vida = 2;
	
	private  int vidafantama = 1;
	
	private boolean wija = false;
	
	private boolean hueso = false;
	
	private boolean Usarheso = false;
	
	private boolean usarescalera = false;
	private boolean escalera = false;
	private boolean Clau = false;
	private boolean mostrarmapa = false;
	

	static Scanner Escaner;
	
	
	
	 // Jugador
	 Jugador jugador = new Jugador(vida, "El jugador", 0, 1, nombre);
	 // Fantasma
	 Fantasma Fantasma = new Fantasma(vidafantama, "Un Fantasma!!!!!", 1, Random(2,8));
	 	
	 // Gos
	 GosRabios gos = new GosRabios(1, true, 9);
	 // Mansion
	 Mansio mansio = new Mansio();
	 //mapa
	 Map mapa = new Map();
	 
	
	 
	 
	
	
	
	 public static void main(String[] args) { 
		 
		 Run program = new Run();
		 program.inici();
		 
		 
	 }
	 
	private void inici() {
		if (mostrarmapa = false){
			mapa.map();
			mostrarmapa = true;
		}
		System.out.println(Fantasma.getHabitacion());	
		
		Escaner = new Scanner(System.in);
		
		mansio.Iniciar_Habitaciones();
		mansio.Añadir_Objetos_Mansion();
		 
		 int Opcio=0;
		 if (vida == 0){
				System.out.println("Has perdido el juego vidas:"+vida);	
			}
		 System.out.println("Bienvenido a Can Colapi");
		 System.out.println("Escoje tu nombre antes de empezar a jugar: ");
		 nombre = Escaner.next();
		
		 
			
		 //------------------------------------------------------------------------------------------------------
	 		do{
	 			
	 			Menu();
	 			Opcio = Escaner.nextInt();
	 			
	 			//Si no escull una opcio valida, informem
	 			if (Opcio != 1){
	 				System.out.println("No has introduit un valor de menu \n");
	 			}	
	 			//Aqui cridem cada metoda
	 			switch (Opcio)
	 			{
	 			case 1:
	 				Jugem(nombre);
	 				break; 
	 			}
	 			
	 		}while(Opcio!=0);	
		
	}

	//------------------------------------------------------------------------------------------------------
	private  void Jugem(String nombrejugador) {
		int mover;
		
		
		
		 System.out.println("craix!!!!!!!!!!!!!!!!!!!!!!!!!!");
		 System.out.println(".....");
		 System.out.println("Que frio hace en esta casa, espero que nadie me haya visto rompiendo la ventana...");
		 System.out.println(".....");
		 System.out.println("I todo.., para impresionar a una chica.. aisss...");
		 System.out.println("Que lugar mas tenebroso :S ");
		 System.out.println(".....");
		 System.out.println("Echare un vistazo y me voy!");
		 
		 System.out.println("Donde Puedo Ir?");
		 Posicion_jugador(jugador.getHabitacion(),jugador.getNombre());
		 if (vida == 0){
				System.out.println("Has perdido el juego vidas:"+vida);	
			}
		 
		 Movimientos(jugador);
		
	}
	private void Posicion_jugador(int idhabitacion, String nombrejugador) {
		
		
		 
		switch (idhabitacion)
			{
			case 1:
				System.out.println("En esta habitacion pone el numero:"+idhabitacion);
				if(mansio.leerlistaobjetos(idhabitacion) == true) {
					Estado_Objeto(idhabitacion);
				}
				
				break; 
				
			case 2:
				System.out.println("En esta habitacion pone el numero:"+idhabitacion);
				if(mansio.leerlistaobjetos(idhabitacion) == true) {
					Estado_Objeto(idhabitacion);
				}
				
				Fantasma(idhabitacion);
				
				System.out.println("En esta habitacion hay huesos, creo que me quedare con uno me puede servir de algo.");
				
				for(Objetos objetohueso : mansio.getContingut2()) {
					if(objetohueso.getClass() == Os.class) {
						hueso = true;
						System.out.println("Hueso obtenido.");
					}
				}
				
				
				break; 
			case 3:
				System.out.println("En esta habitacion pone el numero:"+idhabitacion);
				if(mansio.leerlistaobjetos(idhabitacion) == true) {
					Estado_Objeto(idhabitacion);
				}
				
				Fantasma(idhabitacion);
				
				System.out.println("Veo una llave, pero esta arriba de todo de la estanteria.");
				for(Objetos objetoclau : mansio.getContingut2()) {
					if(objetoclau.getClass() == Clau.class) {
						usarescalera = true;
						
						System.out.println("Usare la escalera y cojere la llave.");
						
						if(objetoclau.getClass()== Clau.class) {
							if(jugador.getMoxila_jugador().Escalera() == true) {
								Clau = true;
								System.out.println("Llave obtenida.");
								jugador.getMoxila_jugador().Guardarobjeto(objetoclau); 
								objetoclau.setHabitacio(10); // eliminar llave
							}
						}
					}
				
				
				}
				
				break; 
				
			case 4:
				System.out.println("En esta habitacion pone el numero:"+idhabitacion);
				if(mansio.leerlistaobjetos(idhabitacion) == true) {
					Estado_Objeto(idhabitacion);
				}
				
				Fantasma(idhabitacion);
				
				break; 
			case 5:
				System.out.println("En esta habitacion pone el numero:"+idhabitacion);
				if(mansio.leerlistaobjetos(idhabitacion) == true) {
					Estado_Objeto(idhabitacion);
				}
				
				Fantasma(idhabitacion);
				
				break; 
				
			case 6:
				System.out.println("En esta habitacion pone el numero:"+idhabitacion);
				if(mansio.leerlistaobjetos(idhabitacion) == true) {
					Estado_Objeto(idhabitacion);
				}
				
				Fantasma(idhabitacion);
				
				break; 
			case 7:
				System.out.println("En esta habitacion pone el numero:"+idhabitacion);
				if(mansio.leerlistaobjetos(idhabitacion) == true) {
					Estado_Objeto(idhabitacion);
				}
				
				Fantasma(idhabitacion);
				
				for(Objetos objetowija : jugador.getMoxila_jugador().getContingut()) {
					if(objetowija.getClass() == Wija.class) {
						wija = true;
						System.out.println("Has obtenido la Ouija ");
						
						if(objetowija.getClass()== Wija.class) {
								jugador.getMoxila_jugador().Guardarobjeto(objetowija); 
								mansio.getObjetos_Mansion().remove(objetowija);
							
						}
					}
				}
				
				break; 
				
			case 8:
				System.out.println("En esta habitacion pone el numero:"+idhabitacion);
				if(mansio.leerlistaobjetos(idhabitacion) == true) {
					Estado_Objeto(idhabitacion);
				}
				
				Fantasma(idhabitacion);
				
				if(Clau == true) {
					System.out.println("Puedo salir con la llave.");
					System.out.println("Soy libre!"); 
					System.out.println("------------"); 
					System.out.println("Has ganado!"); 
					System.out.println("------------"); 
					inici();
				}
				
				break; 
			case 9:
				System.out.println("En esta habitacion pone el numero:"+idhabitacion);
				if(mansio.leerlistaobjetos(idhabitacion) == true) {
					Estado_Objeto(idhabitacion);
					System.out.println("Veo una escalera.");
					
					
					
						if(gos.isRabios() == true) {
							if(hueso == true) {
								System.out.println("Le dare el hueso para entretenerlo");
								Usarheso = true;
								
								System.out.println("El perro agradecido mueve la cola!");
							
								 for(Objetos escala : mansio.getContingut2()) {
										if(escala.getHabitacion() == idhabitacion) {
											System.out.println("Has obtenido la Escalera");
											jugador.getMoxila_jugador().Guardarobjeto(escala);
											escala.setHabitacio(10);// elimino la escalera
										}
										 
									}
								
//								for(Objetos escala : mansio.getContingut2()) {
//									if(escala.getClass()==Escala.class) {
//											
//											System.out.println("Voy a cojer la escalera mientras el perro esta con el hueso");
//											jugador.getMoxila_jugador().Guardarobjeto(escala); 
//											mansio.getObjetos_Mansion().remove(escala);
//										}
//								
//								
//							}
							}
							
							if (hueso == false){
								System.out.println("AAAAHHH , me ataca un perro!! ");
								vida = vida -1 ;
								if (vida != 0){
									System.out.println("Estoy herido, vidas: "+vida);
								}
								else{
									inici();
									
							
								}
							}
						
					
				}
				
				
			
				break; 
			}
			}
		
		
	}
	//------------------------------------------------------------------------------------------------------
	
	private void Fantasma(int idhabitacion) {
		
		
		
		if (Fantasma.getVidas() > 0){
			if (Fantasma.getHabitacion() == idhabitacion){
				if (wija == false){
					System.out.println("oh no! un fantasma!! ");
					System.out.println("No puedo defenderme con nada!! AAAAAAAAAAAAAAAAAAAAAAAAAA");
					vida = vida -1 ;
					
					if (vida != 0){
						System.out.println("Estoy herido, vidas: "+vida);
					}
					else{
						inici();
					}
				}
				if (wija == true){
					System.out.println("Tienes en tu poder un poderoso objeto 'Una Wija'.");
					System.out.println("Voy a usarla para matarlo!");
					vidafantama = vidafantama -1 ;
					System.out.println("El fantasma a desaparecido! :D");
				}
					
				
			}
			
		}
		}
	

	public void Estado_Objeto(int idhabitacion) {
		
		ArrayList<Objetos> ObjetosHabita = new ArrayList <Objetos>();
		ObjetosHabita = mansio.devolver_objeto(idhabitacion);
		
		System.out.println("Que es eso? un objeto?");
		
		for(Objetos objeto : ObjetosHabita) {
			System.out.println(objeto.getDesc());
		}
	}


	//------------------------------------------------------------------------------------------------------
	private  void Movimientos(Jugador jugador ) {
		int opciomoviments;
		
		
		
		do{
 			
 			Menu2();
 			opciomoviments = Escaner.nextInt();
 			
 			
 			
 			
 			if (opciomoviments>6 || opciomoviments<1){
 				System.out.println("No has introduit un valor de menu \n");
 			}	
 			switch (opciomoviments)
 			{
 			case 1:
 				if(mansio.BuscarHabitacion(jugador.getHabitacion()).getNort() != 0) {
 					jugador.setHabitacion(mansio.BuscarHabitacion(jugador.getHabitacion()).getNort());

 		 			Posicion_jugador(jugador.getHabitacion(),jugador.getNombre());
 					
 				}
 				else {
 					System.out.println("No hay ninguna habitacion en esa direccion vuelve a probar");
 					Movimientos(jugador);
 				}
 				break; 

 			case 2:
 				if(mansio.BuscarHabitacion(jugador.getHabitacion()).getSud() != 0) {
 					jugador.setHabitacion(mansio.BuscarHabitacion(jugador.getHabitacion()).getSud());

 		 			Posicion_jugador(jugador.getHabitacion(),jugador.getNombre());
 					
 				}
 				else {
 					System.out.println("No hay ninguna habitacion en esa direccion vuelve a probar");
 					Movimientos(jugador);
 				}
 				break; 
 				
 			case 3:
 				if(mansio.BuscarHabitacion(jugador.getHabitacion()).getEst() != 0) {
 					jugador.setHabitacion(mansio.BuscarHabitacion(jugador.getHabitacion()).getEst());

 		 			Posicion_jugador(jugador.getHabitacion(),jugador.getNombre());
 					
 				}
 				else {
 					System.out.println("No hay ninguna habitacion en esa direccion vuelve a probar");
 					Movimientos(jugador);
 				}
 				break; 
 				
 			case 4:
 				if(mansio.BuscarHabitacion(jugador.getHabitacion()).getOest() != 0) {
 					jugador.setHabitacion(mansio.BuscarHabitacion(jugador.getHabitacion()).getOest());

 		 			Posicion_jugador(jugador.getHabitacion(),jugador.getNombre());
 					
 				}
 				else {
 					System.out.println("No hay ninguna habitacion en esa direccion vuelve a probar");
 					Movimientos(jugador);
 				}
 				break; 
 				
 			case 5:
 				System.out.println("Gracias por provar el juego :D");
 				inici();
 				break; 
 		
 			}
 			
 		}while(opciomoviments!=5 || vida == 0);	
	}

		//------------------------------------------------------------------------------------------------------
		public  void Menu(){
	 		System.out.println("1: Entrar en la Mansion i empezar el juego");

	 	}
		
		//------------------------------------------------------------------------------------------------------
				public  void Menu2(){
					System.out.println("-------------MOVIMENT------------");
			 		System.out.println("1: Norte");
			 		System.out.println("2: Sur");
			 		System.out.println("3: Oeste");
			 		System.out.println("4: Este");
			 		System.out.println("5: Exit");

			 	}
				


}
