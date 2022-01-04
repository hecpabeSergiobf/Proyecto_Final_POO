

/*
 * 	Título: Expedición
 * 	Nombre: Héctor Paredes Benavides / Sergio Bermudez Fernández
 * 	Descripción: Clase con la que calculamos y trabajamos con las expediciones
 */

package clasesPrograma;

import java.util.ArrayList;

public class Expedicion {

	/* Constantes */
	public static final int NUM_PERSONAS_POR_SUBOFICIAL = 20;
	public static final int NUM_PERSONAS_POR_GUARDIA = 10;
	public static final int MULTIPLICADOR_GUARDIAS_PELIGROSIDAD = 2;
	public static final int NUM_PERSONAS_POR_VEHICULO = 10;
	
	/* Atributos */
	// Datos de la expedición
	private int numPersonas;
	private int cantidadPeso;
	private boolean expedicionPeligrosa;
	
	// Material disponible
	private ArrayList<Oficial> oficialesDisponibles;
	private ArrayList<Guardia> guardiasDisponibles;
	private int operariosDisponibles;
	private int armasDisponibles;
	private int cajasDisponibles;
	private int vehiculosDisponibles;
	private int mochilasDisponibles;
	private int arconesDisponibles;
	
	// Material para la expedición
	private Oficial capitanExpedicion;
	private ArrayList<Oficial> subOficialesExpedicion;
	private ArrayList<Guardia> guardiasExpedicion;
	private int operariosExpedicion;
	private int armasExpedicion;
	private int cajasExpedicion;
	private int vehiculosExpedicion;
	private int mochilasExpedicion;
	private int arconesExpedicion;
	
	/* Constructores */
	public Expedicion(
			ArrayList<Oficial> oficialesDisponibles, ArrayList<Guardia> guardiasDisponibles, int operariosDisponibles, int armasDisponibles, int cajasDisponibles,
			int vehiculosDisponibles, int mochilasDisponibles, int arconesDisponibles
	){

		this.oficialesDisponibles = oficialesDisponibles;
		this.guardiasDisponibles = guardiasDisponibles;
		this.operariosDisponibles = operariosDisponibles;
		this.armasDisponibles = armasDisponibles;
		this.cajasDisponibles = cajasDisponibles;
		this.vehiculosDisponibles = vehiculosDisponibles;
		this.mochilasDisponibles = mochilasDisponibles;
		this.arconesDisponibles = arconesDisponibles;
		
	}
	
	/* Métodos Setters */
	public void setNumPersonas(int numPersonas) {
		if(numPersonas > 0)
			this.numPersonas = numPersonas;
		else
			this.numPersonas = 0;
	}
	
	public void setCantidadPeso(int cantidadPeso) {
		if(cantidadPeso > 0)
			this.cantidadPeso = cantidadPeso;
		else
			this.cantidadPeso = 0;
	}
	
	public void setExpedicionPeligrosa(boolean expedicionPeligrosa) {
		this.expedicionPeligrosa = expedicionPeligrosa;
	}
	
	/* Métodos Getters */
	public ArrayList<Oficial> getOficialesDisponibles(){
		return oficialesDisponibles;
	}
	
	public ArrayList<Guardia> getGuardiasDisponibles(){
		return guardiasDisponibles;
	}
	
	public int getOperariosDisponibles() {
		return operariosDisponibles;
	}
	
	public int getArmasDisponibles() {
		return armasDisponibles;
	}
	
	public int getCajasDisponibles() {
		return cajasDisponibles;
	}
	
	public int getVehiculosDisponibles() {
		return vehiculosDisponibles;
	}
	
	public int getMochilasDisponibles() {
		return mochilasDisponibles;
	}
	
	public int getArconesDisponibles() {
		return arconesDisponibles;
	}
	
	public Oficial getCapitanExpedicion() {
		return capitanExpedicion;
	}
	
	public ArrayList<Oficial> getSubOficialesExpedicion(){
		return subOficialesExpedicion;
	}
	
	public ArrayList<Guardia> getGuardiasExpedicion(){
		return guardiasExpedicion;
	}
	
	public int getOperariosExpedicion() {
		return operariosExpedicion;
	}
	
	public int getArmasExpedicion() {
		return armasExpedicion;
	}
	
	public int getCajasExpedicion() {
		return cajasExpedicion;
	}
	
	public int getVehiculosExpedicion() {
		return vehiculosExpedicion;
	}
	
	public int getMochilasExpedicion() {
		return mochilasExpedicion;
	}
	
	public int getArconesExpedicion() {
		return arconesExpedicion;
	}
	
	/* Métodos Públicos */
	public void calculaExpedicion() throws RecursosInsuficientesException {
		
		/* Limpiamos los atributos */
		limpiaAtributos();
		
		/* Asignamos como Capitán al oficial con más experiencia */
		asignaCapitan();
		
		/* Asignamos los SubOficiales */
		asignaSubOficiales();
		
		/* Asignamos los Guardias */
		asignaGuardias();
		
		/* Asignamos a los Operarios */
		asignaOperarios();
		
		/* Asignamos las armas */
		asignaArmas();
		
		/* Asignamos los vehículos */
		asignaVehiculos();
		
		/* Asignamos las mochilas */
		asignaMochilas();
		
		/* Asignamos los arcones */
		asignaArcones();
		
		/* Asignamos las cajas */
		asignaCajas();
		
	}	
	
	/* Métodos Privados de la Clase */
	private void limpiaAtributos() {
		
		// Limpiamos los atributos de recursos disponibles
		for(int i = 0; i < oficialesDisponibles.size(); i++)
			oficialesDisponibles.get(i).setDisponible(true);
		
		// Limpiamos los atributos de recursos asignados
		subOficialesExpedicion = new ArrayList<Oficial>();
		guardiasExpedicion = new ArrayList<Guardia>();
		
	}
	
	private void asignaCapitan() {
		
		// Ordenamos los oficiales de mayor a menor experiencia
		for(int i = oficialesDisponibles.size() - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(oficialesDisponibles.get(j).getExperiencia() < oficialesDisponibles.get(j + 1).getExperiencia()) {
					Oficial oficialAuxiliar = oficialesDisponibles.get(j + 1);
					oficialesDisponibles.set(j + 1, oficialesDisponibles.get(j));
					oficialesDisponibles.set(j, oficialAuxiliar);
				}
			}
		}
		
		/* DEBUG
		for(int i = 0; i < oficialesDisponibles.size(); i++)
			System.out.println("Oficial " + i + ": / Nombre: " + oficialesDisponibles.get(i).getNombre() + " / Experiencia: " + oficialesDisponibles.get(i).getExperiencia());
		*/
		
		// Asignamos al primer puesto del array tras haberlo ordenado
		capitanExpedicion = oficialesDisponibles.get(0);
		capitanExpedicion.setDisponible(false);
		
	}
	
	private void asignaSubOficiales() throws RecursosInsuficientesException {
		
		if(numPersonas >= 20) {
			
			int numSubOficiales = numPersonas / NUM_PERSONAS_POR_SUBOFICIAL;
			int subOficialesAsignados = 0;
			int indiceOficiales = 0;
			
			// Ordenamos los oficiales de menor a mayor edad
			for(int i = oficialesDisponibles.size() -1; i > 0; i--) {
				for(int j = 0; j < i; j++) {
					if(oficialesDisponibles.get(j).getEdad() > oficialesDisponibles.get(j + 1).getEdad()) {
						Oficial oficialAuxiliar = oficialesDisponibles.get(j + 1);
						oficialesDisponibles.set(j + 1, oficialesDisponibles.get(j));
						oficialesDisponibles.set(j, oficialAuxiliar);
					}
				}
			}
			
			/* DEBUG
			for(int i = 0; i < oficialesDisponibles.size(); i++)
				System.out.println("Oficial " + i + ": / Nombre: " + oficialesDisponibles.get(i).getNombre() + " / Edad: " + oficialesDisponibles.get(i).getEdad());
			*/
			
			// Si se necesitan más suboficiales de los que hay disponibles lanzamos error
			if(numSubOficiales > (oficialesDisponibles.size() - 1))
				throw new RecursosInsuficientesException("ERROR: No hay Sub-Oficiales disponibles para realizar la expedición.");
			
			// Buscamos a los oficiales más jóvenes que se encuentren disponibles (no sean el capitán) y los asignamos
			while(subOficialesAsignados < numSubOficiales) {
				
				if(oficialesDisponibles.get(indiceOficiales).getDisponible()) {
					subOficialesExpedicion.add(oficialesDisponibles.get(indiceOficiales));
					subOficialesExpedicion.get(subOficialesAsignados).setDisponible(false);
					/* DEBUG
					System.out.println("Oficial: " + oficialesDisponibles.get(indiceOficiales).getNombre() + " " + oficialesDisponibles.get(indiceOficiales).getDisponible());
					System.out.println("SubOficial: " + subOficialesExpedicion.get(subOficialesAsignados).getNombre() + " " + subOficialesExpedicion.get(subOficialesAsignados).getDisponible());
					*/
					subOficialesAsignados++;
				}
				
				indiceOficiales++;
				
			}
			
		}
		
	}
	
	private void asignaGuardias() throws RecursosInsuficientesException {
		
		int numGuardias = numPersonas / NUM_PERSONAS_POR_GUARDIA;
		
		if(expedicionPeligrosa)
			numGuardias *= MULTIPLICADOR_GUARDIAS_PELIGROSIDAD;
		
		// Si necesitamos más guardias de los que disponemos lanzamos error
		if(numGuardias > guardiasDisponibles.size())
			throw new RecursosInsuficientesException("ERROR: No hay suficientes guardias para la expedición.");
		
		// Ordenamos la lista de guardias de mayor a menor aptitud
		for(int i = guardiasDisponibles.size() - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(guardiasDisponibles.get(j).getAptitud() < guardiasDisponibles.get(j + 1).getAptitud()) {
					Guardia guardiaAuxiliar = guardiasDisponibles.get(j + 1);
					guardiasDisponibles.set(j + 1, guardiasDisponibles.get(j));
					guardiasDisponibles.set(j, guardiaAuxiliar);
				}
			}
		}
		
		/* DEBUG
		for(int i = 0; i < guardiasDisponibles.size(); i++)
			System.out.println("Guardia " + i + " / Nombre: " + guardiasDisponibles.get(i).getNombre() + " / Aptitud: " + guardiasDisponibles.get(i).getAptitud());
		*/
		
		for(int i = 0; i < numGuardias; i++)
			guardiasExpedicion.add(guardiasDisponibles.get(i));
		
	}
	
	private void asignaOperarios() {
		
		// Como no hay criterio de selección para los operarios seleccionamos un número aleatorio de los que tenemos disponibles
		operariosExpedicion = (int)(Math.random() * operariosDisponibles);
		
	}

	private void asignaArmas() throws RecursosInsuficientesException {
		
		// Armas necesarias = 1 para cada guardia (n guardias) + 1 para cada oficial (n suboficiales + el capitán)
		int armasNecesarias = guardiasExpedicion.size() + subOficialesExpedicion.size() + 1;
		
		// Si necesitamos más armas de las que disponemos lanzamos error
		if(armasNecesarias > armasDisponibles)
			throw new RecursosInsuficientesException("ERROR: No hay suficientes armas para la expedición.");
		
		armasExpedicion = armasNecesarias;
		
	}

	private void asignaCajas() throws RecursosInsuficientesException {
		
		int cajasNecesarias = cantidadPeso / Caja.CAPACIDAD_CAJA;
		
		int cajasAUsar = 0;
		int arconesAUsar = 0;
		int vehiculosAUsar = 0;
		
		Arcon arconAuxiliar = new Arcon(0);
		Vehiculo vehiculoAuxiliar = new Vehiculo(0);
		
		if(cajasNecesarias > cajasDisponibles) {
			
			System.out.println("CAJAS NECESARIAS: " + cajasNecesarias + " CAJAS DISPONIBLES: " + cajasDisponibles);
			
			cajasNecesarias -= cajasDisponibles;
			
			cajasAUsar = cajasDisponibles;
			
			while(cajasNecesarias > 0 && arconesAUsar < (arconesDisponibles - arconesExpedicion)) {
				
				cajasNecesarias -= arconAuxiliar.canjea(1);
				arconesAUsar++;
				System.out.println("ENTRA EN EL PRIMER WHILE / Cajas necesarias: " + cajasNecesarias + " arcones a usar: " + arconesAUsar + " arcones disponibles: " + (arconesDisponibles - arconesExpedicion));
				
			}
			
			if(cajasNecesarias > 0) {
				
				while(cajasNecesarias > 0 && vehiculosAUsar < (vehiculosDisponibles - vehiculosExpedicion)) {
					
					cajasNecesarias -= vehiculoAuxiliar.canjea(1);
					vehiculosAUsar++;
					
				}
				
				if(cajasNecesarias > 0)
					throw new RecursosInsuficientesException("ERROR: No hay Cajas / Arcones / Vehículos suficientes para cargar con el peso de la expedición");
				
			}
			
		}
		else
			cajasAUsar = cajasNecesarias;
		
		cajasExpedicion = cajasAUsar;
		arconesExpedicion += arconesAUsar;
		vehiculosExpedicion += vehiculosAUsar;
	
	}
	
	private void asignaVehiculos() throws RecursosInsuficientesException {
		
		int vehiculosNecesarios = numPersonas / NUM_PERSONAS_POR_VEHICULO;
		
		// Si necesitamos más vehículos de los que disponemos lanzamos error
		if(vehiculosNecesarios > vehiculosDisponibles)
			throw new RecursosInsuficientesException("ERROR: No hay suficientes vehículos para la expedición.");
		
		vehiculosExpedicion = vehiculosNecesarios;
		
	}

	private void asignaMochilas() throws RecursosInsuficientesException {
		
		// Mochilas necesarias = 1 para cada miembro menos para oficiales (miembros + guardias)
		int mochilasNecesarias = numPersonas + guardiasExpedicion.size();
		
		// Si necesitamos más mochilas de las que disponemos lanzamos error
		if(mochilasNecesarias > mochilasDisponibles)
			throw new RecursosInsuficientesException("ERROR: No hay mochilas insuficientes para la expedición.");
		
		mochilasExpedicion = mochilasNecesarias;
		
	}
	
	private void asignaArcones() throws RecursosInsuficientesException {
		
		// Arcones Necesarios = 1 para cada oficial (n subOficiales + el Capitán)
		int arconesNecesarios = subOficialesExpedicion.size() + 1;
		
		// Si necesitamos más arcones de los que disponemos lanzamos error
		if(arconesNecesarios > arconesDisponibles)
			throw new RecursosInsuficientesException("ERROR: No hay arcones suficientes para la expedición.");
		
		arconesExpedicion = arconesNecesarios;
		
	}
	
}
