package clasesPrograma;

public class Operario extends Personas{

	private int numOperario;
	
	
	
	public Operario(int Numero) {
		
		super("Operario","Operario");
		this.numOperario=Numero;
		
	}
	
	
	public void setnumOperario(int numOperario) {
		
		this.numOperario=numOperario;
	
	}
	
	public int getnumOperario() {
		
		return numOperario;
	
	}
	
	
	public String printDatos() {
		
		return ("Numero de Operaios: "+numOperario);
		
	}
	
	
	

	
	
	
	
}
