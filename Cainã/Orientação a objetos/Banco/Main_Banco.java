
public class Main_Banco 
{
	public static void main(String[] args) 
	{
		//Declara��o da data
		Data data = new Data();
		data.dia = 25;
		data.mes = 04;
		data.ano = 2015;
		
		//Declara��o das contas
		Conta c1 = new Conta();
		//Conta c2 = new Conta(); <-------- declara��o da conta 2
		
		//Dados da 1� conta
		c1.titular = "Hugo";
		c1.numeroConta = 123;
		c1.agencia = "45678-9";
		c1.saldo = 50;
		c1.dataAbertura = data;
		
		//c1 = c2; <------------- igualando c1 com c2

		//Dados da 2� conta
		/*c2.titular = "Hugo";
		c2.numeroConta = 123;
		c2.agencia = "45678-9";
		c2.saldo = 50;
		c2.dataAbertura = "25/04/2015";
		
		if(c1 == c2) <----------------------- if da quest�o 4
		{
			System.out.print("Iguais");
		}
		else
		{
			System.out.print("Diferentes");
		}*/
		
		System.out.println(c1.recuperaDadosParaImpressao());
		
		c1.deposita(100);
		c1.saca(75);
		
		System.out.println("\n" + c1.recuperaDadosParaImpressao());
	}
}
