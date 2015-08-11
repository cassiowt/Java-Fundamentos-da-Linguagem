package com.target.view;
import com.target.model.Animal;

public class TestaPassandoTipoReferenciasParaMetodos {
	public static void main(String[] args) {
		Animal cao = new Animal();
		cao.setApelido("Rex");
		altera(cao);
		System.out.println(cao.getApelido());
	}
	public static void altera(Animal ref) {
		ref.setApelido("Draco");
	}
}
