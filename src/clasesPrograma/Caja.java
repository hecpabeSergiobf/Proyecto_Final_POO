

/*
 * 	T�tulo: Caja
 * 	Nombre: H�ctor Paredes Benavides / Sergio Bermudez Fern�ndez
 * 	Descripci�n: Clase con la que trabajamos con las cajas
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
	
	/* M�todos Setters */
	public void setNumCajas(int numCajas) {
		
		this.numCajas = numCajas;
	
	}
	
	/* M�todos Getters */
	public int getNumCajas() {
		
		return numCajas;
	
	}
	
	/* M�todos P�blicos */
	public String printDatos() {
		
		return ("Numero de Cajas: " + numCajas + " capacidad por Caja de " + getCapacidad());
		
	}
}
