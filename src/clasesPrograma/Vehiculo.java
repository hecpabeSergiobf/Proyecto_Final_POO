package clasesPrograma;

public class Vehiculo extends Almacenamiento {

	
	private int numVehiculos;
	
	public Vehiculo(int Numero) {
		
		super(1000);
		this.numVehiculos=Numero;
		
	}
	
	
	public void setnumVehiculos(int numVehiculos) {
		
		this.numVehiculos=numVehiculos;
	
	}
	
	public int getnumVehiculos() {
		
		return numVehiculos;
	
	}
	
	public int getCapacidad() {
		
		return super.getCapacidad();
		
	}
	
	
	public String printDatos() {
		
		return ("Numero de vehiculos: "+ numVehiculos+ " capacidad por vehiculo de "+ super.getCapacidad());
		
	}
	
	
	
}
