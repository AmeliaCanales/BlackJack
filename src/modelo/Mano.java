package modelo;

import java.util.ArrayList;

public class Mano extends Mazo {
	
	public Mano() {
		// Creamos una list de cartas vacía
		this.cartas = new ArrayList<Carta>();		
	}

	public int valorMano() {
		int valor=0;
		int numAses=0;
		for(Carta c : this.cartas) {
			if (c.getNumero()==1) {
				numAses++;
			}
			valor = valor + c.getValor();
		}
		// Comprobamos si me he pasado de 21
		while (numAses>0 && valor>21) {
			valor=valor-10;
			numAses--; 
		}
		
		// Version del método que lanza la excepción Masde21Exception
		 
		public boolean finDeJuego() throws Masde21Exception {
			try {
				if (valorMano()>=21) {
					return true;
				}
			} catch (Masde21Exception e) {
				return true;
			}
			return false;
		}
	
		

	@Override
	public String toString() {
		return "Mano [" + cartas + "]  Valor de la mano:"+valorMano();
	}
	
	
}

/*
 * // Versión del método que recoge la excepción para que no se propague
	// y se devuelvw true en caso de pasarnos de 21 puntos
	public boolean finDeJuego() {
		try {
			if (valorMano()>=21) {
				return true;
			}
		} catch (Masde21Exception e) {
			return true;
		}
		return false;
	}
			return valor;
	}
* 
*/
