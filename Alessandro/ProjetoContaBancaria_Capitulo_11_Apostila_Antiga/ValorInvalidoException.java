// Exerc�cio - 5.

public class ValorInvalidoException extends Exception { // Exerc�cio - 8. Ocorreu um erro.

	public ValorInvalidoException(double valor){
		super ("N�o posso retirar valor negativo: " + valor); // Exerc�cio - 7.
	}
	
	// Exerc�cio - 7.
	
	/*public String getMessage() {  
		return "N�o posso retirar valor negativo: " + valor;
	}*/

}
