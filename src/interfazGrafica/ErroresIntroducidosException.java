

/*
 * 	Título: Excepción de Introducción de Errores
 * 	Nombre: Héctor Paredes Benavides
 * 	Descripción: Excepción que será lanzada cuando el usuario introduzca datos erroneos en los campos de input
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
