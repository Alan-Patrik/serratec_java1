/*
 * Exerc�cio - 3. Ao passar o m�todo "atualiza" da classe m�e para "abstract", a classe filha
 * apresentou um erro, no qual h� a informa��o de que n�o � poss�vel invocar
 * o m�todo "abstract" diretamente do m�todo "atualiza".
 */

public class ContaPoupanca extends Conta {

	public void atualiza(double taxa) { // Exerc�cio - 4.
		this.saldo = this.saldo * (taxa * 3);
	}

}
