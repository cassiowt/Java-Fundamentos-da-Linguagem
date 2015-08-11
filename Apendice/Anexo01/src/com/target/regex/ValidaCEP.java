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
	 * Testa se uma placa de ve�culo � valida, utilizando express�es regulares.
	 * VALIDA: KLM-2525
	 */
	public static void main(String args[]) {
		Pattern pattern = Pattern.compile("^\\d{5,5}-\\d{3,3}$");
/*
 * Analisando a express�o, temos entre colchetes  duas listas que informam que
 * s� ser� aceito caractere num�rico e  que  podem  ser repetido  no  minimo 5
 * vezes e no  m�ximo 5 vezes, na sequencia  deve  possuir um  tra�o e ap�s um 
 * caractere num�rico que pode se repetir no minimo 3 vezes e no m�ximo 3 vezes.
 */
		String s = ValidaCEP.perguntar("Teste de CEP",
				"Digite um CEP Valido: ");

		Matcher matcher = pattern.matcher(s);

		if (matcher.find()) {
			System.out.println(s + " :Esse CEP � Valido");
		} else {
			System.out.println(s + " :Esse CEP N�O � Valido");
		}
	}
}
