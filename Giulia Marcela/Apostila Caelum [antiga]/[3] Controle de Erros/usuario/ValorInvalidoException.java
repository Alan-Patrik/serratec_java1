package br.com.g2ac.usuario.main;

//Criado no Exerc�cio 5
public class ValorInvalidoException extends Exception {

	public ValorInvalidoException(double valor){
		super("Valor Inv�lido: " + valor);
	}
}
