
 import java.util.Scanner;

public class Exec5_Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int n,aux, aux2 = 0;
		
		System.out.println(" Digite um n�mero : " ) ;
		 n = scanner.nextInt();
		 
		 aux = n ;
		 
		 while ( aux !=0)
		 {
			 aux2 = (aux2 * 10 + aux % 10);
			 aux = aux/10;
		 }
		 if (aux2 == n)
		 {
			 System.out.println( n + " " + " � um pal�ndromo. ") ;
		 }
		 
		 else
		 {
			 System.out.println( n + " " + "  n�o � um pal�ndromo. "); 
		 }	 
		 scanner.close();
				
	}

}
