package br.com.caelum.contas.modelo;

/*
 * fonte: https://blog.caelum.com.br/facilitando-a-manutencao-dos-testes-ao-diminuir-o-acoplamento-com-o-codigo/
 * � f�cil entender por que devemos diminuir o acoplamento entre classes: a 
 * altera��o em um ponto do sistema pode propagar a necessidade de mudan�as em 
 * outros. Dependendo do acoplamento, uma simples altera��o exige um esfor�o 
 * enorme. Em alguns casos as mudan�as n�o s�o feitas, e a funcionalidade � 
 * simplesmente descartada, devido a esse alto custo de manuten��o deixado pelo 
 * acoplamento . Uma das tentativas para diminui-lo � tentar sempre programar 
 * voltado para interfaces e n�o para uma implementa��o e TDD pode ser utilizado
 *  para atingir esse objetivo.
 */

public interface Tributavel {

	public double getValorImposto();

	public String getTitular();

	public String getTipo();

}
