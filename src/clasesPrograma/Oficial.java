

/*
 * 	Título: Oficial
 * 	Nombre: Héctor Paredes Benavides / Sergio Bermudez Fernández
 * 	Descripción: Clase con la que trabajamos con los oficiales
 */

package clasesPrograma;

public class Oficial extends Personas {

	/* Atributos */
	private int edad;
	private int experiencia;
	private boolean disponible;
	private static int contOficiales;
	
	/* Constructores */
	public Oficial(String nombre, int experiencia, int edad) {
		
		super(nombre,"Oficial");
		this.edad = edad;
		this.experiencia = experiencia;
		disponible = true;
		contOficiales++;
	}
	
	/* Métodos Getters */
	public static int getContOficiales() {
		
		return contOficiales;
		
	}
	
	public int getEdad() {
		
		return edad;
		
	}
	
	public int getExperiencia() {
		
		return experiencia;
		
	}
	
	public boolean getDisponible() {
		return disponible;
	}
	
	/* Métodos Setters */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	/* Métodos Públicos */
	public String printDatos() {
		
		return ("Nombre: " + getNombre() + "\nexp: " + experiencia + "\nedad: " + edad);
		
	}
	
	
}
