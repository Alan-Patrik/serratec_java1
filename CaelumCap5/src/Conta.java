
public class Conta {

	private String titular;
	private int NumeroDaConta;
	Data RetornarData;
	private int IdUsuario;
	private static int GeraId;

	private int geraId() {
		Conta.GeraId = Conta.GeraId + 1;
		return Conta.GeraId;
	}

	public Conta(String titular) {
		this.IdUsuario = geraId();
		this.titular = titular;
	}

	public Conta() { // 4 - Construtor - Atrav�s do construtor vazio eu posso criar um objeto sem
						// argumento
		this.IdUsuario = geraId();
	}

	public int getid() { // 5- N�o O identificador ser� controlado pelo sistema pois o valor � �nico.
		return this.IdUsuario;

	}

	public String gettitular() {
		return this.titular;
	}

	public void settitular(String titular) {
		this.titular = titular;
	}

	public int getNumeroDaConta() {
		return this.NumeroDaConta;
	}

	public void setNumeroDaConta(int NumeroDaConta) {
		this.NumeroDaConta = NumeroDaConta;
	}

}

	
