package br.com.target.exemplos.strings;

import java.io.IOException;
import java.util.Scanner;

public class ExemploStrings2 {
	private static Scanner ler;

	public static void main(String[] args) throws IOException {
		// comparaStrings();
		converteString();
	}

	public static void comparaStrings() throws IOException {
		ler = new Scanner(System.in);

		String nome;
		String nome1;
		char sexo;

		System.out.printf("Informe um nome:\n");
		nome = ler.nextLine();

		System.out.printf("Informe um segundo nome para comparação:\n");
		nome1 = ler.nextLine();

		System.out.printf("\nInforme o sexo (M/F):\n");
		sexo = (char) System.in.read();

		if ((sexo == 'M') || (sexo == 'm'))
			System.out.printf("\nSeja bem-vindo Sr. %s.\n", nome);
		else
			System.out.printf("\n %s, Seja bem-vinda Sra.\n", nome);

		System.out.println("São iguais? (case sensitive)");
		System.out.println(nome.equals(nome1) ? "sim" : "não");
		System.out.println("São iguais? (sem case sensitive)");
		System.out.println(nome.equalsIgnoreCase(nome1) ? "sim" : "não");

	}

	/*
	 * Convertendo tipos primitivos em strings
	 */
	public static void converteString() {
		String sete = String.valueOf(7); // chama valueOf(int) "7"
		System.out.println(sete);
	
		String umPontoZero = String.valueOf(1.0f); // chama valueOf(float) "1.0"
		System.out.println(umPontoZero);
		
		System.out.printf("Nome: ");
		String cliente = "João Ninguem";
		int total = 53;
		System.out.printf("%s possui %d anos.\n", cliente, total);

	}
}
