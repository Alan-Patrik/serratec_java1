
public class Conta {

	String titular;
	int numero;
	String agencia;
	double saldo;
	Data data_abertura;

	void saca(int valor) {

		this.saldo = this.saldo - valor;
	}

	void deposita(int valor) {

		this.saldo = this.saldo + valor;
	}

	double calculaRendimento() {

		return this.saldo = this.saldo * 0.1;
	}

	String recuperaDadosParaImpressao() {

		return "O n�mero da conta �: " + this.numero + "\n" + "O titular da conta �: " + this.titular + "\n"
				+ "A ag�ncia �: " + this.agencia + "\n" + "A data de abertura da conta �: "
				+ this.data_abertura.imprimeData() + "\n" + "O saldo da conta �: " + this.saldo + "\n";
	}
}
