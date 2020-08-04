package br.com.caelum.contas.modelo;

import br.com.caelum.util.Data;

public class Conta {

	private String titular;
	private static int totalContas;
	private  int identificador ; // ---------------> Capitulo 5 Quest�o 5
	private int numero;
	private String agencia; // -------------> Capitulo 5 Quest�o 1
	private double saldo;
	Data data_abertura;
	
	Data dataMinhaConta = new Data(15, 3 , 2020);
	Data dataSuaConta = new Data(21, 7, 2015);

	// Criando os construtores
	
	public Conta(){
		
		totalContas = totalContas + 1;
		this.identificador = totalContas;
		
	}
	
	public Conta(int numero, String titular, String agencia, double saldo, Data data_abertura) {

		this.numero = numero;
		this.titular = titular;
		this.agencia = agencia;
		this.saldo = saldo;
		this.data_abertura = data_abertura;
	}

	
	

	// Criando os getters e setters

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

	public double getSaldo() {
		return saldo;
	}
	
	
	
	public void setData_abertura(Data data_abertura) {
		if(data_abertura.validaData()) {
		this.data_abertura = data_abertura;
		}
	}




	public int getIdentificador() {
		return identificador;
	}
	
	public int gettotalContas() {
		return totalContas;
	}
	


	// Criando os m�todos

	/*void saca(int valor) {

		this.saldo = this.saldo - valor;

	}*/
	
	
	/*String saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;  // COMO FAZ PRA RETORNAR UMA MENSAGEM DIZENDO QUE FOI OU NAO POSSIVEL REALIZAR O SAQUE (Se for boolean)???
			 return "V� sacoocu : " + valor;
		} else {
			return "Saldo insuficiente para realizar saque com esse valor!";
		}

	}*/
	
	public boolean saca (double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}

	/*void transfere(Conta destino, int valor) {
		this.saldo = this.saldo - valor;          ----------------> N�o consegui chamar o m�todo transfere na minha main.
		destino.saldo = destino.saldo + valor;
	}*/
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	 boolean transfere(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if(retirou == false) {
			return false;
		}
		
		else {
			destino.deposita(valor);
			return true;
		}
		
	}

	double calculaRendimento() {
		return this.saldo = this.saldo * 0.1;
	}

	public String recuperaDadosParaImpressao(Data data) {
		boolean validacao = data.validaData();
		if (validacao == false) { //---------------------> perguntar se � pra deixar a msg de erro
			
			return "O n�mero da conta �: " + this.numero + "\n" + "O titular da conta �: " + this.titular + "\n"
					+ "A ag�ncia �: " + this.agencia + "\n" + "A data de abertura da conta �: Data inv�lida"
					 + "\n" + "O saldo da conta �: " + this.saldo + "\n";
			
		}
		
		return "O n�mero da conta �: " + this.numero + "\n" + "O titular da conta �: " + this.titular + "\n"
				+ "A ag�ncia �: " + this.agencia + "\n" + "A data de abertura da conta �: "
				+ this.data_abertura.imprimeData() + "\n" + "O saldo da conta �: " + this.saldo + "\n";
	}
}
