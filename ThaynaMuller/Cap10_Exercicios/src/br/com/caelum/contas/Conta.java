package br.com.caelum.contas;

public abstract class Conta {
	
	protected double saldo;

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	//Transformando o m�todo atualiza em abstrato():
	public abstract void atualiza(double taxa);

}

/* Se apagarmos o m�todo atualiza() em Conta isso n�o afetar� as contas filhas. Mesmo n�o retornando um valor o m�todo atualiza() 
 * deve existir para que n�o seja preciso o reescrever em todas as contas filhas uma vez que, tendo na conta m�e este m�todo ser�
 * herdado por todas elas.
 */


