

/*
 * 	T�tulo: Mochila
 * 	Nombre: H�ctor Paredes Benavides / Sergio Bermudez Fern�ndez
 * 	Descripci�n: Clase con la que trabajamos con las mochilas
 */

package clasesPrograma;

public class Mochila extends Recursos{

	/* Atributos */
	private int numMochilas;
	
	/* Constructores */
	public Mochila(int numero) {
		
		this.numMochilas = numero;
		
	}
	
	/* M�todos Setters */
	public void setNumMochilas(int numMochilas) {
		
		this.numMochilas = numMochilas;
	
	}
	
	/* M�todos Getters */
	public int getNumMochilas() {
		
		return numMochilas;
	
	}
	
	/* M�todos P�blicos */
	public String printDatos() {
		
		return ("Numero de mochilas: " + numMochilas);
	}
}
