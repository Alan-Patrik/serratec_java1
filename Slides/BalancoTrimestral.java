//Em nossa empresa, h� tabelas com o quanto foi gasto em cada m�s. 
//Para fechar o balan�o do primeiro trimestre, 
//precisamos somar o gasto total. Sabendo que, em Janeiro, foram gastos R$ 15000,
//em Fevereiro, R$ 23000, e em Mar�o, R$ 17000, 
//fa�a um programa que calcule e imprima o gasto total no trimestre.
public class BalancoTrimestral {

	public static void main(String[] args) {
		
		int gastoJaneiro = 15000;
		int gastoFevereiro = 23000;
		int gastoMarco = 17000;
		int gastoTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco;
		
		System.out.println("O gasto do trimestre foi: R$" + gastoTrimestre);


	}

}
