package ditadorDeNumeros;

public class Ditador {

	private String[] numero0A19Sem10 = {
		"zero", "um", "dois", "três", "quatro", "cinco", 
		"seis", "sete", "oito", "nove", null, "onze",
		"doze", "treze", "catorze", "quinze", "dezesseis",
		"dezessete", "dezoito", "dezenove"
	};
	private String[] dezenas = {
		null, "dez", "vinte", "trinta", "quarenta", "cinquenta",
		"sessenta", "setenta", "oitenta", "noventa"
	};
	
	
	
	public Ditador(){
		
	}
	
	public String numeroPorExtenso(int numero){
		
		if(numero%10 == 0 && numero>9){
			return dezenas [numero/10];
		}
		if (numero <20){	
			return numero0A19Sem10[numero];
		}
		return null;
	}
}
