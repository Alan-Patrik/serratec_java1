package Exerc�ciosRaul;

import java.util.Scanner;

public class Exercicio5Raul {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num, resto, aux;
		int invertido = 0 ;
		
		System.out.println("Digite um n�mero : ");
		num  = scan.nextInt();
		aux = num;
		while(aux != 0) {
			resto = aux % 10;
			invertido = (invertido + resto) * 10;
			aux = aux / 10;
		}
		invertido = invertido / 10;
		if (num == invertido) {
			System.out.println(num+" � um n�mero pal�ndromo.");
		}else {
			System.out.println(num+" n�o � um n�mero pal�ndromo.");
		}
		scan.close();	
	}

}
