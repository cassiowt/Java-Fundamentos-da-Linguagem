package com.target.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BuscaString {

	public static void main(String[] args) {
		exmploUm();

	}

	private static void exmploUm() {
		String REGEX = "\\bgato\\b"; 
		String INPUT = "gato gato gato gatinho gato rato";
//						12345678901234567890123456789012

		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT); // obtebdo um objeto para a correspondência
		int count = 0;

		while (m.find()) {
			count++;
			System.out.println("Bloco " + count);
			System.out.println("Inicio: " + m.start());
			System.out.println("Fim: " + m.end());
		}

	}
}
