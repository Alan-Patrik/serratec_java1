package br.com.g2ac.banco.util;

public class ValorInvalidoException extends Exception
{	
	public ValorInvalidoException(double valor) 
	{
		super("N�o foi poss�vel realizar a a��o com o seguinte valor: " + valor);
	}
}
