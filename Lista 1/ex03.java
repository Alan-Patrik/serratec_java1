package listaJava;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {

		Scanner saida = new Scanner(System.in);
		System.out.print("N�mero de entrada: ");
		int numero = saida.nextInt();
		int resultado = 0;

		System.out.println("Os n�meros �mpares s�o:");
		for (int i = 0; i <= numero * 2; i++) {
			if (i % 2 != 0) {
				resultado += i;
				System.out.println(i);
			}
		}

		System.out.print("A soma dos n�meros �mpares naturais at� " + numero + " �: " + resultado);

		saida.close();
	}
}
