// Exerc�cio - 2.


public class TestaTributavel {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
		System.out.println(t.getSaldo()); 
		
		/*
		 * Exerc�cio - 2. Tente, agora, chamar o m�todo getSaldo atrav�s da refer�ncia t, 
		 * o que ocorre?
		 * Ocorre um erro.
		 * Por qu�?
		 * Porque o m�todo getSaldo n�o foi definido na classe Tributavel. 
		 */
		
		
		System.out.println(t.getSaldo());
	}

}
