
   import java.util.Scanner;

public class Exec3_natural_impar_soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int n, i, nimpar ,soma;
		
		System.out.println(" Digite a quantidade de n�mero impares que deseja ver soma : " ) ;
		 n = scanner.nextInt();
		 
		 System.out.println("Os n�meros �mpares s�o: ");
		 
		 nimpar = 1;
		 soma = 1;
		 
		 System.out.println(nimpar);
		 
		 
		 for (i= 1; i<n; i++)
		 {	 
			 	nimpar = nimpar + 2	;
			 	System.out.println(nimpar);
			 	soma = soma + nimpar;			 
		 }

		 System.out.println(" A soma dos �mpares naturais at� " + n +" � : " + soma );
	
		 scanner.close();
	}
}
