package lista01;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		int soma = 0;
		int contador = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int numero = scanner.nextInt();
		
		scanner.close();
		
		System.out.println("\nOs n�meros �mpares s�o: ");
		
		for(int i = 1; contador < numero; i++) {
			if(i % 2 != 0 && contador <= numero) {
				System.out.println(i);
				soma += i;
				contador++;
			}
		}
		
		System.out.println("A soma dos n�meros �mpares naturais at� " + numero +
				" �: " + soma);
		
	}
	
	
}
