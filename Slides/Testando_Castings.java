// 1  - Declare duas vari�veis do tipo int e realize sua soma. 
// Em seguida, realize o casting destes dois inteiros para double para realizar sua divis�o. 
// 2 - Declare dois caracteres : �A� e �Z�, 
// depois realize sua soma e armazene em uma vari�vel do tipo inteiro. 
// Qual � o resultado apresentado? Por que voc� acha que esse foi o resultado apresentado?

public class Testando_Castings {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		int c = a + b;
		double d = (double) a / (double) b;
		
		System.out.println(c);
		System.out.println(d);
		
		char Z = 'Z';
		char X = 'X';
		int w = 0;
	
		w = Z + X;
		
		System.out.println(w); 
		// Ele esta somando o valor que as caracteres 'Z' e 'X' possuem, por isso o resultado estranho.
		
	    
		
		
	}

}
