import java.util.Scanner;

public class Lista_Raul_exercicio3 
{
	public static void main(String[] args) 
	{
		int res = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("N�mero de entrada: ");
		int num = scan.nextInt();
		
		System.out.println("Os n�meros �mpares s�o: ");
		
		for(int i = 0; i <= num * 2; i++)
		{
			if(i % 2 != 0)
			{
				res = res + i;
				System.out.println(i);
			}
		}
		scan.close();
		
		System.out.print("A soma dos n�meros �mpares naturais at� o " + num + "� �: " + res);
	}

}
