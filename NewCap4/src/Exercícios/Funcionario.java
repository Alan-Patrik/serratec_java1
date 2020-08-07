package Exerc�cios;

public class Funcionario {
	String nome;
	String departamento;
	double salario;
	Data admissao;
	String rg;
	boolean ativo = true;
		
	
	void bonifica(double aumento) {
		this.salario += aumento;
		System.out.println("Bonifica��o: " + aumento);
		}

	void demite() {

		if (this.ativo == true) {
			this.ativo = false;
			System.out.println("Funcion�rio n�o ativo.");

		}	
	}

	@Override
	public String toString() {
		return "Funcionario\n nome = " + nome + " \ndepartamento = " + departamento +
				" \nsalario = " + salario + "\nadmissao = "
				+ admissao.imprimeData() + "\nrg = " + rg ;
	}
}

