public class Conta {
	private int numero;
	private String nomeTitular;
	private String agencia;
	private double saldo;
	private Data dataDeAbertura;
	public static int identificador=0;
	
	Conta(){	
		identificador += +1;
	}
	Conta (int numero, String titular, String agencia){
		this.numero = numero;
		this.nomeTitular = titular;
		this.agencia = agencia;
		identificador += +1;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNomeTitular(String outroNome) {
		this.nomeTitular = outroNome;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}	
	
	public String getAgencia() {
		return agencia;
	}
	
	public double getRendimento() {
		this.saldo = this.saldo*0.1;
		return this.saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double novoSaldo) {
		if(novoSaldo < 0) {
			System.out.println("Valor inv�lido para dep�sito, utilize a fun��o saca neste caso.");
		}
		else if(novoSaldo == 0) {
			System.out.println("Valor nulo depositado, nenhuma mudan�a foi realizada.");
		}
		else {
		this.saldo = this.saldo + novoSaldo;
		}
	}
	
	public void saca(double novoSaldo) {
		if(novoSaldo > this.saldo) {
			System.out.println("O saque � maior do que o saldo dispon�vel, nenhuma altera��o foi realizada.");
		}
		else if(novoSaldo == 0) {
			System.out.println("N�o � poss�vel sacar um valor nulo, nenhuma altera��o foi realizada.");
		}
		else {
		this.saldo = this.saldo - novoSaldo;
		}
	}
	
	public static int getIdentificador() {
		 return identificador;
	 }

	public String getDataDeAbertura() {
		return this.dataDeAbertura.dataFormatada();
	}

	String recuperaDados() {
		 String dados = "Titular: " +this.nomeTitular;
		 dados += "\nN�mero: " + this.numero;
		 dados += "\nAg�ncia: " + this.agencia;
		 dados += "\nSaldo atual: " + this.saldo;
		 dados += "\nData: " + this.dataDeAbertura.dataFormatada();
	
	return dados;
	}
}




