

/*
 * 	Título: Arma
 * 	Nombre: Héctor Paredes Benavides / Sergio Bermudez Fernández
 * 	Descripción: Clase con la que trabajamos con las armas
 */

package clasesPrograma;

public class Arma {

	/* Atributos */
	private int numArmas;
	
	/* Constructores */
	public Arma(int numero) {
		
		this.numArmas = numero;
		
	}
	
	/* Métodos Setters */
	public void setNumArmas(int numArmas) {
		
		this.numArmas = numArmas;
	
	}
	
	/* Métodos Getters */
	public int getNumArmas() {
		
		return numArmas;
	
	}
	
	/* Métodos públicos */
	public String printDatos() {
		
		return ("Numero de armas: " + numArmas);
	}
	
}
