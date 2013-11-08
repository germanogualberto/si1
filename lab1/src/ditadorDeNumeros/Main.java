package ditadorDeNumeros;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
	
		//Scanner ler = new Scanner(System.in);
		int numero;
		Ditador d = new Ditador();
		String opcao;
		boolean continuar = true;
		
		while(continuar){
			System.out.println("Informe um número: ");
			try{
				Scanner ler = new Scanner(System.in);
				numero = ler.nextInt();
				if (numero<0){
					System.out.println("Informe um número positivo!");
				}else{
					System.out.println( d.numeroPorExtenso(numero) );
				}
			}catch(InputMismatchException e){
				System.out.println("Apenas numeros!");
			}
			while (true){
				System.out.println("Ler outro número? s/n");
				Scanner ler2 = new Scanner(System.in);
				opcao = ler2.nextLine();
				if (opcao.equals("n")){
					continuar = false;
					break;
				} else if (opcao.equals("s")){
					break;
				}else{
					System.out.println("Informe uma opção válida!");
				}
			}
		}
	}
}
