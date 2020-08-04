package br.com.caelum.controle;
import br.com.caelum.funcionarios.Funcionario;

public class ControleDeBonificacoes {
	
	private double totalDeBonificacoes = 0;
	
	public void registra(Funcionario f) {
		System.out.println("Adicionando bonifica��o do funcion�rio: "+f);
		this.totalDeBonificacoes += f.getBonificacao();
				
	}
	
	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}

}
