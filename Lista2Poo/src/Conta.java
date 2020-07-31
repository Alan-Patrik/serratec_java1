public class Conta {
	
	String titular;
	int numero;
	String agencia;
	double saldo;
	Data dataAbertura;
	
	
	void saca(double saque) {
		double novosaldo = this.saldo - saque;
		this.saldo = novosaldo;
	}
	
	void deposita(double deposito) {
		double novosaldo = this.saldo + deposito;
		this.saldo = novosaldo;
	}
	
	void calculaRendimento (double rendimento) {
		double novosaldo = this.saldo * 0.1;
		this.saldo = novosaldo;	
	}
	 String recuperaDadosParaImpressao () {
		String dados = "Titular � : " + this.titular; 
		dados += "\nnumero da conta �: " + this.numero;
		dados += "\nAgencia �: " + this.agencia;
		dados += "\nO saldo �: " + this.saldo;
		dados += "\nA data da abertura da conta �: " + this.dataAbertura.formatada();
		
		//" + dataAbertura.dia + "/" + dataAbertura.mes + "/" + dataAbertura.ano
		return dados;
	}
	 //Exercicio 8 - N�o � poss�vel acessar o atributo atrav�s da classe.
	 //minhaconta.saldo = 1234;
	 //minhaconta.calculaRendimento(0);
}
