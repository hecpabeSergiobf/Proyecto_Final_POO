

/*
 * 	T�tulo: Excepci�n de Recursos
 * 	Nombre: H�ctor Paredes Benavides / Sergio Bermudez Fern�ndez
 * 	Descripci�n: Excepci�n con la que trabajamos cuando nos encontremos errores en la introducci�n de los recursos disponibles
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
