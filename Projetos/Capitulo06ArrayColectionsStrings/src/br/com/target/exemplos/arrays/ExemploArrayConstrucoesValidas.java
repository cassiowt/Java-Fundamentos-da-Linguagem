package br.com.target.exemplos.arrays;

import java.util.ArrayList;

import br.com.target.dados.Aluno;
import br.com.target.dados.Loja;
@SuppressWarnings("unused")
public class ExemploArrayConstrucoesValidas {

	public static void main(String[] args) {
		testaArray4();
	}

	// CONSTRUÇÕES VÁLIDAS
	public static void testaArray() {
		// exemplo 1: tamanho é uma constante
		final int TAM = 4;
		int[] nums = new int[TAM];
		System.out.println(nums.length);

		// exemplo 2: tamanho conhecido apenas em tempo de execução
		int[] notasExame;
		Aluno a = new Aluno();
		int n = a.getTotalAlunos();
		notasExame = new int[n];
		System.out.println(notasExame.length);

		// Dias do Mês
		int[] diasMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 0; i < diasMes.length; i++) {
			System.out.printf("\nDia " + diasMes[i]);
		}
	}

	public static void testaArray1() {

		int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] array2 = { { 1, 2 }, { 3, 2, 1, 0 }, { 4, 5, 6 } };

		System.out.println("Valores no array1 passados na linha são");
		outputArray(array1); // exibe o array 2 por linha

		System.out.println("\nValores no array2 passados na linha são");
		outputArray(array2); // exibe o array 2 por linha

		int[] arrayNum = { 10, 20, 30, 40, 50 };
		int total = 0;
		// ADICIONA O VALOR DE CADA ELEMENTO AO TOTAL
		for (int i : arrayNum)
			// Percorrendo o array
			total += i;
		System.out.printf("\nTotal de elementos arrayNum: %d\n", total);

	}

	// FAZ UM LOOP PELAS LINHAS DO ARRAY
	public static void outputArray(int[][] array) {
		// FAZ UM LOOP PELAS COLUNAS DA LINHA ATUAL
		for (int linha = 0; linha < array.length; linha++) {
			// FAZ LOOP PELAS COLUNAS DA LINHA ATUAL
			for (int coluna = 0; coluna < array[linha].length; coluna++)
				System.out.printf("%d ", array[linha][coluna]);
			System.out.println();
		}
	}

	// Inicializa elemento por elemento
	// Cria um vetor de 4 Strings vazias
	public static void testaArray2() {
		String[] array = new String[4];
		for (int i = 0; i < array.length; i++) {
			array[i] = new String();
		}

		// Inicializadores
		String[] animais = { "cao", "gato", "rato", "coelho" };
	}

	public static void testaArray3() {
		String[] produtos = new String[4];
		produtos[0] = "Vacina anti-raiva";
		produtos[1] = "Vermicida";

		for (int i = 0; i < produtos.length; i++) {
			System.out.println(produtos[i]);
		}

		System.out.println("Length: " + produtos[0].length());
		System.out.println(produtos[5]); // ERRO ArrayIndexOutOfBoundsException
	}

	@SuppressWarnings("rawtypes")
	public static void testaArray4() {
			String[] lista = new String[4];
			//System.out.println(lista[5]); // java.lang.ArrayIndexOutOfBoundsException
			
			Loja[] listaClientes = new Loja[3];
			ArrayList nomeCliente = listaClientes[0].getClientesLoja();
			System.out.println(nomeCliente); // java.lang.NullPointerException
	}
}
