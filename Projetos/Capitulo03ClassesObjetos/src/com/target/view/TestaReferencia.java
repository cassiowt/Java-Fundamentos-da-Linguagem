package com.target.view;

import com.target.model.Animal;

public class TestaReferencia {
	 private static Animal cao;
	 private static Animal gato;

	public static void main(String[] args) {

		cao = new Animal();

		if (cao == null)
			System.out.println("Objeto cao é null");
		else
			System.out.println("Objeto cao NÃO é null");

		if (gato == null)
			System.out.println("Objeto gato é null");
		else
			System.out.println("Objeto gato NÃO é null");

	}

}
