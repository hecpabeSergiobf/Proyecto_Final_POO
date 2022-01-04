

/*
 * 	Título: Arcón
 * 	Nombre: Héctor Paredes Benavides / Sergio Bermudez Fernández
 * 	Descripción: Clase con la que trabajamos con los arcones
 */

package clasesPrograma;

public class Arcon extends Almacenamiento implements Canjeable {

	/* Constantes */
	public static final int CAPACIDAD_ARCONES = 200;
	
	/* Atributos */
	private int numArcones;
	
	/* Constructores */
	public Arcon(int Numero) {
		
		super(CAPACIDAD_ARCONES);
		this.numArcones=Numero;
		
	}	
	
	/* Métodos Setters */
	public void setNumArcones(int numArcones) {
		
		this.numArcones=numArcones;
	
	}
	
	/* Métodos Getters */
	public int getNumArcones() {
		
		return numArcones;
	
	}
	
	/* Métodos públicos */
	public String printDatos() {
		
		return ("Numero de arcones: " + numArcones + " capacidad por arcon de " + getCapacidad());
		
	}
	
<<<<<<< HEAD
=======
	public int canjea(int cantidadACanjear) {
		
		int cajasCanjeadas = 0;
		
		// Las cajas que canjearemos será la cantidad de cajas que podemos canjear con un arcón por el número de los mismos que queremos canjear
		cajasCanjeadas = CAPACIDAD_ARCONES / Caja.CAPACIDAD_CAJA;
		cajasCanjeadas *= cantidadACanjear;
		
		return cajasCanjeadas;
		
	}
	
>>>>>>> calculadorExpediciones
}