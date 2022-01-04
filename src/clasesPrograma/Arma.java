

/*
 * 	T�tulo: Arma
 * 	Nombre: H�ctor Paredes Benavides / Sergio Bermudez Fern�ndez
 * 	Descripci�n: Clase con la que trabajamos con las armas
 */

package clasesPrograma;

public class Arma {

	/* Atributos */
	private int numArmas;
	
	/* Constructores */
	public Arma(int numero) {
		
		this.numArmas = numero;
		
	}
	
	/* M�todos Setters */
	public void setNumArmas(int numArmas) {
		
		this.numArmas = numArmas;
	
	}
	
	/* M�todos Getters */
	public int getNumArmas() {
		
		return numArmas;
	
	}
	
	/* M�todos p�blicos */
	public String printDatos() {
		
		return ("Numero de armas: " + numArmas);
	}
	
}
