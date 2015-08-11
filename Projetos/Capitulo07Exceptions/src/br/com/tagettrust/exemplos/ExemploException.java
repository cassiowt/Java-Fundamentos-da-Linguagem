package br.com.tagettrust.exemplos;

import java.io.*;

/**
 * @author Cassio
 * @since 21/10/2013
 *  Exemplos de utilização de Exception com Try Catch
 * 
 */
public class ExemploException {
	public static void main(String[] args) {
		try {
			tryCatch();
			tryCatch1();
			tryCatch2();
			tryCatch3();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	// *******************

	public static void tryCatch() {
		System.out.println("______Try Catch______________________________");
		String a = "arq.txt";
		//String a = "C:\\Users\\cassio\\Google Drive\\TargetTrust\\TT_FundamentosJava\\wrs_TT_FundamentosJava\\Cap07Exceptions\\src\\arq.txt";
		try {
			new FileInputStream(a);
			System.out.printf("Aberto o arquivo %s para leitura", a);
		} catch (FileNotFoundException e) {
			System.out.printf(
					"Nao foi possível abrir o arquivo %s para leitura", a);
		}

		// *******************
	}

	public static void tryCatch1() {
		System.out
				.println("\n\n______Outro Try Catch______________________________");
		String a = "arq.txt";
		try {

			new FileInputStream(a);
			System.out.printf("Aberto o arquivo %s para leitura", a);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("OCORREU ERRO");

		}
	}

	// *******************
	public static void tryCatch2() {
		System.out
				.println("\n\n______Outro Try Catch______________________________");
		String var = "ABC";
		try {
			Integer i = new Integer(var);
			System.out.println("A variável i vale " + i);

		} catch (NumberFormatException e) {
			System.out.println("Não é possível atribuir a string " + var
					+ " a um Objeto Inteiro.\n"
					+ "A seguinte mensagem foi retornada:\n" + "--->> "
					+ e.getMessage());
		}
	}

	// *******************
	public static void tryCatch3() {
		System.out
				.println("\n\n______Outro Try Catch______________________________");

		int var = 2;
		try {
			Integer i = new Integer(var);
			System.out.println("A variável i vale " + i);

		} catch (NumberFormatException e) {
			System.out.println("Não é possível atribuir a string " + var
					+ " a um Objeto Inteiro.\n"
					+ "A seguinte mensagem foi retornada:\n" + "--->> "
					+ e.getMessage());
		} finally { // com finali
			Integer i = new Integer(1);
			System.out.println("Tentado outro valor para i = " + i
					+ " ( Com finally )");
		}
	}
}
