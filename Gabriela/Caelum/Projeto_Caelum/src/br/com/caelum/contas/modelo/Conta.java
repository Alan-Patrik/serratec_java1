package br.com.caelum.contas.modelo;

import br.com.caelum.exceptions.SaldoInsuficienteException;
import br.com.caelum.util.Data;

public class Conta {

	private String titular;
	private static int totalContas;
	private int identificador;
	private int numero;
	private int agencia;
	protected double saldo;
	protected String tipo;
	Data data_abertura;

	// Criando os construtores

	public Conta() {

		totalContas = totalContas + 1;
		this.identificador = totalContas;

	}

	public Conta(int numero, String titular, int agencia, double saldo, Data data_abertura) {

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

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int i) {
		this.agencia = i;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setData_abertura(Data data_abertura) {
		if (data_abertura.validaData()) {
			this.data_abertura = data_abertura;
		}
	}

	public int getIdentificador() {
		return identificador;
	}

	public int gettotalContas() {
		return totalContas;
	}

	//public abstract String getTipo();

	// Criando os m�todos

	@Override
	public String toString() {
		return "Conta [titular=" + titular + ", identificador=" + identificador + ", numero=" + numero + ", agencia="
				+ agencia + ", saldo=" + saldo + ", tipo=" + tipo + ", data_abertura=" + data_abertura + "]";
	}

	public void saca(double valor) throws SaldoInsuficienteException {
		if (valor < 0) {
			throw new IllegalArgumentException("Voc� tentou sacar um valor negativo");

		}
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException(valor);
		} else {
			this.saldo = this.saldo - valor;
		}
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Voc� tentou depositar um valor negativo");
		} else {
			this.saldo += valor;
		}
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);

	}

	double calculaRendimento() {
		return this.saldo = this.saldo * 0.1;
	}

	public String recuperaDadosParaImpressao(Data data) {
		boolean validacao = data.validaData();
		if (validacao == false) {

			return "O n�mero da conta �: " + this.numero + "\n" + "O titular da conta �: " + this.titular + "\n"
					+ "A ag�ncia �: " + this.agencia + "\n" + "A data de abertura da conta �: Data inv�lida" + "\n"
					+ "O saldo da conta �: " + this.saldo + "\n";

		}

		return "O n�mero da conta �: " + this.numero + "\n" + "O titular da conta �: " + this.titular + "\n"
				+ "A ag�ncia �: " + this.agencia + "\n" + "A data de abertura da conta �: "
				+ this.data_abertura.imprimeData() + "\n" + "O saldo da conta �: " + this.saldo + "\n";
	}
}
