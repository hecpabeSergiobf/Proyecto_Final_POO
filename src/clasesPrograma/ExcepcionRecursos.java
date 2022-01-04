

/*
 * 	Título: Excepción de Recursos
 * 	Nombre: Héctor Paredes Benavides / Sergio Bermudez Fernández
 * 	Descripción: Excepción con la que trabajamos cuando nos encontremos errores en la introducción de los recursos disponibles
 */

package clasesPrograma;

public class ExcepcionRecursos extends Exception{

	public ExcepcionRecursos() {
		
		super();
		
	}
	
	public ExcepcionRecursos(String msg) {
		
		super(msg);
		
	}
	
	
}
