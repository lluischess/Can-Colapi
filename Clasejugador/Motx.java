package Clasejugador;

import java.util.ArrayList;

import ClasesObjectes.Clau;
import ClasesObjectes.Escala;
import ClasesObjectes.Objetos;
import ClasesObjectes.Os;
import ClasesObjectes.Wija;




public class Motx {
	
	private ArrayList<Objetos> Contingut = new ArrayList<Objetos>();
	
	
	
	// A�adir Objetos
	
public void Guardarobjeto (Objetos objeto) {
		
	Contingut.add(objeto);
	}
			public void A�adir_Objetos(){
				
			}



			public ArrayList<Objetos> getContingut() {
				return Contingut;
			}



			public void setContingut(ArrayList<Objetos> contingut) {
				Contingut = contingut;
			}
			public boolean Escalera() {
				boolean escalera = false;
				for(Objetos escala : Contingut) {
					if(escala.getClass() == Escala.class) {
						escalera = true;
					}
					 
				}
				return escalera;
			}
	
	
}
