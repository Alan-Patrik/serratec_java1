
public class ContaBanco {

	String nome;
	int numero;
	String agencia;
	double saldo;
	Data dataAbertura = new Data();

	
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
		
		this.saldo = this.saldo*1.1;
		System.out.println("Seu saldo com o rendimento: R$ " + this.saldo);
	}
	
	String recuperarDados() {
		String dados = "Nome do titular: " + this.nome;
		dados += "\nN�mero da ag�ncia: " + this.agencia;
		dados += "\nN�mero da conta: " + this.numero;
		dados += "\nData de abertura: " + this.dataAbertura.dia + "/" + this.dataAbertura.mes + "/" + this.dataAbertura.ano;
		dados += "\nSaldo dispon�vel: " + this.saldo;
		return dados;
	}
}
