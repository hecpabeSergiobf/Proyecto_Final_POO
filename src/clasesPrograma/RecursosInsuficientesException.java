

/*
 * 	T�tulo: Excepci�n de Recursos Insuficientes
 * 	Nombre: H�ctor Paredes Benavides
 * 	Descripci�n: Excepci�n que lanzamos cuando los recursos disponibles no sean suficientes para realizar la expedici�n
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
