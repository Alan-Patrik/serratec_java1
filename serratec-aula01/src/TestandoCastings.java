
public class TestandoCastings {

	public static void main(String[] args) {
		
		int num1 = 3;
		int num2 = 2;
		double result = (double) num1 / num2;
		
		char a = 'a';
		char z = 'z';
		
		// cast	� impl�cito	e autom�tico
		int codeA =  a;
		int codeZ =  z;
		
		/*Java n�o trabalha com Ascii e sim com Unicode. N�o � problema na maior
		parte dos casos pois os 255 primeiros caracteres unicode correspondem 
		aos caracteres ascii.*/
		
		int soma = a + z;
		
		System.out.println(result);
		System.out.println("Caracter a = " + codeA + ", " + "Caracter z = " +
		 codeZ + "\n" + 
		 codeA + " + " + codeZ + " = " + soma);
	}

}
