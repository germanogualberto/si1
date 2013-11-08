package ditadorDeNumeros;

public class Ditador {

	private String[] numero0A19Sem10 = {
		"zero", "um", "dois", "três", "quatro", "cinco", 
		"seis", "sete", "oito", "nove", null, "onze",
		"doze", "treze", "catorze", "quinze", "dezesseis",
		"dezessete", "dezoito", "dezenove"
	};
	
	public Ditador(){
		
	}
	
	public String numeroPorExtenso(int numero){
		
		if (numero <20){	
			return numero0A19Sem10[numero];
		}
		return null;
	}
}
