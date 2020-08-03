/*
/* Exerc�cio - 1. Coloquei o modificador de visibilidade "private" nos atributos e m�todos.
/* Depois os retirei dos m�todos. Ap�s a cria��o, n�o foi poss�vel a leitura ou modifica��o
/* dos dados privdos.
 */


/* Exerc�cio - 2. Coloquei "getters" e "setters" em todos os objetos, apesar de alguns n�o
 * precisarem. Fiz para poder treinar e observar o comportamento.
 */

public class Conta {

	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private Data dataAbertura;

	/*
	 * Exerc�cio - 5. Atributos adicionados. N�o acho que seja necess�rio um "set",
	 * j� que n�o houve necessidade de mudan�as na Main.java.
	 */

	private int idUsuario;
	private static int GeraId;

	public int getId() {
		return this.idUsuario;
	}

	/*
	 * Exerc�cio - 4. O construtor sem argumento, torna opcional a coloca��o de um
	 * argumento dentro da Main.java.
	 * Com a coloca��o de um argumento dentro do construtor,
	 * tornou-se necess�rio a coloca��o de uma "String" na Main.java, sob pena de
	 * erro.
	 */

	public Conta() {
		Conta.GeraId = Conta.GeraId + 1;
		this.idUsuario = Conta.GeraId;
	}

	public Conta(String titular) {
		Conta.GeraId = Conta.GeraId + 1;
		this.idUsuario = Conta.GeraId;
		this.titular = titular;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String nome) {
		this.titular = nome;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Data getDataAbertura() {
		return this.dataAbertura;
	}

	public void setDataAbertura(Data dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public void saca(double valor) {
		if (saldo >= valor) {
			this.saldo = saldo - valor;
		} else {
			System.out.println("Saldo insuficiente para saque.");
		}
	}

	public void deposita(double valor) {
		this.saldo = saldo + valor;
	}

	public double calculaRendimento() {
		if (this.saldo > 0) {
			return this.saldo * 0.1;
		} else {
			System.out.println("Sua conta n�o possui saldo para receber rendimentos.");
			return 0;
		}

	}

	/*
	 * public String recuperaDadosParaImpressao() { return "Extrato da conta n�: " +
	 * this.numero + "\nTitular: " + this.titular + "\nAg�ncia: " + this.agencia +
	 * "\nSaldo: " + this.saldo + "\nRendimentos : " + this.calculaRendimento() +
	 * "\nData de abertura da conta: " + this.dataAbertura.retornaData();
	 * 
	 * }
	 */

}
