import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int num, res = 0, inv = 0, num2;

		System.out.print("Digite um n�mero: ");
		num = leia.nextInt();

		for (num2 = num; num2 > 0; num2 = num2 / 10) {

			res = num2 % 10;
			inv = inv * 10 + res;
		}

		if (num == inv) {
			System.out.println("� pal�ndromo");
		} else {
			System.out.println("N�o � pal�ndromo");
		}

		leia.close();
	}
}
