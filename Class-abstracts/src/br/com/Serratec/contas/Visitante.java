package br.com.Serratec.contas;

public class Visitante extends Pessoa {

	@Override
	public void fazerAniversario() {
		this.idade ++;
		System.out.println("\nFeliz Anivers�rio " + this.nome);
		System.out.println("Voc� est� completando " + this.idade + " anos!");
	}

}
