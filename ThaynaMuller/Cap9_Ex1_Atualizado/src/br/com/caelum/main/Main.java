package br.com.caelum.main;
import br.com.caelum.contas.*;
//Exercicio 4:

public class Main {

	public static void main(String[] args) {
		
		/* Se alterarmos de ContaPoupanca e ContaCorrente para somente Conta o c�digo compilar� sem erros pois Conta
        � a classe m�e e segundo o Polimorfismo apenas o modo de nos referenciar � estas classes mudar�.*/
		
		Conta c = new Conta();                          
		Conta cc = new ContaCorrente();               
		Conta cp = new ContaPoupanca();
		
		c.deposita(500.00);
		cc.deposita(800.00);
		cp.deposita(900.00);
		
		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);
		
		System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo()); //Exercicio 4: Ap�s obtermos o getSaldo() de cada conta tivemos o retorno de cada deposito j� atualizado.
		
		//Exercicio 7:
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);

		System.out.println("Saldo total : R$ " +adc.getSaldoTotal());
		
	}

}
