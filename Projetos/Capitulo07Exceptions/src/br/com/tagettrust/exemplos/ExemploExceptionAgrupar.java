package br.com.tagettrust.exemplos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExemploExceptionAgrupar {

	public static void main(String[] args) {
		lerArquivo();
		ConverteNumero("aa");
	}

	public static void lerArquivo() {
		String a = "arq.txt";
		// String a = "C:\\arq.txt";
		try {
			new FileInputStream(a);
			int r = 3 / 0;
			System.out.printf("Aberto o arquivo %s para leitura" + r, a);
		} catch (FileNotFoundException ex) {
			// tratar erro de “arquivo não encontrado”...
			System.out.println("arquivo não encontrado " + ex.getMessage());
		} catch (IOException ex2) {
			// tratar erro de “IO”...
		} catch (Exception ex3) {
			// tratar todos os outros tipos de erros...
			System.out.println("Exceção geral " + ex3.getMessage());
		}
	}

	public static void ConverteNumero(String parametroString) {
		int num;
		try {
			System.out.println("String lida: " + parametroString);
			num = Integer.parseInt(parametroString);
			System.out.println("Numero: " + num);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Não foi fornecido argumento.\n"
					+e.getMessage());
			return;
		} catch (NumberFormatException e) {
			System.out.println("Não foi possível converter a string"
					+ " para inteiro. Verifique a string fornecida.\n"
					+e.getMessage());
		} catch (Exception e) {
			System.out.println("Erro generico \n"+e.getMessage());
	
		} finally {
			System.out.println("Executado Bloco finally.");
		}
		System.out.println("Encerrando método");
	}
}
