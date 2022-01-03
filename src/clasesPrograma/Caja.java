package clasesPrograma;

public class Caja extends Almacenamiento{
	
	private int numCajas;
	
	public Caja(int Numero) {
		
		super(100);
		this.numCajas=Numero;
		
	}
	
	public void setnumCajas(int numCajas) {
		
		this.numCajas=numCajas;
	
	}
	
	public int getnumCajas() {
		
		return numCajas;
	
	}
	
	public int getCapacidad() {
		
		return super.getCapacidad();
		
	}
	
	
	public String printDatos() {
		
		return ("Numero de Cajas: "+numCajas+ " capacidad por Caja de "+ super.getCapacidad());
		
	}
}
