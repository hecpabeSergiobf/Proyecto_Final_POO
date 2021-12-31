

/*
 * 	Título: Prueba
 * 	Nombre: Héctor Paredes Benavides
 * 	Descripción: Creamos una clase para probar la interfaz gráfica
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
