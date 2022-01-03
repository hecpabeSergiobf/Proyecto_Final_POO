package clasesPrograma;

public abstract class Personas {

	
	private String Nombre;
	private String Puesto;
	
	
	public Personas(String Nombre,String Puesto) {
		
		this.Nombre=Nombre;
		this.Puesto=Puesto;
		
	}
	
	
	public String getNombre() {
		
		return Nombre;
		
	}
	
	public String getPuesto() {
		
		return Puesto;
		
	}
	
	public  void setNombre(String Nombre) {
		
		this.Nombre=Nombre;
		
	}
	
	
	//Funcion para el polimorfismo
	public abstract String printDatos();
	
}
