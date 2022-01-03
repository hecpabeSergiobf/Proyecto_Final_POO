package clasesPrograma;

public class Oficial extends Personas {

	//Variables
	private int edad;
	private int experiencia;
	private static int contOficiales;
	
	
	//CONSTRUCTOR
	public Oficial(String Nombre,int experiencia,int edad) {
		
		super(Nombre,"Oficial");
		this.edad=edad;
		this.experiencia=experiencia;
		contOficiales++;
	}
	
	//Set
	public void setNombre(String Nombre) {
		
		super.setNombre(Nombre);
		
	}
	
	public String getNombre() {
		
		return super.getNombre();
		
	}
	
	public int getcontOficiales() {
		
		return contOficiales;
		
	}
	
	
	public int getEdad() {
		
		return edad;
		
	}
	
	public int getExperiencia() {
		
		return experiencia;
		
	}
	
	public String printDatos() {
		
		
		return ("Nombre: "+super.getNombre()+"\nexp: "+ experiencia+"\nedad: "+edad);
		
		
	}
	
	
}
