

/*
 * 	Título: Arcón
 * 	Nombre: Héctor Paredes Benavides / Sergio Bermudez Fernández
 * 	Descripción: Clase con la que trabajamos con los arcones
 */

package clasesPrograma;

public class Arcon extends Almacenamiento{

	/* Constantes */
	public static final int CAPACIDAD_ARCONES = 200;
	
	/* Atributos */
	private int numArcones;
	
	/* Constructores */
	public Arcon(int Numero) {
		
		super(CAPACIDAD_ARCONES);
		this.numArcones=Numero;
		
	}	
	
	/* Métodos Setters */
	public void setNumArcones(int numArcones) {
		
		this.numArcones=numArcones;
	
	}
	
	/* Métodos Getters */
	public int getNumArcones() {
		
		return numArcones;
	
	}
	
	/* Métodos públicos */
	public String printDatos() {
		
		return ("Numero de arcones: " + numArcones + " capacidad por arcon de " + getCapacidad());
		
	}
	
}