package com.targettrust.apl;

public class TestaArgs {

	public static void main(String[] args) {

		imprime("Java", "Oracle", "Linux");
		imprime("Porto Alegre", "Ijui", "São Leopoldo", "Cruz Alta");
		//imprime( "Ijui", "São Leopoldo", "Cruz Alta", 88);

	}

	public static void imprime(String... args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
