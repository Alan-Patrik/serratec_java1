/* Quando se est� setando valores no construtor, ele escolhe o que melhor lhe preenche. Por isso � necess�rio a 
 cria��o de um construtor sem argumentos, pois nem sempre ir� ser setado um valor.*/
public class Main {

	public static void main(String[] args) {

		ContaBanco c1 = new ContaBanco(123321, "Inter", new Data("31", "07", "2020"));

		c1.depositar(200);
		System.out.println(c1.getSaldo());
		c1.sacar(15);
		System.out.println(c1.getSaldo());
	}
}
