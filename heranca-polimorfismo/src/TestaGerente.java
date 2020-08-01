
public class TestaGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Jo�o da Silva", "12345678925");
		gerente.setSenha(4231);
		gerente.salario = 10000;

		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Jos� Ferreira");
		funcionario.setCpf("86349875213");

		// Autenticando senha
		gerente.autentica(gerente.getSenha());
		gerente.autentica(123);

		ControleDeBonificacoes controle = new ControleDeBonificacoes();
		controle.registra(gerente);
		controle.registra(funcionario);

		System.out.println("\nBonifica��o Gerente " + gerente.getNome() + ": "
				+ gerente.getBonificacao());
		System.out.println("Bonifica��o Funcion�rio " + funcionario.getNome()
				+ ": " + funcionario.getBonificacao());

		System.out.println("\nValor total bonifica��es: "
				+ controle.getTotalDeBonificacoes());

		// UpCasting
		Funcionario funcionarioGerente = new Gerente("Pedro Augusto",
				"78548697845");

		// DownCasting responsabilidade do programador dizer ao compilador que o
		// objeto e do tipo Gerente
		Gerente gerenteFuncionario = (Gerente) funcionarioGerente;

		System.out.println("\nNome: " + gerenteFuncionario.getNome() + "\ncpf: "
				+ gerenteFuncionario.getCpf());

	}

}
