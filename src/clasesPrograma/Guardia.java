

/*
 * 	T�tulo: Guardia
 * 	Nombre: H�ctor Paredes Benavides / Sergio Bermudez Fern�ndez
 * 	Descripci�n: Clase con la que trabajamos con los guardias
 */

package clasesPrograma;

public class Guardia extends Personas {

	/* Atributos */
	private int aptitud;
	private static int contGuardias=0;
	
	/* Constructores */
	public Guardia(String nombre, int aptitud) {
		
		super(nombre, "Guardia");
		this.aptitud = aptitud;
		contGuardias++;
		
	}
	
	/* M�todos Getters */
	public int getAptitud() {
		
		return aptitud;
		
	}
	
<<<<<<< HEAD
	public int getcontGuardias() {
=======
	public static int getcontGuardias() {
>>>>>>> calculadorExpediciones
		
		return contGuardias;
		
	}
	
	/* M�todos P�blicos */
	public String printDatos() {
		
		return ("Nombre: " + getNombre() + "\nAptitud: " + aptitud);
		
	}
	
}
