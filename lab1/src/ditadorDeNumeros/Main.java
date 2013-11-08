package ditadorDeNumeros;

import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		int numero;
		Ditador d = new Ditador();
		
		System.out.println("Informe um número: ");
		numero = ler.nextInt();
		if (numero<0){
			System.out.println("Informe um número positivo!");
		}else{
			System.out.println( d.numeroPorExtenso(numero) );
		}
		
	}
}
