
public class MainConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//Excerc�cio 1 
	
	/*Conta minhaConta = new Conta();
	
	// Inserindo os dados da Cliente Carla
	
			minhaConta.titular = "CarlaH";
			minhaConta.numero  = 1234567;
			minhaConta.agencia = "1234";
			minhaConta.saldo = 5000;
			minhaConta.DataAbertura ="01.07.2020";
	*/
		
	// Quando tentei modificar os atributos privados o programa me retornou a seguinte mensagem:
		// " The field is not visible" e n�o foi poss�vel alterar.
		
		//Excerc�cio 3
		
		
		/*Conta minhaConta = new Conta();
		
		minhaConta.setTitular ("CarlaH" );
		System.out.println ( "Titular:  " + minhaConta.getTitular());
		
		
		minhaConta.setAgencia ("1234");
		System.out.println ("Ag�ncia : " + minhaConta.getAgencia());
		
		minhaConta.setNumero(1234567);
		System.out.println ( "N�mero da Conta: " + minhaConta.getNumero());
		
		System.out.println ( "Data de abertura: " + minhaConta.getDataAbertura());
		

		minhaConta.deposita (0);
		System.out.println ("Seu novo saldo � : " + minhaConta.getSaldo()); 
		*/

		//Excerc�cio 4
		
		
		Conta minhaConta = new Conta ("CarlaHS");
		Conta outraConta = new Conta ();
		
		System.out.println("Titular da primera conta: " + minhaConta.titular);
		System.out.println ( "Titular da segunda conta:  " + outraConta.titular);
		
		
		
	}

}
