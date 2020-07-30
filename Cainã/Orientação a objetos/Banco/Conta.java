
public class Conta 
{
	int numeroConta;
	String titular;
	String agencia;
	Data dataAbertura;
	double saldo;
	
	public void saca(double valorSaque)
	{
		if(valorSaque <= this.saldo)
		{
			this.saldo += - valorSaque;
		}
		else
		{
			System.out.print("N�o � poss�vel sacar esse valor dessa conta.");
		}
	}
	
	public void deposita(double valorDeposito)
	{
		this.saldo += valorDeposito;
	}
	
	public double calculaRendimento()
	{
		if(this.saldo != 0)
		{
			return this.saldo * 0.1;
		}
		else
		{
			System.out.print("Essa conta n�o possui saldo.");
			return 0;
		}
	}

	public String recuperaDadosParaImpressao() 
	{
		String dados = "Titular: " + this.titular;
		dados += "\nN�mero da conta: " + this.numeroConta;
		dados += "\nAg�ncia: " + this.agencia;
		dados += "\nData de abertura: " + this.dataAbertura.retornaData();
		dados += "\nSaldo atual: " + this.saldo;
		dados += "\nRendimento mensal: " + calculaRendimento();
		
		return dados;
	}
	
	
}
