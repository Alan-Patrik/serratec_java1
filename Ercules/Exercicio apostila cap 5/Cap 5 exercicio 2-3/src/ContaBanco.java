
public class ContaBanco {

	private String nome;
	private int numero;
	private String agencia;
	private double saldo;
	private Data data = new Data();

	ContaBanco(String nome, int numero, String agencia, int dia, int mes, int ano) {
		this.nome = nome;
		this.numero = numero;
		this.agencia = agencia;
		data.setDia(dia);
		data.setMes(mes);
		data.setAno(ano);
	}
	
	String getAgencia() {
		return this.agencia;
	}
	
	String getNome() {
		return this.nome;
	}
	
	int getNumero() {
		return this.numero;
	}
	
	double getSaldo() {
		return this.saldo;
	}

	void sacar(double valor) {

		if (valor <= this.saldo) {
			this.saldo = this.saldo - valor;
			System.out.println("Seu saldo: R$ " + this.saldo);
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}

	void depositar(double valor) {

		this.saldo = this.saldo + valor;
		System.out.println("Seu saldo: R$ " + this.saldo);
	}

	void calculaRendimento(double saldo) {

		this.saldo = this.saldo * 1.1;
		System.out.println("Seu saldo com o rendimento: R$ " + this.saldo);
	}

	String recuperarDados() {
		String dados = "Nome do titular: " + this.nome;
		dados += "\nN�mero da ag�ncia: " + this.agencia;
		dados += "\nN�mero da conta: " + this.numero;
		dados += "\n" + data.formataData();
		dados += "\nSaldo dispon�vel: " + this.saldo;
		return dados;
	}
}
