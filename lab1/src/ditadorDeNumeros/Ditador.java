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
	private String[] centenas = {
		null, "cem", "duzentos", "trezentos", "quatrocentos",
		"quinhentos", "seiscentos", "setecentos", "oitocentos",
		"novecentos"
	};
	
	
	
	public Ditador(){
		
	}
	
	public String numeroPorExtenso(int numero){
		
		
		if (numero <20 && numero!=10){	
			return numero0A19Sem10[numero];
		}
		if(numero%10 == 0 && numero<91){
			return dezenas [numero/10];
		}
		if(numero%100 == 0 && numero<901){
			return centenas[numero/100];
		}
		return null;
	}
}
