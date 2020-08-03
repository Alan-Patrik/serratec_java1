// Exerc�cio - 2. Constru��o das classes Conta e Main.

public class Main {

	public static void main(String[] args) {

		Data dataDeAbertura = new Data();
		dataDeAbertura.dia = 20;
		dataDeAbertura.mes = 06;
		dataDeAbertura.ano = 2006;
		
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		Conta c3 = new Conta();
		c1.titular = "Alessandro";
		c1.numero = 123;
		c1.agencia = "47896-9";
		c1.saldo = 1000.00;
		c1.dataAbertura = dataDeAbertura; // Exerc�cio - 6.

		System.out.println("Data de abertura da conta: " + dataDeAbertura.dia + "/" + dataDeAbertura.mes + "/"
				+ dataDeAbertura.ano); // Exerc�cio - 6.

		c1.deposita(328.14);
		System.out.println("Seu saldo �: " + c1.saldo);

		c1.saca(61.52);
		System.out.println("Seu novo saldo �: " + c1.saldo);
		System.out.println("Rendimento(s): " + c1.calculaRendimento());
		
		System.out.println(c1.recuperaDadosParaImpressao()); // Exerc�cio - 3.
		
		/*
		 * Exerc�cio - 4. Apesar das duas contas possu�rem dados id�nticos,
		 * elas n�o s�o iguais.
		 */
		
		c2.titular = "Alessandro";
		c2.numero = 123;
		c2.agencia = "47896-9";
		c2.saldo = 1000.00;
		c2.dataAbertura = dataDeAbertura;
		
		c3.titular = "Alessandro";
		c3.numero = 123;
		c3.agencia = "47896-9";
		c3.saldo = 1000.00;
		c3.dataAbertura = dataDeAbertura;
		
			if (c2 == c3) {
				System.out.println("iguais");
			}
			else {
				System.out.println("desiguais");
			}
		
			/*
			 *  Exerc�cio - 5. Ao serem colocadas fora da estrutura condicional as refer�ncias
			 *  (c2 = c3), o que ocorre � que "c2" recebe "c3" e com isto, quando submetidas
			 *  a estrutura condicional, esta as reconhece como iguais.
			 */
	}
}
