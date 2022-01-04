

/*
 * 	Título: Operario
 * 	Nombre: Héctor Paredes Benavides / Sergio Bermudez Fernández
 * 	Descripción: Clase con la que trabajamos con los operarios
 */

package clasesPrograma;

public class Operario extends Personas{

	/* Atributos */
	private int numOperario;
	
	/* Constructores */
	public Operario(int numero) {
		
		super("Operario", "Operario");
		this.numOperario = numero;
		
	}
	
	/* Métodos Setters */
	public void setNumOperario(int numOperario) {
		
		this.numOperario=numOperario;
	
	}
	
	/* Métodos Getters */
	public int getNumOperario() {
		
		return numOperario;
	
	}
	
	/* Métodos Públicos */
	public String printDatos() {
		
		return ("Numero de Operaios: " + numOperario);
		
	}
	
}