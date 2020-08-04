package br.com.caelum.contas.modelo;

import java.util.Scanner;

public class TestaContas {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double valor;
		int tipoConta;
		int tipoOperacao;
		int controle = 0;

		Conta c = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		System.out.printf("Entre com o nome do titular da conta: ");
		c.titular = ler.nextLine();
		System.out.printf("Entre com a ag�ncia: ");
		c.agencia = ler.nextLine();
		System.out.printf("Entre com o numero da conta: ");
		c.numero = ler.nextInt();
		System.out.println("\n");

		System.out.println("---- TIPOS DE CONTA ----");
		System.out.println("1 - Conta Corrente");
		System.out.println("2 - Conta Poupan�a\n");
		System.out.printf("Entre com o tipo de conta: ");
		tipoConta = ler.nextInt();

		while (controle == 0) {
			if (tipoConta == 1) {
				System.out.println("\n");
				System.out.println("---- TIPO DE OPERA��O ----");
				System.out.println("1 - Dep�sito");
				System.out.println("2 - Saque");
				System.out.println("3 - Atualiza��o de Valores");
				System.out.println("4 - Sair\n");
				System.out.printf("Entre com o n�mero da opera��o desejada: ");
				tipoOperacao = ler.nextInt();

				if (tipoOperacao == 1) {
					System.out.println("\n" + c.titular + " Seu saldo atual � de: " + cc.getSaldo());
					System.out.printf("Entre com o valor a ser depositado: ");
					valor = ler.nextDouble();
					cc.deposita(valor);
					System.out.println(c.titular + " Seu saldo atual � de: " + cc.getSaldo());
				} else if (tipoOperacao == 2) {
					System.out.printf("Entre com o valor a ser sacado: ");
					valor = ler.nextDouble();
					cc.saca(valor);
					System.out.println(c.titular + " Seu saldo atual � de: " + cc.getSaldo());
				} else if (tipoOperacao == 3) {
					cc.atualiza();
					System.out.println(c.titular + " Seu saldo atual � de: " + cc.getSaldo());
				} else if (tipoOperacao == 4) {
					controle = 5;
				} else {
					System.out.println("Tipo inexistente de opera��o!!!");
				}

			} else if (tipoConta == 2) {

				System.out.println("---- TIPO DE OPERA��O ----");
				System.out.println("1 - Dep�sito");
				System.out.println("2 - Saque");
				System.out.println("3 - Atualiza��o de Valores");
				System.out.println("4 - Sair\n");
				System.out.printf("Entre com o n�mero da opera��o desejada: ");
				tipoOperacao = ler.nextInt();

				if (tipoOperacao == 1) {
					System.out.println("\n" + c.titular + " Seu saldo atual � de: " + cp.getSaldo());
					System.out.printf("Entre com o valor a ser depositado: ");
					valor = ler.nextDouble();
					cp.deposita(valor);
					System.out.println(c.titular + " Seu saldo atual � de: " + cp.getSaldo());
				} else if (tipoOperacao == 2) {
					System.out.printf("Entre com o valor a ser sacado: ");
					valor = ler.nextDouble();
					cp.saca(valor);
					System.out.println(c.titular + " Seu saldo atual � de: " + cp.getSaldo());
				} else if (tipoOperacao == 3) {
					cp.atualiza();
					System.out.println(c.titular + " Seu saldo atual � de: " + cp.getSaldo());
				} else if (tipoOperacao == 4) {
					controle = 5;
				} else {
					System.out.println("Tipo inexistente de opera��o!!!");
				}

			} else {
				System.out.println("Tipo inexistente de conta!!!");
				controle = 5;
			}
		}
		ler.close();
	}

}
