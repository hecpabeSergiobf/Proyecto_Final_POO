

/*
 * 	Título: Almacenamiento
 * 	Nombre: Héctor Paredes Benavides / Sergio Bermudez Fernández
 * 	Descripción: Clase abstracta con la que representamos el conjunto de material que es capaz de almacenar (portar peso de la expedición)
 */

package clasesPrograma;

public abstract class Almacenamiento extends Recursos{
	
	/* Atributos */
	private int capacidad;
	
	/* Constructores */
	public Almacenamiento(int capacidad) {
		
		this.capacidad=capacidad;
		
	}
	
	/* Métodos Getters */
	public final int getCapacidad() {
		
		return capacidad;	
		
	}
	
	/* Métodos abstractos */
	public abstract String printDatos();

}
