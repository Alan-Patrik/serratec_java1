import java.util.Scanner;

public class lista1_ex4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num;

		System.out.print("Digite um n�mero: ");
		num = scan.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}

			System.out.println(" ");
		}

	}

}
