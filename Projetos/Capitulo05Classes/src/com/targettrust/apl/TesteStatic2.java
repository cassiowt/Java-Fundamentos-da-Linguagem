package com.targettrust.apl;

class Classe2 {
	// Escreve alguma frase na tela
	public static void escreve(String msg) {
		System.out.println(msg);
	}

	// Retorna a multiplicação de dois números int
	public static int multiplica(int n1, int n2) {
		return (n1 * n2);
	}

	// Construtor, apenas para mostrar que
	// ele nem chega ser chamado
	public Classe2() {
		System.out.println("Construtor de Classe2");
	}
}

public class TesteStatic2 {
	
/*	  public static void main(String args[]) {
	  	Classe2.escreve("Multiplicando 3 vezes 3:"); int resultado =
	  	Classe2.multiplica(3, 3); Classe2.escreve("Resultado: " + resultado); } 
	  }*/
	  
	 

	public static void main(String args[]) {
		Classe2 c2 = new Classe2();
		c2.escreve("Multiplicando 3 vezes 3:");
		int resultado = c2.multiplica(3, 3);
		c2.escreve("Resultado: " + resultado);
	}
}