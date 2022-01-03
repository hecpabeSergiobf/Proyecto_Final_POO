package clasesPrograma;

public class Mochila extends Recursos{

	
	private int numMochilas;
	
	public Mochila(int Numero) {
		
		this.numMochilas=Numero;
		
	}
	
	
	public void setnumMochilas(int numMochilas) {
		
		this.numMochilas=numMochilas;
	
	}
	
	public int getnumMochilas() {
		
		return numMochilas;
	
	}
	
	
	public String printDatos() {
		
		return ("Numero de mochilas: "+numMochilas);
	}
}
