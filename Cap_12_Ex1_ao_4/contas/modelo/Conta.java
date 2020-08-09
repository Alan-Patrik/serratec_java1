package br.com.caelum.contas.modelo;

import br.com.caelum.util.Data;

//public class Conta {

// Exerc�cio 10.6.1- Fazer a class Conta ser abstract
public abstract class Conta {  

	//Exerc�cio 10.6.2
	
	//Pode. Utiliza-se para economizar um pouco c�digo e ganhar polimorfismo para criar 
	//m�todos mais gen�ricos, que se encaixem a diversos objetos.
	
	int numero;
	private String titular;
	//private double saldo;
	protected double saldo;
	private String agencia;
	private static int totaldecontas;
	Data dataDeAbertura = new Data(3,8,2020);
	
	public Conta(){
	}
	
	public Conta(String titular, String agencia, double saldo, int numero){
		this.titular = titular;
		this.agencia = agencia;
		this.saldo = saldo;
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public String getAgencia() {
		return agencia;
	}


	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	
	public double getSaldo() {
		return this.saldo;
	}

	public void saca(double quantidade) {	
		if (this.saldo >= quantidade) {
			this.saldo = this.saldo - quantidade;
			System.out.println("saque realizado");
		} else {
			System.out.println("O saldo insuficiente para o saque desejado");
		}
	}

	
	// Exerc�cio 12.11.1
	/*public void deposita(double quantidade) {
		if (quantidade < 0) {
			throw new IllegalArgumentException(); 
		} else {
		   this.saldo = this.saldo + quantidade;
		}
	}*/
	
	//Exerc�cio 12.11.2 - Deu erro , na interface gr�fica retornou a mensagem "deu pau".
	
	
	// Exerc�cio 12.11.3 - Deu erro e apareceu a mensagem  que colocamos na exception " Voc� tentou...negativo".
		public void deposita(double quantidade) {
			if (quantidade < 0) {
				throw new IllegalArgumentException("Voc� tentou depositar um valor negativo."); 
			} else {
			   this.saldo = this.saldo + quantidade;
			}
		} 
		
	
	
	void transfere(Conta destino, double valor) {
		if (this.saldo >= valor) {
			
			this.saca(valor);
			destino.deposita(valor); 
			
			System.out.println("O valor tranferido da conta de " + this.titular + " foi de " + valor);
			System.out.println("O saldo de " + destino.titular + " � agora de: " + destino.saldo);
		} else {
			System.out.println("N�o h� saldo o suficiente para transferir este valor");
		}
	}
	
	public String toString() {
		return "Conta [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + "]";
	}


	public void setSaldo(int saldo) {
		// TODO Auto-generated method stub
		this.saldo = saldo;		
	}
	
	// Exerc�cio 10.6.3- Colocando o m�todo abstract
	
		/*public String getTipo()
		{
			return "Conta";
		}*/
	
	public abstract String getTipo();
	

		public void transfere (double valorDigitado, Conta c1)
		{
			this.saca(valorDigitado);
			c1.deposita(valorDigitado);
		}




}


