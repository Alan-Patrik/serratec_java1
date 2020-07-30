import java.util.Scanner;

public class Conta_2 {
	int numero;
	String titular;
	String agencia;
	String data_abertura;
	double saldo, deposito;
	Scanner scan = new Scanner(System.in);

	void saca(double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}

	void deposita(double valor) {
		double novoSaldo = this.saldo + valor;
		this.saldo = novoSaldo;

	}

	void rendimento() {
		double novoSaldo = this.saldo * 0.1;
		this.saldo = novoSaldo;
	}

	String impressao() {
		String dados = "Titular: " + this.titular;
		dados += "\nNumero: " + this.numero;
		dados += "\nAg�ncia: " + this.agencia;
		dados += "\nData-Abertura: " + this.data_abertura;
		dados += "\nSaldo: R$" + this.saldo;
		return dados;
	}

	public void escolha(String op, Conta_2 conta) {

		switch (op) {
		case "Saque":
			System.out.println("Qual o valor do saque? ");
			double saque = scan.nextInt();

			if (saque <= conta.saldo) {
				conta.saca(saque);
				System.out.println("O seu saldo ap�s o saque � de: R$" + conta.saldo);

			} else {
				System.out.println("O valor do saque � maior que o dispon�vel no saldo.");
			}
			break;

		case "Deposito":
			System.out.println("Qual o valor do deposito? ");
			deposito = scan.nextInt();
			conta.deposita(deposito);

			System.out.println("O seu saldo ap�s o deposito � de: R$" + conta.saldo);
			break;

		case "Rendimento":
			conta.rendimento();
			System.out.println("O seu rendimento mensal � de: R$" + conta.saldo);

		}

	}
}
