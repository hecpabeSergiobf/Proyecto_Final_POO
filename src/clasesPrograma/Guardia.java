

/*
 * 	Título: Guardia
 * 	Nombre: Héctor Paredes Benavides / Sergio Bermudez Fernández
 * 	Descripción: Clase con la que trabajamos con los guardias
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
	
	/* Métodos Getters */
	public int getAptitud() {
		
		return aptitud;
		
	}
	
	public int getcontGuardias() {
		
		return contGuardias;
		
	}
	
	/* Métodos Públicos */
	public String printDatos() {
		
		return ("Nombre: " + getNombre() + "\nAptitud: " + aptitud);
		
	}
	
}
