package Exerc�cios;

public class Mostra {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome = "Fiodor";
		f1.salario = 100;

		Funcionario f2 = new Funcionario();
		f2.nome = "Fiodor";
		f2.salario = 100;

		if (f1 == f2) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
	}
//4 -  O operador == compara os endere�os 
	//5 - Ocorre um erro pois n�o tem como comparar os 2 endere�os
}
