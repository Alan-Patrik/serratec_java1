
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("N�mero de entrada �:");
		int numero = scan.nextInt();
		int Result = 0;
		System.out.println("Os n�mero �mpares s�o: ");
		for (int i = 0; i <= numero * 2; i++) {
			if (i % 2 != 0) {
				Result = Result + i;
				System.out.println(i);
			}
		}
		System.out.print("A soma dos n�meros �mpares naturais at� " + numero + " � : " + Result);
		scan.close();
	}
}
