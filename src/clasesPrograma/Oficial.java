

/*
 * 	T�tulo: Oficial
 * 	Nombre: H�ctor Paredes Benavides / Sergio Bermudez Fern�ndez
 * 	Descripci�n: Clase con la que trabajamos con los oficiales
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
<<<<<<< HEAD
=======
		disponible = true;
>>>>>>> calculadorExpediciones
		contOficiales++;
	}
	
	/* M�todos Getters */
<<<<<<< HEAD
	public int getContOficiales() {
=======
	public static int getContOficiales() {
>>>>>>> calculadorExpediciones
		
		return contOficiales;
		
	}
	
	public int getEdad() {
		
		return edad;
		
	}
	
	public int getExperiencia() {
		
		return experiencia;
		
	}
	
<<<<<<< HEAD
=======
	public boolean getDisponible() {
		return disponible;
	}
	
	/* M�todos Setters */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
>>>>>>> calculadorExpediciones
	/* M�todos P�blicos */
	public String printDatos() {
		
		return ("Nombre: " + getNombre() + "\nexp: " + experiencia + "\nedad: " + edad);
		
	}
	
	
}
