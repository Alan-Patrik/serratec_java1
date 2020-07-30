
  import java.util.Scanner; 

public class Conta {

	String titular;
	int numero;
	String agencia;
	double saldo;
	//String DataAbertura;
	Data DataAbertura;
	double rendimento;
	
	Scanner scanner = new Scanner(System.in);
	
	boolean saca (double quantidade)
	{
		if(this.saldo<quantidade)
		{
			System.out.println("Voc� n�o possui saldo suficiente.");
			return false;
			
		}
		else
		{
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
		
		System.out.println ("Saque de R$ " + quantidade + " efetuado. " );
		System.out.println ("Seu novo saldo �: R$ " + this.saldo );
		return true;
		}
	}
	void deposita (double valordeposito)
	{
		System.out.println ( "Qual valor deseja depositar?" );
		
	      	valordeposito = scanner.nextDouble();
	      	
	      double novoSaldo = this.saldo + valordeposito;
	      this.saldo = novoSaldo; 
	      System.out.println ("Dep�sito de R$ " + valordeposito + " efetuado. " );
	      System.out.println ("Seu novo saldo �: R$ " + this.saldo );
	      scanner.close();
	}
	
	void calculaRendimento ( ) 
	{
		double rendimentomensal = this.saldo*0.1;
		this.rendimento = rendimentomensal;
		System.out.println ("Seu rendimento mensal foi de: R$ " + this.rendimento );
	}
	
	String recuperaDadosParaImpressao ( )
	{
		String dados = "Titular: " + this.titular;
		dados += "\nAg�ncia: " + this.agencia;
		dados += "\nN�mero da conta: " + this.numero;
		dados += "\nData de abertura: " + this.DataAbertura;
		dados += "\nSaldo : R$ " + this.saldo;
		return dados;
	}
		
}