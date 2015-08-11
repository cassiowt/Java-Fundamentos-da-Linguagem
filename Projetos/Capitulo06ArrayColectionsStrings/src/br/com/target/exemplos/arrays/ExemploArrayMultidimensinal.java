package br.com.target.exemplos.arrays;

public class ExemploArrayMultidimensinal {
	public static void main(String[] args) {

		int nomes = 4, times = 2;
		String[][] pessoas = new String[nomes][times];
		pessoas[0][0] = "João";
		pessoas[0][1] = "Grêmio";
		pessoas[1][0] = "Jorge";
		pessoas[1][1] = "Inter";
		pessoas[2][0] = "Mario";
		pessoas[2][1] = "Grêmio";
		pessoas[3][0] = "Cassio";
		pessoas[3][1] = "Inter";


		for (int i = 0; i < nomes; i++) {
			for (int j = 0; j < times; j++) {
				System.out.print(pessoas[i][j] + " ");
			}
			System.out.println("");
		}

		System.out.println("\n_______________________________\n");

		String[] produtos = new String[4];
		produtos[0] = "Canetas Vermelhas";
		produtos[1] = "Canetas Vermelhas";
		produtos[2] = "Canetas Vermelhas";
		produtos[3] = "Canetas Vermelhas";
		produtos[3] = "Canetas Azul";
		
		
		
		//String produto = produtos[0];
		System.out.println("Length: " + produtos[3].length());

		System.out.println("\n_______________________________\n");

		int[][] a = new int[10][];
		for (int i = 0; i < a.length; i++) {
			a[i] = new int[i + 1];
		}
	}
}
