//Exerc�cio - 3.

public class ContaCorrente extends Conta {

	public void atualiza(double taxa) { // Exerc�cio - 8.
		 super.atualiza(taxa *2);
	}
	
	public void deposita(double valor) {
		this.saldo = valor - 0.10;
	}

}
