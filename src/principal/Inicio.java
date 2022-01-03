

/*
 * 	Título: Inicio
 * 	Autores: Héctor Paredes Benavides / Sergio Bermúdez Fernández
 * 	Descripción: Clase que inicializa el programa
 */

package principal;


import java.util.ArrayList;

import clasesPrograma.*;
import interfazGrafica.*;
import entradaSalida.*;

public class Inicio {

	public static void main(String args[]){
		
		//Creacion de variables para los obejetos disponibles para la expedicion
		ArrayList<Oficial> avaliableOficiales= new ArrayList<Oficial>();
		ArrayList<Guardia> avaliableGuardias= new ArrayList<Guardia>();
		Operario avaliableOperarios=new Operario(0);
		Arcon avaliableArcon=new Arcon(0);
		Vehiculo avaliableVehiculo=new Vehiculo(0);
		Caja avaliableCaja=new Caja(0);
		Mochila avaliableMochila=new Mochila(0);
		Arma avaliableArmas=new Arma(0);


		boolean excep=false;
		
		String msgError="";

		//Lo metemos dentro de un bloque try catch para en caso de que no haya un recurso coga la excepcion y acabe
		try {
			
			//Lectura del fichero y inicializaion de las variables a sus correspondientes valores
			Lectura_fichero.leecturafichero(avaliableOficiales,avaliableGuardias,avaliableOperarios,avaliableArcon,avaliableVehiculo,avaliableCaja,avaliableMochila,avaliableArmas);
		
		}catch(ExcepcionRecursos myException){
			
			//Imprimimos el mensaje para ver que es lo que falta en el fichero y terminamos el programa
			msgError=myException.getMessage();
			excep=true;
			
		}
		
		InterfazGrafica interfaz=new InterfazGrafica(avaliableOficiales.get(0).getcontOficiales(),avaliableGuardias.get(0).getcontGuardias(),
				avaliableOperarios.getnumOperario(),avaliableArmas.getnumArmas(),avaliableCaja.getnumCajas(),avaliableVehiculo.getnumVehiculos(),
				avaliableMochila.getnumMochilas(),avaliableArcon.getnumArcones());
		
		
		
		interfaz.setVisible(true);
		
		if(excep) {
			
			interfaz.muestraError(msgError);
			System.exit(1);
		}
		
		
	}
	
}
