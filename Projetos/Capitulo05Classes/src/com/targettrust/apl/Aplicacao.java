package com.targettrust.apl;

import java.sql.Date;

import com.target.dados.*;

public class Aplicacao {
	public static void main(String[] args) {
		testaEspecieA();
	}

	public static void testaAnimal() {
		Animal cao = new Animal();
		Animal gato = new Animal("Draco");
		Animal rato = new Animal(120, "Rantaro");
		
	}

	public static void testaAnimalA() {
		Animal gato = new Animal();
		gato.setApelido("Draco");
		gato.setId(1);
		gato.setTipoanimal(TipoAnimal.Mamíferos);
		
		
		Animal cao = new Animal();
		cao.setApelido("Rex");
		cao.setId(2);
	}

	public static void testaEspecie() {
		Especie cachorros = new Especie();
		cachorros.setNome("Cachorros");
		cachorros.setFamilia("Mamiferos");

		Especie gatos = new Especie();
		gatos.setNome("Gatos");
		gatos.setFamilia("Passaros");

		System.out.println("Nome Especie: "+cachorros.getNome() + " Família: " + cachorros.getFamilia());
		System.out.println("Nome Especie: "+gatos.getNome() + " Família:  " + gatos.getFamilia());

	}
	
	public static void testaEspecieA() {
		Especie.setFamilia("Mamiferos"); // nome da classe
		
		Especie cachorros = new Especie();
		cachorros.setNome("Cachorros");
		
		Especie gatos = new Especie();
		gatos.setNome("Gatos");
		
		System.out.println("Nome Especie: "+cachorros.getNome() + " Família: " + Especie.getFamilia());
		System.out.println("Nome Especie: "+gatos.getNome() + " Família:  " + Especie.getFamilia());

	}
	public static void testaPesso() {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Fulano de Tal");
		Date dataCriacao = (Date) pessoa.getDataNascimento();
		
		Cliente cliente1 = new Cliente();
		
		Fornecedor fornecedor = new Fornecedor();
		Date dataCadastroFornecedor = (Date) fornecedor.getDataCadastro();
		System.out.println(fornecedor.isAtivo());
		
	} 
}


/*
 * 
 */