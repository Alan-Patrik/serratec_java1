/* 5. No c�digo do exerc�cio anterior, aumente a quantidade de n�meros que ter�o os fatoriais impressos,*/
/* at� 20, 30, 40. Em um determinado momento, al�m desse c�lculo demorar, vai come�ar a	mostrar */
/* respostas completamente erradas. Por	qu�? */
/* Por que acredito que ultrapassou o limite de espa�os pr�-definidos no sistema. */
/* Mude	de int para long para ver alguma mudan�a. */
/* Houve um aumento da toler�ncia, mas n�o muito. */

public class Exercicio_5 {

	public static void main(String[] args) {
				
	long num = 1;
		for (int i = 1; i <= 21; i++) {
			num = num * i;
			System.out.println ("O fatorial de " + i + " � (" + (i-1) + ")! * " + i + " = " + num);
		}
	}	
}