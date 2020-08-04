package br.com.caelum.contas.modelo;

public abstract class Conta implements Comparable<Conta> {

	private String titular;
	private int numero;
	private String agencia;
	protected double saldo;

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException(
					"Voc� tentou depositar" + " um valor negativo!");
		} else {
			this.saldo += valor;
		}
	}

	/* Validando valor negativo e saldo */
	public void saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException(
					"Voc� tentou sacar um valor negativo!");
		}
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException(valor);
		} else {
			this.saldo -= valor;
		}
	}

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	@Override
	public String toString() {
		return "Titular: " + titular + "\tAg�ncia: " + agencia
				+ "\tN� da conta: " + numero;
	}

	/*
	 * exerc�cio 3 - M�todo abstrato � o m�todo de uma classe abstrata que n�o
	 * possui implementa��o. Na classe abstrata, � definido o m�todo abstrato
	 * com palavra reservada abstract e sua assinatura. A implementa��o do mesmo
	 * � feita na classe filha, atrav�s de sobrescrita de m�todo.
	 */

	public abstract String getTipo();

	/*
	 * exerc�cio 7 - Sim, podemos chamar um m�todo abstrato de dentro de um
	 * outro m�todo da pr�pria classe. Implementa��o "TesteDaConta".
	 */
	public String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.titular;
		dados += "\nN�mero:	" + this.numero;
		dados += "\nAg�ncia: " + this.agencia;
		dados += "\nSaldo: R$ " + this.saldo;
		dados += "\nTipo: " + this.getTipo();
		return dados;
	}

	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}
}
