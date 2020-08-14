public class Conta {

	int numero;
	double saldo;
	String titular;

	void saca(double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;

		System.out.println("Meu novo saldo ap�s o saque � : " + this.saldo);

	}

	void transfere(Conta remetente, Conta destino, double valor) {
		if (remetente.saldo >= valor) {
			remetente.saldo = remetente.saldo - valor;
			destino.saldo = destino.saldo + valor;

			System.out.println("Meu novo saldo ap�s o saque � : " + remetente.saldo);

		} else {
			System.out.println("N�o h� saldo o suficiente para transferir este valor");

		}
	}

	void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Voc� tentou depositar"	+	
											   " um	valor negativo");
		} else {
			this.saldo += valor;								
		}								
	}
}
