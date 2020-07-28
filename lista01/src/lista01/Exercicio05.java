package lista01;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		
		int numeroInvertido = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int numero = scanner.nextInt();
		
		scanner.close();
		
		int aux = numero;
		
		while(aux != 0) {
			numeroInvertido = numeroInvertido * 10 + aux % 10;
			aux = aux / 10;
		}
		
		
		if(numero == numeroInvertido) {
			System.out.println(numero + " � um n�mero pal�ndromo");
		} else {
			System.out.println(numero + " n�o � um n�mero pal�ndromo");
		}
	}
}
