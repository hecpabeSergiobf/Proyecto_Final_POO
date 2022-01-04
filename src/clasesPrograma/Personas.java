

/*
 * 	Título: Personas
 * 	nombre: Héctor Paredes Benavides
 * 	Descripción: Clase abstracta con la que representamos a las personas (oficiales, guardias y operarios)
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
	
	/* Métodos Getters */
	public final String getNombre() {
		
		return nombre;
		
	}
	
	/* Métodos Setters */
	public final String getPuesto() {
		
		return puesto;
		
	}
	
	/* Métodos Setters */
	public final void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	/* Métodos Públicos */
	public abstract String printDatos();
	
}
