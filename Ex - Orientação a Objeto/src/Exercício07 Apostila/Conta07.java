class Conta07 {
	
	String titular;
	String agencia;
	String numero_da_conta;
	double saldo;
	Data07 dataDeAbertura;

		
	String recuperaDadosParaImpressao() {
		String dados = "\nTitular: " + this.titular;
		dados += "\nDia: " + this.dataDeAbertura.dia;
		dados += "\nM�s: " + this.dataDeAbertura.mes;
		dados += "\nAno: " + this.dataDeAbertura.ano;
		return	dados;
	}

}	
