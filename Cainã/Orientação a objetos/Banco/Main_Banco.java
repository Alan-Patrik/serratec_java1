public class Main_Banco
{
	public static void main(String[] args)
	{		
		Data dataConta1 = new Data(20, 06, 2015);
		Data dataConta2 = new Data(15, 02, 2018);
		
		Conta conta1 = new Conta("Cain�", 123, "45678-9", dataConta1, 1);
		Conta conta2 = new Conta("Gabrielle", 321, "98765-4", dataConta2, 2);

		conta1.setSaldo(5000);
		conta2.setSaldo(8000);
		
		conta1.saca(2000);
		conta1.deposita(5000);
		
		conta2.deposita(12000);
		
		conta1.imprimeInformacoes();
		conta2.imprimeInformacoes();
		
		//Quest�o 4 e 5
		/*Conta conta3 = new Conta("Cain�", 123, "45678-9", dataConta1);
		if(conta1 == conta3)
		{
			System.out.println("Iguais");
		}
		else
		{
			System.out.println("Diferente");
		}*/
		
	}
}