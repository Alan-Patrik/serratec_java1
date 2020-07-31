/* Exerc�cio 7 - valida��o s� para teste*/
public class PessoaFisica {
	String cpf;

	public PessoaFisica(String cpf) {
		System.out.println("Instanciado - Objeto Criado!");
		this.cpf = cpf;

	}

	private static void valida(String x) {
		if (x.length() == 11) {
			System.out.println("Cpf v�lido!");
			PessoaFisica pessoa = new PessoaFisica(x);
			System.out.println(pessoa.cpf);
		} else {
			System.out.println("\nCpf n�o � v�lido!");
		}

	}

	public static void main(String[] args) {
		PessoaFisica.valida("12345678912");
		PessoaFisica.valida("123");
	}

}
