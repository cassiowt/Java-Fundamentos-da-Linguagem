package com.targettrust.apl;

import com.targettrust.model.Animal;
import com.targettrust.model.Pessoa;

/**
 * Classe de exemplo do Curso de Fundamentos Java 
 * @author Cássio Trindade
 * @since Maio/2014
 * 
 *
 */
public class Aplicacao {

	public static void main(String[] args) {

		Animal cao = new Animal("Rex", 45.5f, 120, true);
		Pessoa cliente = new Pessoa("9048136793", "Elteril de Alcantara Nadil", cao);
		imprimePessoa(cliente);

	}

	public static void imprimePessoa(Pessoa p) {

		System.out.println("Cliente: " + p.getNome() + " - Identificador: "
				+ p.getIdentificador());
		System.out.println("Possui o animal: " + p.getAnimal().getApelido());
		System.out.println("Peso: " + p.getAnimal().getPeso() + "Kg");
		System.out.println("Altura: " + p.getAnimal().getAltura() + "cm");
	}
}
