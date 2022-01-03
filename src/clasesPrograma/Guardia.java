package clasesPrograma;

public class Guardia extends Personas {

	private int aptitud;
	private static int contGuardias=0;
	
	public Guardia(String Nombre,int aptitud) {
		
		super(Nombre,"Guardia");
		this.aptitud=aptitud;
		contGuardias++;
		
		
	}
	
	
	public int getAptitud() {
		
		return aptitud;
		
	}
	
	
	public int getcontGuardias() {
		
		return contGuardias;
		
	}
	
	public String printDatos() {
		
		
		return ("Nombre: "+super.getNombre()+"\nAptitud: "+aptitud);
		
		
	}
	
	
	
}
