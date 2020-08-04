package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ContaCorrente;

/* 
 * Para instanciar Conta remova a anota��o abstract da classe Conta e do m�todo 
 * getTipo(), j� que uma classe abstrata n�o pode ser instanciada. 
 */
public class TesteDaConta {

	public static void main(String[] args) {
//		Conta conta = new Conta();
//		conta.deposita(150.0);
//		conta.saca(50.0);
//
//		System.out.println("Saldo da conta: " + conta.getSaldo());

		ContaCorrente conta = new ContaCorrente();
		conta.setTitular("Renato Viana");
		conta.setNumero(123);
		conta.setAgencia("32145-5");
		conta.deposita(200.0);
		System.out.println(conta.recuperaDadosParaImpressao());
	}

}
