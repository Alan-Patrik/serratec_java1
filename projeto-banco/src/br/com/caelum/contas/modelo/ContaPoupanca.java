package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta {

	/*
	 * exerc�cio 5 - N�o, uma classe filha � obrigada a implementar os m�todos
	 * abstratos da classe pai.
	 */

	/*
	 * exerc�cio 6 - Para obrigar a implementa��o do mesmo na classe filha,
	 * atrav�s de sobrescrita de m�todo. O c�digo continua funcionado, pois o
	 * m�todo ir� pertencer apenas a classe filha
	 */

	public String getTipo() {
		return "Conta Poupan�a";
	}

}
