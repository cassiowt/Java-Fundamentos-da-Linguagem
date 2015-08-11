package com.target.testarcomandos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.cawt.util.Numero;

/*
 * @autor Cássio
 * @date 16/10/2013
 * Classe para teste comandos da linguagem Java
 */

public class ClasseTeste {

	/*
	 * Criação das classes de dialogo
	 */
	public static String perguntar(String titulo, String pergunta) {
		return JOptionPane.showInputDialog(null, pergunta, titulo, -1);
	}

	public static void mostrar(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}

	public static void main(String[] args) {

		// String resposta = ClasseTeste.perguntar("Teste", "Digite Algo: ");
		// ClasseTeste.mostrar("Você Digitou: \n " + resposta);

		//]TestarIfElse();
		//TestarOperadorTernario();
		// TestarIfElse2();
		// TestarSwitch();
		// TestarSwitch1();
		// TestarWhile();
		// TestarDoWhile();
		// TestaFor();
		// TestarForEach();
		// TestarForEach2();
		TestaBreak();
		//TestaContinue();
	}

	/*
	 * Teste do comando If Else
	 */
	public static void TestarIfElse1() {
		int n = 10;

		if (n > 10) {
			System.out.println("Numero " + n + " é maior do que 10.");
			System.out.println((n > 10));
		} else if (n < 10) {
			System.out.println("Numero " + n + " é menor do que 10.");
			System.out.println((n > 10));
		} else {
			System.out.println("Numero " + n + " é igual 10.");
			System.out.println((n > 10));
		}

		int a = 0, b = 0, c = 2;
		if (a == b) {
			if (b == c) {
				System.out.println("a é igual a c");
			}
		} else {
			System.out.println("a não é igual a b"); // Else para o 1º if
		}

		int i = 0, j = 0, k = 2;

		if (i == j)
			if (j == k)
				System.out.println("i é igual a k");
			else
				System.out.println("i não é igual a j"); // Else para o 2º if

	}

	/*
	 * Teste do comando If Else
	 */
	public static void TestarIfElse() {
		String s = ClasseTeste.perguntar("Teste If Else",
				"Digite um numero inteiro: ");
		int n = Integer.parseInt(s);

		if (n > 10)
			ClasseTeste.mostrar("Numero " + s + " é maior do que 10.");
		else
			ClasseTeste.mostrar("Numero " + s + " é menor ou igual a 10.");
	}


	/*
	 * Teste do operador ternário :?
	 */
	public static void TestarOperadorTernario() {
		
		int n = 10;

		String r = n > 10 ? "maior" : "menor ou igual";

		System.out.println("Numero " + n + " é " + r + " a 10.");

	}

	/*
	 * Teste do operador ternário :?
	 */
	public static void TestarIfElse2() {
		String s = ClasseTeste.perguntar("Teste If Else2",
				"Digite um numero inteiro: ");
		int n = Integer.parseInt(s);

		String r = n > 10 ? "maior" : "menor ou igual";

		ClasseTeste.mostrar("Numero " + n + " é " + r + " a 10.");

	}

	/*
	 * Teste utilizando o comando switch / case
	 */
	public static void TestarSwitch() {
		String s = ClasseTeste.perguntar("Teste Switch / Case",
				"Digite um numero inteiro: ");
		String n = s;

		switch (n) {
		case "0":
			ClasseTeste.mostrar("Numero é Zero");
			break;
		case "1":
			ClasseTeste.mostrar("Numero é Um");
			break;
		case "2":
			ClasseTeste.mostrar("Numero é Dois");
			break;
		default:
			ClasseTeste.mostrar("Numero é é " + n);
			break;
		}
	}

	public static void TestarSwitch1() {

		String s = ClasseTeste.perguntar("Teste Switch / Case",
				"Digite uma Cor: ");

		switch (s.toLowerCase()) {
		case "vermelho":
			ClasseTeste.mostrar("A cor é Vermelho");
			break;
		case "amarelo":
			ClasseTeste.mostrar("A cor é Amarelo");
			break;
		case "verde":
			ClasseTeste.mostrar("A cor é Azul");
			break;
		default:
			ClasseTeste.mostrar("A cor não é Primária");
			break;
		}
	}
	
		

	/*
	 * Teste utilizando o comando switch / case Com o método defineValorExtenso
	 * da Classe Numero //(s.toLowerCase()) 
	 */
	public static void TestarSwitch2() {
		String s = ClasseTeste.perguntar("Teste Switch / Case",
				"Digite um numero inteiro: ");
		int n = Integer.parseInt(s);
		Numero valor = new Numero();

		switch (n) {
		case 0:
			ClasseTeste.mostrar("Numero é Zero");
			break;
		case 1:
			ClasseTeste.mostrar("Numero é Um");
			break;
		case 2:
			ClasseTeste.mostrar("Numero é Dois");
			break;
		default:
			ClasseTeste.mostrar("Numero é " + valor.defineValorExtenso(n));
			break;
		}
	}

	public static void TestarSwitch3() {

		String s = ClasseTeste.perguntar("Teste Switch / Case",
				"Digite uma Cor: (em MAIUSCULO ou minusculo ");

		switch (s) {
		case "vermelho":
		case "VERMELHO":
			ClasseTeste.mostrar("A cor é Vermelho");
			break;
		case "amarelo":
		case "AMARELO":
			ClasseTeste.mostrar("A cor é Amarelo");
			break;
		case "verde":
		case "VERDE":
			ClasseTeste.mostrar("A cor é Azul");
			break;
		default:
			ClasseTeste.mostrar("A cor não é Primária");
			break;
		}
	}

	/*
	 * Teste utilizando o comando while
	 */
	public static void TestarWhile() {
		String s = ClasseTeste.perguntar("Teste While",
				"Deseja testar While? (SIM) ");
		if (!s.toUpperCase().equals("SIM")) {
			ClasseTeste.mostrar("Não será testado!");
			return;
		}

		int count = 0;
		boolean sair = false;
		while (!sair) {
			count++;
			ClasseTeste.mostrar(String.valueOf(count));
			if (count >= 5)
				sair = true;
		}
	}

	/*
	 * Teste utilizando o comando do / while
	 */
	public static void TestarDoWhile() {
		String s = ClasseTeste.perguntar("Teste DoWhile",
				"Deseja testar While? (SIM) ");
		if (!s.toUpperCase().equals("SIM")) {
			ClasseTeste.mostrar("Não será testado!");
			return;
		}

		int count = 0;
		boolean sair = false;
		String msg = "";
		do {
			count++;
			msg += String.valueOf(count) + ",";
			sair = (count == 10);

		} while (!sair);

		ClasseTeste.mostrar(msg);
	}

	/*
	 * Teste utilizando o comando do / while
	 */
	public static void TestaFor() {
		String s = "";
		for (int i = 0; i < 10; i++) {
			s += String.valueOf(i) + ",";

		}
		ClasseTeste.mostrar(s);
	}

	public static void TestaFor1() {
		String s = "";
		for (int i = 0; i < 10; i++) {
			s += String.valueOf(i) + ",";
		}
		System.out.println(s);
		
		int sum = 0; 
		for( int i = 0, j = 20; i < 10; i++, j-- ) {
			    sum += i * j;
			}
		System.out.println(sum);
	}
	
	public static void TestaFor2() {
		for (int i = 0;; i++) {
			System.out.println(i);
			if (i > 2)
				break;
		}
	}
	/*
	 * Teste utilizando o for / each
	 */
	public static void TestarForEach() {
		ArrayList<String> lista = new ArrayList<>();

		lista.add("A");
		lista.add("B");
		lista.add("C");
		lista.add("Cássio");

		for (String s : lista) {
			ClasseTeste.mostrar(s);
			 System.out.println(s);
		}
	}

	/*
	 * Teste utilizando o for / each
	 */
	public static void TestarForEach2() {
		int[] notas = { 78, 86, 98, 100 };

		for (int i : notas) {
			String s = String.valueOf(i);
			ClasseTeste.mostrar(s);
		}
	}

	/*
	 * Teste de comando de desvio break
	 */
	public static void TestaBreak() {
		for (int i = 0; i < 10; i++) {
			String s = String.valueOf(i);
			ClasseTeste.mostrar(s);
			if (i == 5)
				break;
		}
		ClasseTeste.mostrar("TESTE BREACK");
	}

	public static void testaBreack1() {
		comandoFor:
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			//comandoFor:
			for (int j = 0; j < 10; j++) {
				System.out.println("j = " + j);
				if (i * j >= 20) {
					break comandoFor;
				}
			}
		}
		System.out.println("Fim do Comando FOR");

	}
	/*
	 * Teste de comando de desvio continue
	 */
	public static void TestaContinue() {
		for (int i = 0; i < 10; i++) {
			if (i == 2)
				continue;
			String s = String.valueOf(i);
			ClasseTeste.mostrar(s);
		}
		ClasseTeste.mostrar("TESTE CONTINUE");
	}


	public static void testaContinue1() {
	    forExterno:
		for (int i = 0; i < 10; i++) {
			//forExterno:
			for (int j = 0; j < 10; j++) {

				System.out.println(i * j);
				if (i * j >= 20) {
					continue forExterno;
				}
			}
		}
	}
}
