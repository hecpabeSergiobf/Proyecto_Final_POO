

/*
 * 	T�tulo: Operario
 * 	Nombre: H�ctor Paredes Benavides / Sergio Bermudez Fern�ndez
 * 	Descripci�n: Clase con la que trabajamos con los operarios
 */

package clasesPrograma;

public class Operario extends Personas{

	/* Atributos */
	private int numOperario;
	
	/* Constructores */
	public Operario(int numero) {
		
		super("Operario", "Operario");
		this.numOperario = numero;
		
	}
	
	/* M�todos Setters */
	public void setNumOperario(int numOperario) {
		
		this.numOperario=numOperario;
	
	}
	
	/* M�todos Getters */
	public int getNumOperario() {
		
		return numOperario;
	
	}
	
	/* M�todos P�blicos */
	public String printDatos() {
		
		return ("Numero de Operaios: " + numOperario);
		
	}
	
}