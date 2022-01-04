

/*
 * 	Título: Caja
 * 	Nombre: Héctor Paredes Benavides / Sergio Bermudez Fernández
 * 	Descripción: Clase con la que trabajamos con las cajas
 */

package clasesPrograma;

public class Caja extends Almacenamiento{
	
	/* Constantes */
	public static final int CAPACIDAD_CAJA = 100;
	
	/* Atributos */
	private int numCajas;
	
	/* Constructores */
	public Caja(int numero) {
		
		super(CAPACIDAD_CAJA);
		this.numCajas = numero;
		
	}
	
	/* Métodos Setters */
	public void setNumCajas(int numCajas) {
		
		this.numCajas = numCajas;
	
	}
	
	/* Métodos Getters */
	public int getNumCajas() {
		
		return numCajas;
	
	}
	
	/* Métodos Públicos */
	public String printDatos() {
		
		return ("Numero de Cajas: " + numCajas + " capacidad por Caja de " + getCapacidad());
		
	}
}
