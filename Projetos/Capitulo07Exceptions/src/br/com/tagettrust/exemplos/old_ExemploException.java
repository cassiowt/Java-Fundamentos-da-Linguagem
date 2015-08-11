package br.com.tagettrust.exemplos;

import java.io.*;

/**
 * @author Cassio
 * @since 21/10/2013
 * Exemplos de utilização de Exception com Try Catch
 * 
 */
public class old_ExemploException {
	public static void main(String[] args) {
		
		
//*******************
		System.out.println("______Try Catch______________________________");
		String a = "arq.txt";
		try {
			new FileInputStream(a);
			System.out.printf("Aberto o arquivo %s para leitura", a);
		} catch (FileNotFoundException e) {
			System.out.printf("Nao foi possível abrir o arquivo %s para leitura", a);
		}

		//*******************
		System.out.println("\n\n______Outro Try Catch______________________________");
		try {

			new FileInputStream(a);
			System.out.printf("Aberto o arquivo %s para leitura", a);
		} catch (Exception e) {
			e.printStackTrace();

		}

//*******************
		System.out.println("\n\n______Outro Try Catch______________________________");
		String var = "ABC";
		try {
			Integer i = new Integer(var);
			System.out.println("A variável i vale " + i);

		} catch (NumberFormatException e) {
			System.out
					.println("Não é possível atribuir a string " + var
							+ " a um Objeto Inteiro.\n"
							+ "A seguinte mensagem foi retornada:\n"+
							"--->> "+ e.getMessage());
		}

//*******************
		System.out.println("\n\n______Outro Try Catch______________________________");
		try {
			Integer i = new Integer(var);
			System.out.println("A variável i vale " + i);

		} catch (NumberFormatException e) {
			System.out
					.println("Não é possível atribuir a string " + var
							+ " a um Objeto Inteiro.\n"
							+ "A seguinte mensagem foi retornada:\n" +
							"--->> "+  e.getMessage());
		} finally { // com finali
			Integer i = new Integer(1);
			System.out.println("Tentado outro valor para i = " + i +" ( Com finally )");
		}
	}
}
