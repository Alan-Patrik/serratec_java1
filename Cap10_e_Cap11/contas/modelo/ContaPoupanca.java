package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta {
	
		
	   // Exerc�cio 10.6.3
	
		/*public String getTipo ()
		{
			return super.getTipo() + "Poupan�a"; 
		} */
	
	//Como na classe Conta o m�todo est� abstract ele determina que a Classe Poupan�a ( uma classe
	// concreta) a escrever o m�todo.Assim sendo, temos que reescrever o m�todo aqui.
	 
	public String getTipo ()
	{
		return  "Conta Poupan�a"; 
	} 





}
