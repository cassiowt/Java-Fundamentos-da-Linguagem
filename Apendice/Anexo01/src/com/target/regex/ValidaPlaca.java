package com.target.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class ValidaPlaca {

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
		Pattern pattern = Pattern.compile("[a-zA-Z]{3,3}-\\d{4,4}");
/*
 * Analizando a expressão, temos entre colchetes  duas listas que informam que
 * só será aceito caractere de “a” até “z” tanto  maiúsculo como minusculo que
 * podem  ser repetido  no  minimo 3 vezes e no  máximo 3 vezes. Seguido  deve
 * possuir um traço e após um caractere numérico que pode se repetir no minimo 
 * 4 vezes e no máximo 4 vezes.
 */
		String s = ValidaPlaca.perguntar("Teste de Placa",
				"Digite uma Placa de Carro Valida: ");

		Matcher matcher = pattern.matcher(s);

		if (matcher.find()) {
			System.out.println(s + " :Essa Placa É Valida");
		} else {
			System.out.println(s + " :Essa Placa NÃO É Valida");
		}
	}
}
