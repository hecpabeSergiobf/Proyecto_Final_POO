

/*
 * 	T�tulo: Excepci�n de Introducci�n de Errores
 * 	Nombre: H�ctor Paredes Benavides
 * 	Descripci�n: Excepci�n que ser� lanzada cuando el usuario introduzca datos erroneos en los campos de input
 */

package interfazGrafica;

public class ErroresIntroducidosException extends Exception {

	public ErroresIntroducidosException() {
		super();
	}
	
	public ErroresIntroducidosException(String message) {
		super(message);
	}
	
}
