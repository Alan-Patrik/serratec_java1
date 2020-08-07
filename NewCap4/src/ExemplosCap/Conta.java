package ExemplosCap;

public class Conta {
	int numero;
	double saldo;
	double limite;
	Cliente titular = new Cliente();

	/*
	 * void saca(double quantidade){ double novoSaldo = this.saldo - quantidade;
	 * this.saldo = novoSaldo; } O m�todo saca sofreu altera��o pois � necess�rio
	 * devolver algum tipo de informa��o passando para boolean
	 */

	boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}

	void deposita(double quantidade) {
		this.saldo += quantidade;
	}

	/*
	 * void transfere(Conta destino, double valor) { this.saldo = this.saldo -
	 * valor; destino.saldo = destino.saldo + valor; } Metodo sem verifica��o do
	 * valor necess�rio, para a transferencia
	 */

	boolean transfere(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if (retirou == false) {
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}
	}
} 
