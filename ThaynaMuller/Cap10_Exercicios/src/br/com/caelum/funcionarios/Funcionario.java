package br.com.caelum.funcionarios;

public abstract class Funcionario {
	
	protected String nome;
	protected String cpf;
	protected double salario;
	
	public abstract double getBonificacao();
		
		
	public double mostra() {
		return this.getBonificacao();
		
		/*� possivel chamar um m�todo abstrato dentro de uma classe abstrata. */
	}

}
