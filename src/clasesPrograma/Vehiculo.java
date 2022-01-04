

/*
 * 	Título: Vehículo
 * 	Nombre: Héctor Paredes Benavides / Sergio Bermudez Fernández
 * 	Descripción: Clase con la que representamos a los vehículos
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
	
	/* Métodos Setters */
	public void setNumVehiculos(int numVehiculos) {
		
		this.numVehiculos = numVehiculos;
	
	}
	
	/* Métodos Getters */
	public int getNumVehiculos() {
		
		return numVehiculos;
	
	}
	
	/* Métodos Públicos */
	public String printDatos() {
		
		return ("numero de vehiculos: " + numVehiculos + " capacidad por vehiculo de " + getCapacidad());
		
	}
	
}