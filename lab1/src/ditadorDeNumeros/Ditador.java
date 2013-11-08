package ditadorDeNumeros;

public class Ditador {

	private final String CONECTIVO = " e "; 
	private final String[] NUMERO0A19SEM10 = {
		"zero", "um", "dois", "três", "quatro", "cinco", 
		"seis", "sete", "oito", "nove", null, "onze",
		"doze", "treze", "catorze", "quinze", "dezesseis",
		"dezessete", "dezoito", "dezenove"
	};
	private final String[] DEZENAS = {
		null, "dez", "vinte", "trinta", "quarenta", "cinquenta",
		"sessenta", "setenta", "oitenta", "noventa"
	};
	private final String[] CENTENAS = {
		null, "cem", "duzentos", "trezentos", "quatrocentos",
		"quinhentos", "seiscentos", "setecentos", "oitocentos",
		"novecentos"
	};
		
	public Ditador(){
		
	}
	
	public String numeroPorExtenso(int numero){
		
		
		if (numero <20 && numero!=10){	
			return NUMERO0A19SEM10[numero];
		}
		if(numero%10 == 0 && numero<91){
			return DEZENAS [numero/10];
		}
		if(numero%100 == 0 && numero<901){
			return CENTENAS[numero/100];
		}
		if(numero<100){
			return doisNumerosMenoresQueCem(numero);
		}
		return null;
	}

	private String doisNumerosMenoresQueCem(int numero) {
		return (DEZENAS[numero/10] + CONECTIVO+ NUMERO0A19SEM10[numero - (numero/10)*10 ]);
	}
}
