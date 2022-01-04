

/*
 * 	T�tulo: Almacenamiento
 * 	Nombre: H�ctor Paredes Benavides / Sergio Bermudez Fern�ndez
 * 	Descripci�n: Clase abstracta con la que representamos el conjunto de material que es capaz de almacenar (portar peso de la expedici�n)
 */

package clasesPrograma;

public abstract class Almacenamiento extends Recursos{
	
	/* Atributos */
	private int capacidad;
	
	/* Constructores */
	public Almacenamiento(int capacidad) {
		
		this.capacidad=capacidad;
		
	}
	
	/* M�todos Getters */
	public final int getCapacidad() {
		
		return capacidad;	
		
	}
	
	/* M�todos abstractos */
	public abstract String printDatos();

}
