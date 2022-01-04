

/*
 * 	Título: Lectura de Fichero
 * 	nombre: Héctor Paredes Benavides / Sergio Bermudez Fernández
 * 	Descripción: Clase con la que leemos los datos del fichero de recursos disponibles para la expedición
 */

package entradaSalida;

// Clases del programa
import clasesPrograma.*;

// Bibliotecas de Java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;


public class Lectura_fichero{
		
	public static void leecturafichero(
			ArrayList<Oficial> avaliableOficiales, ArrayList<Guardia> avaliableGuardias, Operario avaliableOperarios
			,Arcon avaliableArcon, Vehiculo avaliableVehiculo, Caja avaliableCaja, Mochila avaliableMochila, Arma avaliableArmas) throws ExcepcionRecursos {
		
			int hayOficiales=0;
			int hayGuardias=0;
			
			//Inicializamos el fichero
			File fichero = new File("fichero.txt");
		
			//Creamos un Scanner para leer las lineas del fichero
			Scanner lectorLinea;
		
			try {
					
				//Le decimos al Scanneer que va a leer del fichero dentro de un try catch por si hay error
				lectorLinea = new Scanner(fichero);
				
				//Mientras que haya lineas lee el fichero
				while(lectorLinea.hasNextLine()) {
					
					//Lee la siguiente linea
					String linea = lectorLinea.nextLine();
					
					//Scanner para leer las palabras separadas
					Scanner lectorPalabra = new Scanner(linea);
					lectorPalabra.useDelimiter("\\s*;\\s*");
					
					//Metemos la lectura de palabras en un try catch por si hay algun parametro mal introducido
					try {
					
						//Mientras haya mas linea lee
						while(lectorPalabra.hasNext()) {
							
							//Separamos en token las lineas
							String token;
							token=lectorPalabra.next();
							
							//Comprobamos si es oficial, operario....
							if(token.equals("oficial")) {
								
								hayOficiales=1;
								//Inicializamos el nombre, edad, y experiencia 
								String nombre;
								int exp=0;
								int edad=0;
								
								//Los parseamos  y en caso de que no sea int saltara la Excepcion
								nombre = lectorPalabra.next();
								exp = lectorPalabra.nextInt();
								edad = lectorPalabra.nextInt();
								
								//Creamos el oficial y lo añadimos a una array list de nuestros oficiales disponibles
								Oficial ofi = new Oficial(nombre,exp,edad);
								
								avaliableOficiales.add(ofi);
								
							//Hacemos lo mismo que con Oficiales pero con guardias
							}else if(token.equals("guardia")){
								
								hayGuardias = 1;
								//Iniciamos nombre y aptitud
								String nombre;
								int aptitud = 0;
								
								//Cogemos del fichero el nombre del Guardia y su aptitud
								nombre=lectorPalabra.next();
								aptitud=lectorPalabra.nextInt();
								
								//Lo creamos y lo guardamos en una arrayList de guardias
								Guardia guardia = new Guardia(nombre,aptitud);
								
								avaliableGuardias.add(guardia);
								
							}else if(token.equals("operarios")){
								
								//Para los operarios solo tenemos un numero, Creamos el objeto en el main y se lo pasamos a leefichero para que el lo guarde
								int numOperarios;
								
								//Leemos el numero que hay
								numOperarios = lectorPalabra.nextInt();
								
								//Seteamos el numero de Operarios
								avaliableOperarios.setNumOperario(numOperarios);
							
							//Hacemos lo mismo para el resto de variables
							}else if(token.equals("cajas")){
								
								int numCajas;
								
								//Lemos el numero
								numCajas = lectorPalabra.nextInt();
								
								//Seteamos el numero de cajas
								avaliableCaja.setNumCajas(numCajas);
							
							}else if(token.equals("arcones")){
								
								int numArcones;
								
								//Lemos el numero
								numArcones=lectorPalabra.nextInt();
								
								//Seteamos el numero de Arcones
								avaliableArcon.setNumArcones(numArcones);
								
							}else if(token.equals("vehiculos")){
								
								int numVehiculos;
								
								//Leemos el numero de Vehiculos
								numVehiculos = lectorPalabra.nextInt();
								
								//Seteamos el numero de Vehiculos
								avaliableVehiculo.setNumVehiculos(numVehiculos);
								
							}else if(token.equals("mochilas")){
								
								int numMochilas;
								
								//Leemos el numero de Mochilas
								numMochilas = lectorPalabra.nextInt();
								
								//Seteamos el numero de Mochilas
								avaliableMochila.setNumMochilas(numMochilas);
								
							}else if(token.equals("armas")){
								
								int numArmas;
								
								//Leemos el numero de armas
								numArmas = lectorPalabra.nextInt();
								
								//Seteamos el numero de armas
								avaliableArmas.setNumArmas(numArmas);
								
							}
							
						}
						
					//En caso de que haya un error en el formato no no haya un int saltara a la excepcion
					} catch (Exception  exc) {
						//System.out.println("El fichero no tiene el formato correcto "+ exc.toString());
						lectorPalabra.close();
						fichero.delete();
						throw new ExcepcionRecursos("Fichero con formato incorrecto");
						
					}
					
					lectorPalabra.close();
									
				}
				
			//En caso de que el fichero no exista saltara al error
			}catch(FileNotFoundException exc) {
							
				System.out.println("Ha ocurrido un problema con el fichero");
				exc.printStackTrace();
				throw new ExcepcionRecursos("ERROR: No se ha encontrado fichero de recursos");
				
			}finally {
				
				//En caso de que se haya abierto el fichero lo cerramos
				try {
					if(null != fichero) {
						fichero.delete();
										
					}

				}catch(Exception exc2) {
					exc2.printStackTrace();
				}
			}
			
			//Coprobamos que esten todos los recursor y de no ser asi lanzamos la excepcion con su mensaje
			if(hayOficiales <= 0){	
				
				throw new ExcepcionRecursos("No hay Oficliales");
				
			}else if(hayGuardias <= 0){	
				
				throw new ExcepcionRecursos("No hay Guardias");
				
			}else if(avaliableOperarios.getNumOperario() <= 0) {
				
				throw new ExcepcionRecursos("No hay Operarios");
				
			}else if(avaliableArcon.getNumArcones() <= 0) {
				
				throw new ExcepcionRecursos("No hay Arcones");
				
			}else if(avaliableCaja.getNumCajas() <= 0) {
				
				throw new ExcepcionRecursos("No hay cajas");
				
			}else if(avaliableVehiculo.getNumVehiculos() <= 0) {
				
				throw new ExcepcionRecursos("No hay Vehiculos");
				
			}else if(avaliableArmas.getNumArmas() <= 0) {
				
				throw new ExcepcionRecursos("No hay Armas");
				
			}else if(avaliableMochila.getNumMochilas() <= 0) {
				
				throw new ExcepcionRecursos("No hay Mochilas");
				
			}
		
	}
	
}
