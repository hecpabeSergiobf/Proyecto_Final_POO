

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
		disponible = true;
		contOficiales++;
	}
	
	/* M�todos Getters */
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
	
	/* M�todos Setters */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	/* M�todos P�blicos */
	public String printDatos() {
		
		return ("Nombre: " + getNombre() + "\nexp: " + experiencia + "\nedad: " + edad);
		
	}
	
	
}
