package clasesPrograma;

public class Arma {

	private int numArmas;
	
	public Arma(int Numero) {
		
		this.numArmas=Numero;
		
	}
	
	public void setnumArmas(int numArmas) {
		
		this.numArmas=numArmas;
	
	}
	
	public int getnumArmas() {
		
		return numArmas;
	
	}
	
	
	
	public String printDatos() {
		
		return ("Numero de armas: "+numArmas);
	}
	
}
