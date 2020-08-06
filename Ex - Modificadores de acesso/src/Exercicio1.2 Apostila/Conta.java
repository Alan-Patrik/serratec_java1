
public class Conta {

	private double saldo;	
	private String titular;
	
	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	void deposita(double valor) {
		if (valor <= 0) {
			System.out.println("N�o foi poss�vel realizar o dep�sito! Verifique o valor depositado!");
		} else {
			double novoSaldo = this.saldo + valor;
			this.saldo = novoSaldo;

		}

	}

}
