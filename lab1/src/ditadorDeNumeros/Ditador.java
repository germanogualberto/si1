package ditadorDeNumeros;

public class Ditador {

	private String[] numero0A19Sem10;
	
	public Ditador(){
		
	}
	
	public String numeroPorExtenso(int numero){
		
		if (numero <20){
			
			return numero0A19Sem10[numero];
		}
		return null;
	}
}
