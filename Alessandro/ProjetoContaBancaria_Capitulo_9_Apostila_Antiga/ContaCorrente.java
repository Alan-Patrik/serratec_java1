//Exerc�cio - 3.

public class ContaCorrente extends Conta {

	public void atualiza(double taxa) { // Exerc�cio - 5. Creio que n�o.
		 this.saldo = this.saldo * (taxa *2);
	}
	
	public void deposita(double valor) {
		this.saldo = valor - 0.10;
	}

}
