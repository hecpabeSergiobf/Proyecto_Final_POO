

/*
 * 	T�tulo: Personas
 * 	nombre: H�ctor Paredes Benavides
 * 	Descripci�n: Clase abstracta con la que representamos a las personas (oficiales, guardias y operarios)
 */

package clasesPrograma;

public abstract class Personas {

	/* Atributos */
	private String nombre;
	private String puesto;
	
	/* Constructores */
	public Personas(String nombre, String puesto) {
		
		this.nombre = nombre;
		this.puesto = puesto;
		
	}
	
	/* M�todos Getters */
	public final String getNombre() {
		
		return nombre;
		
	}
	
	/* M�todos Setters */
	public final String getPuesto() {
		
		return puesto;
		
	}
	
	/* M�todos Setters */
	public final void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	/* M�todos P�blicos */
	public abstract String printDatos();
	
}
