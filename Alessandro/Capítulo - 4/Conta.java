/*
 * Exerc�cio - 1. Fiz a modelagem no papel, de acordo com o solicitado. Ap�s, iniciei
 * a constru��o das classes Conta e Main.
 */

// Exerc�cio - 2. Constru��o das classes Conta e Main.

public class Conta {

	String titular;
	int numero;
	String agencia;
	double saldo = 1234;
	Data dataAbertura; // Exerc�cio - 7. Foi feita a modifica��o da vari�vel "String" para "Data".

	// Exerc�cio - 8. Feita a verifica��o pedida.

	public void saca(double valor) {
		if (saldo >= valor) {
			this.saldo = saldo - valor;
		} 
		else {
			System.out.println("Saldo insuficiente para saque.");
		}
	}

	public void deposita(double valor) {
		this.saldo = saldo + valor;
	}

	public double calculaRendimento() {
		if (this.saldo > 0) {
			return this.saldo * 0.1;
		} 
		else {
			System.out.println("Sua conta n�o possui saldo para receber rendimentos.");
			return 1;
		}

	}

	// Exerc�cio - 3.

	public String recuperaDadosParaImpressao() {
		String dados = "Extrato da conta n�: " + this.numero +
					   "\nTitular: " + this.titular +
					   "\nAg�ncia: " + this.agencia +
					   "\nSaldo: " + this.saldo + 
					   "\nRendimentos : " + this.calculaRendimento() +
					   "\nData de abertura da conta: " + this.dataAbertura.retornaData() + // Exerc�cio - 9.
					   "\nDia: " + this.dataAbertura.dia + // Exerc�cio - 7. Montagem da estrutura dia, m�s e ano.
					   "\nMes: " + this.dataAbertura.mes + 
					   "\nAno: " + this.dataAbertura.ano;
					   return dados;

	/* Exerc�cio - 7. Se chamarmos o m�todo "recuperaDadosParaImpressao()" antes de
	 * atribuirmos uma data para este, ocorrer� o aparecimento desta informa��o: Data@15db9742
	 */
					   
	}

}
