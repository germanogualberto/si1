package ditadorDeNumeros;

public class Ditador {

	private final String CONECTIVO = " e "; 
	private final String[] NUMERO0A19 = {
		"zero", "um", "dois", "três", "quatro", "cinco", 
		"seis", "sete", "oito", "nove", "dez", "onze",
		"doze", "treze", "catorze", "quinze", "dezesseis",
		"dezessete", "dezoito", "dezenove"
	};
	private final String[] DEZENAS = {
		"", "", "vinte", "trinta", "quarenta", "cinquenta",
		"sessenta", "setenta", "oitenta", "noventa"
	};
	private final String[] CENTENAS = {
		"", "cem", "duzentos", "trezentos", "quatrocentos",
		"quinhentos", "seiscentos", "setecentos", "oitocentos",
		"novecentos"
	};
		
	public Ditador(){
		
	}
	
	public String numeroPorExtenso(int numero){
		
		
		if (numero <20){	
			return NUMERO0A19[numero];
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
		if(numero < 1000){
			return menoresQueMil(numero);
		}
		return null;
	}

	private String menoresQueMil(int numero) {
		if (numero/100 == 1){
			return "cento" + CONECTIVO + doisNumerosMenoresQueCem(numero-(numero/100)*100);
		}
		return CENTENAS[numero/100] + CONECTIVO + doisNumerosMenoresQueCem(numero-(numero/100)*100);
	}

	private String doisNumerosMenoresQueCem(int numero) {
		if (numero <20){
			return NUMERO0A19[numero];
		}
		if (numero%10 == 0){
			return DEZENAS[numero/10];
		}
		return (DEZENAS[numero/10] + CONECTIVO+ NUMERO0A19[numero - (numero/10)*10 ]);
	}
}
