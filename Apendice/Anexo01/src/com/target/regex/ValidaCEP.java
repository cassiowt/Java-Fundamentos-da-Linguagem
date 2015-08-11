package com.target.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class ValidaCEP {

	public static String perguntar(String titulo, String pergunta) {
		return JOptionPane.showInputDialog(null, pergunta, titulo, -1);
	}

	public static void mostrar(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}

	/*
	 * Testa se uma placa de veículo é valida, utilizando expressões regulares.
	 * VALIDA: KLM-2525
	 */
	public static void main(String args[]) {
		Pattern pattern = Pattern.compile("^\\d{5,5}-\\d{3,3}$");
/*
 * Analisando a expressão, temos entre colchetes  duas listas que informam que
 * só será aceito caractere numérico e  que  podem  ser repetido  no  minimo 5
 * vezes e no  máximo 5 vezes, na sequencia  deve  possuir um  traço e após um 
 * caractere numérico que pode se repetir no minimo 3 vezes e no máximo 3 vezes.
 */
		String s = ValidaCEP.perguntar("Teste de CEP",
				"Digite um CEP Valido: ");

		Matcher matcher = pattern.matcher(s);

		if (matcher.find()) {
			System.out.println(s + " :Esse CEP É Valido");
		} else {
			System.out.println(s + " :Esse CEP NÃO É Valido");
		}
	}
}
