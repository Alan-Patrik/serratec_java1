package br.com.caelum.contas.modelo;

/* 
 * Resumidamente as exce��es Checked (Exception) s�o aquelas no qual voc� � 
 * obrigado a trat�-la, seja com um bloco try-catch ou mesmo com um throws 
 * (relan�ando a mesma para outro local). Por outro lado, quando voc� tem 
 * exce��es do tipo Unchecked (RuntimeException) n�o � obrigat�rio o tratamento 
 * da mesma, voc� pode tratar apenas se quiser, se sentir que � necess�rio para 
 * o bom funcionamento da sua aplica��o.
*/

/*
 * Checked exceptions s�o utilizadas para erros recuper�veis enquanto que 
 * Unchecked exceptions s�o utilizadas para erros irrecuper�veis. Significa 
 * dizer que quando voc� sabe que seu erro pode ser tratado, voc� utiliza 
 * Checked Exceptions, caso contr�rio utilize Unchecked Exceptions.
*/

public class SaldoInsuficienteException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteException(double valor) {
		super("Saldo insuficiente para sacar o valor de: " + valor);
	}

}
