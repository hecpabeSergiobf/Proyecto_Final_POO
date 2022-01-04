

/*
 * 	Título: Inicio
 * 	Autores: Héctor Paredes Benavides / Sergio Bermúdez Fernández
 * 	Descripción: Clase que inicializa el programa
 */

package principal;

// Bibliotecas de Java
import java.util.ArrayList;

// Clases del programa
import clasesPrograma.*;
import interfazGrafica.*;
import entradaSalida.*;

public class Inicio {

	public static void main(String args[]){
		
		//Creacion de variables para los obejetos disponibles para la expedicion
		ArrayList<Oficial> avaliableOficiales = new ArrayList<Oficial>();
		ArrayList<Guardia> avaliableGuardias = new ArrayList<Guardia>();
		Operario avaliableOperarios = new Operario(0);
		Arcon avaliableArcon = new Arcon(0);
		Vehiculo avaliableVehiculo = new Vehiculo(0);
		Caja avaliableCaja = new Caja(0);
		Mochila avaliableMochila = new Mochila(0);
		Arma avaliableArmas = new Arma(0);

		// Interfaz Gráfica
		InterfazGrafica interfaz;
<<<<<<< HEAD
=======
		
		// Expedición
		Expedicion expedicion;
>>>>>>> calculadorExpediciones

		// Variable con la que detectamos si ha ocurrido algún error en la lectura del fichero
		boolean excep=false;
		
		// Variable con la que recogemos y mostramos el mensaje de error de la excepción
		String msgError="";

		//Lo metemos dentro de un bloque try catch para en caso de que no haya un recurso coga la excepcion y acabe
		try {
			
			//Lectura del fichero y inicializaion de las variables a sus correspondientes valores
			Lectura_fichero.leecturafichero(avaliableOficiales, avaliableGuardias, avaliableOperarios, avaliableArcon, avaliableVehiculo, avaliableCaja,
					avaliableMochila, avaliableArmas);
		
		}catch(ExcepcionRecursos myException){
			
			//Imprimimos el mensaje para ver que es lo que falta en el fichero y terminamos el programa
			msgError=myException.getMessage();
			excep=true;
			
		}
		
		// Si hay excepción creamos la interfaz con todo inicializado a 0, si no, con los valores leídos de fichero
		if(excep) {
<<<<<<< HEAD
			interfaz = new InterfazGrafica(0, 0, 0, 0, 0, 0, 0, 0);
		}
		else {
			interfaz = new InterfazGrafica(
					avaliableOficiales.get(0).getContOficiales(),avaliableGuardias.get(0).getcontGuardias(),
					avaliableOperarios.getNumOperario(),avaliableArmas.getNumArmas(),avaliableCaja.getNumCajas(),avaliableVehiculo.getNumVehiculos(),
					avaliableMochila.getNumMochilas(),avaliableArcon.getNumArcones());
=======
			expedicion = new Expedicion(avaliableOficiales, avaliableGuardias, 0, 0, 0, 0, 0, 0);
			interfaz = new InterfazGrafica(expedicion);
		}
		else {
			expedicion = new Expedicion(avaliableOficiales, avaliableGuardias, avaliableOperarios.getNumOperario(), avaliableArmas.getNumArmas(),
					avaliableCaja.getNumCajas(), avaliableVehiculo.getNumVehiculos(), avaliableMochila.getNumMochilas(), avaliableArcon.getNumArcones());
			interfaz = new InterfazGrafica(expedicion);
>>>>>>> calculadorExpediciones
		}
		
		// Mostramos la interfaz
		interfaz.setVisible(true);
		
		// Si ocurrió algún error lo mostramos por la interfaz gráfica
		if(excep) {
			
			interfaz.muestraError(msgError);
			System.exit(1);
		}
		
		
	}
	
}
