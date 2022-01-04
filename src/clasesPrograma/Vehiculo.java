

/*
 * 	T�tulo: Veh�culo
 * 	Nombre: H�ctor Paredes Benavides / Sergio Bermudez Fern�ndez
 * 	Descripci�n: Clase con la que representamos a los veh�culos
 */

package clasesPrograma;

public class Vehiculo extends Almacenamiento {

	/* Constantes */
	public static final int CAPACIDAD_VEHICULO = 1000;
	
	/* Atributos */
	private int numVehiculos;
	
	/* Constructores */
	public Vehiculo(int numero) {
		
		super(CAPACIDAD_VEHICULO);
		this.numVehiculos = numero;
		
	}
	
	/* M�todos Setters */
	public void setNumVehiculos(int numVehiculos) {
		
		this.numVehiculos = numVehiculos;
	
	}
	
	/* M�todos Getters */
	public int getNumVehiculos() {
		
		return numVehiculos;
	
	}
	
	/* M�todos P�blicos */
	public String printDatos() {
		
		return ("numero de vehiculos: " + numVehiculos + " capacidad por vehiculo de " + getCapacidad());
		
	}
	
}