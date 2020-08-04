package br.com.caelum.main;
import br.com.caelum.contas.*;

public class Main {

	public static void main(String[] args) {
			
		/*Ap�s definirmos a classe Conta como abstrata n�o poderemos mais instanciar ela.*/   
			          
			Conta cc = new ContaCorrente();  
			Conta cp = new ContaPoupanca();
			
		/*Devemos ser mais especificos ao criar um conta dando a esta uma especialidade , logo ter uma Conta geral s� nos sera util 
		  para generalizar aqueles metodos e atributos que ser�o comuns as contas filhas*/	
		
			
			cc.deposita(800.00);
			cp.deposita(900.00);
			
			cc.atualiza(0.01);
			cp.atualiza(0.01);
			
			System.out.println(cc.getSaldo());
			System.out.println(cp.getSaldo()); 
			
						
			AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

			adc.roda(cc);
			adc.roda(cp);

			System.out.println("Saldo total : R$ " +adc.getSaldoTotal());
			
		}
	}


