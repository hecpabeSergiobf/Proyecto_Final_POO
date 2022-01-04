

/*
 * 	Título: Mochila
 * 	Nombre: Héctor Paredes Benavides / Sergio Bermudez Fernández
 * 	Descripción: Clase con la que trabajamos con las mochilas
 */

package clasesPrograma;

public class Mochila extends Recursos{

	/* Atributos */
	private int numMochilas;
	
	/* Constructores */
	public Mochila(int numero) {
		
		this.numMochilas = numero;
		
	}
	
	/* Métodos Setters */
	public void setNumMochilas(int numMochilas) {
		
		this.numMochilas = numMochilas;
	
	}
	
	/* Métodos Getters */
	public int getNumMochilas() {
		
		return numMochilas;
	
	}
	
	/* Métodos Públicos */
	public String printDatos() {
		
		return ("Numero de mochilas: " + numMochilas);
	}
}
