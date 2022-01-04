

/*
 * 	T�tulo: Arc�n
 * 	Nombre: H�ctor Paredes Benavides / Sergio Bermudez Fern�ndez
 * 	Descripci�n: Clase con la que trabajamos con los arcones
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
	
	/* M�todos Setters */
	public void setNumArcones(int numArcones) {
		
		this.numArcones=numArcones;
	
	}
	
	/* M�todos Getters */
	public int getNumArcones() {
		
		return numArcones;
	
	}
	
	/* M�todos p�blicos */
	public String printDatos() {
		
		return ("Numero de arcones: " + numArcones + " capacidad por arcon de " + getCapacidad());
		
	}
	
}