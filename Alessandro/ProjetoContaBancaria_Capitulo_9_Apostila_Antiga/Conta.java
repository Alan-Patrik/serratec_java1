/*
 * Exerc�cio - 1. Porque possui duas classe filhas que herdaram seus m�todos.
 * Uma boa candidata a se tornar abstrata � o m�todo * "atualiza."  
 */

/* 
 * Exerc�cio - 2. A utilidade est� no fato de que servir� para o polimorfismo e
 * para a heran�a dos atributos	e m�todos. Sim.
 */

public abstract class Conta {
	
	protected double saldo;
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public void saca(double valor) {
		this.saldo = this.saldo - valor;
	}

	public double getSaldo() {
		return this.saldo ;
	}
	
	/*
	 * Exerc�cio - 3. Com a introdu��o do "abstract" no m�todo, este deixou de
	 * possuir o seu corpo, transferindo toda a sua funcionalidade para a classe
	 * filha "ContaPoupan�a".
	 */
	
	public abstract void atualiza(double valor); 
	
	/*
	 * Exerc�cio -6. Para que ela possa servir de refer�ncia para as classes filhas. Ocorrer� um erro,
	 * pois as classes filhas deixaram de ter a refer�ncia da classe m�e, por�m, isso ocorrer� se houver
	 * o termo "@override", pois se este for retirado, as classes filhas entender�o que o "atualiza" �
	 * um m�todo pr�prio de cada uma e, por isso, ser� compilado.
	 */
	
	// Exerc�cio - 7. Sim.
	
}
