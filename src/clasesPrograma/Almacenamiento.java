package clasesPrograma;

public abstract class  Almacenamiento extends Recursos{
	
	private int capacidad;
	
	
	
	public Almacenamiento(int capacidad) {
		
		this.capacidad=capacidad;
		
		
	}
	
	
	public int getCapacidad() {
		
		return capacidad;
		
		
	}
	
	public abstract String printDatos();

}
