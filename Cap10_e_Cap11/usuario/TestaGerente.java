package br.com.caelum.usuario;

public class TestaGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gerente gerente = new Gerente ();
				
		// m�todo da Classe m�e Funcion�rio
		
		gerente.setNome("CarlaH");
		
		//System.out.println ( "Gerente : " + gerente.getNome() );
		
		
		// m�todo da Classe filha Gerente
		
		   gerente.setSenha(4231);
		
		   gerente.autentica (4231);
		
		// 1� teste Bonifica��o-sem reescrever o m�todo ( Resultado : 500)
		// 2� teste Bonifica��o-reescrevendo o m�todo ( Resultado: 750)   
		// 3� teste Bonifica��o-reescrevendo o m�todo com "super" ( Resultado: 1000)   
			   
		 gerente.setSalario ( 5000.0);
		 
		 System.out.println( gerente.getBonificacao ()); 
		 
		
		
		   
		
	}

}
