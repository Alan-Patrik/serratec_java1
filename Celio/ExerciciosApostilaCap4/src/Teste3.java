
public class Teste3 {

	public static void main(String[] args) {
		
		Conta minhaConta = new Conta();
		minhaConta.agencia = "1461-8";
		minhaConta.nomeTitular = "C�lio da Paz";
		minhaConta.numero = 2500;
		minhaConta.saldo = 1555.00;
		
		System.out.println(minhaConta.recuperaDados());
		
	}

}
