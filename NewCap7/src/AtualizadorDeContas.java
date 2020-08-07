
public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	void roda(Conta c) {
		System.out.println("O saldo anterior da conta �: " + c.getSaldo());
		c.atualiza(this.selic);
		System.out.println("Saldo total �: " + c.getSaldo());
		saldoTotal += c.getSaldo();
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}

}
