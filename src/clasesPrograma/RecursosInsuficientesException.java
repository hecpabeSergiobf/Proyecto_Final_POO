

/*
 * 	Título: Excepción de Recursos Insuficientes
 * 	Nombre: Héctor Paredes Benavides
 * 	Descripción: Excepción que lanzamos cuando los recursos disponibles no sean suficientes para realizar la expedición
 */

package clasesPrograma;

public class RecursosInsuficientesException extends Exception {

	public RecursosInsuficientesException() {
		
		super();
		
	}
	
	public RecursosInsuficientesException(String msg) {
		
		super(msg);
		
	}
	
}
