package caelumPage65;

public class Conta {

	String titular;
	int numero;
	String agencia;
	double saldo;
	Data dataAbertura; //Modificado no exerc�cio 7

	void saque(double valor) {
		if (saldo >= valor) {
			this.saldo += -valor;
		} else {
			System.out.print("Saque indispon�vel!");
		}
	}

	void deposito(double valor) {
		this.saldo += valor;
	}

	double calcRendimento() {
		if (this.saldo != 0) {
			return this.saldo * 0.1;
		} else {
			System.out.print("N�o possui saldo");
			return 0;
		}
	}

	String extratoBancario() {
		return "Informa��es sobre a conta" 
				+ "\nTitular: " + this.titular 
				+ "\nN�mero: " + this.numero
				+ "\nAgencia: " + this.agencia 
				+ "\nSaldo: R$ " + this.saldo 
				+ "\nData de Abertura: " + this.dataAbertura 
				+ "\nRendimento Mensal: R$ " + calcRendimento()
				+ "\nCliente desde: " + this.dataAbertura.retornarData()
				+ "\n\n";
	}
}
