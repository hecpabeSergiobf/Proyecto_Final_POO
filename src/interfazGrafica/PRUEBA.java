

/*
 * 	T�tulo: Prueba
 * 	Nombre: H�ctor Paredes Benavides
 * 	Descripci�n: Creamos una clase para probar la interfaz gr�fica
 */

package interfazGrafica;

public class Prueba {

	public static void main(String args[]) {
		
		Prueba programa = new Prueba();
		programa.inicializa();
		
	}
	
	public void inicializa() {
		
		InterfazGrafica interfaz = new InterfazGrafica(1, 2, 3, 4, 5, 6, 7, 8);
		interfaz.setVisible(true);
		
	}
	
}
