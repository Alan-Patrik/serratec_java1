import java.util.Scanner;

public class Lista1Exercicio3_FormaCorreta {

	public static void main(String[] args) {

		int num, soma = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("N�mero de entrada � : ");

		num = scan.nextInt();

		for (int i = 0; i < num * 2; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
				soma = soma + i;
			}

		}
		System.out.println("A soma dos n�meros �mpares naturais at� " + num + " � : " + soma);

		scan.close();

	}

}