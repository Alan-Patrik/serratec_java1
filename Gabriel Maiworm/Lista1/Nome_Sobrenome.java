import java.util.Scanner;

public class Nome_Sobrenome {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual � o seu nome? ");
		String nome = scan.next();
		
		System.out.println("Qual � o seu sobrenome? ");
		String sobrenome = scan.next();
		
		System.out.println("O seu nome completo � "+ nome +" "+ sobrenome);
		
		scan.close();
	}

}
