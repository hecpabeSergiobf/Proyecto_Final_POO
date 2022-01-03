package clasesPrograma;

public class Arcon extends Almacenamiento{

	private int numArcones;
	
	public Arcon(int Numero) {
		
		super(500);
		this.numArcones=Numero;
		
	}
	
	
	public void setnumArcones(int numArcones) {
		
		this.numArcones=numArcones;
	
	}
	
	public int getnumArcones() {
		
		return numArcones;
	
	}
	
	public int getCapacidad() {
		
		return super.getCapacidad();
		
	}
	
	
	public String printDatos() {
		
		return ("Numero de arcones: "+numArcones+ " capacidad por arcon de "+ super.getCapacidad());
		
	}
	
}
