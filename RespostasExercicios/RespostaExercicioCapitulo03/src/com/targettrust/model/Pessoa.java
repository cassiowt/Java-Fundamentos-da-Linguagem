package com.targettrust.model;

/**
 * Classe de exemplo do Curso de Fundamentos Java 
 * @author Cássio Trindade
 * @since Maio/2014
 * 
 *
 */
public class Pessoa {
	private String identificador;
	private String nome;
	private Animal animal;

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param parametroIdentificador
	 * @param parametroNome
	 * @param parametroAnimal
	 */
	public Pessoa(String parametroIdentificador, String parametroNome,
			Animal parametroAnimal) {
		this.identificador = parametroIdentificador;
		this.nome = parametroNome;
		this.animal = parametroAnimal;
	}

	/**
	 * @return the identificador
	 */
	public String getIdentificador() {
		return this.identificador;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return this.nome;
	}

	/**
	 * @return the animal
	 */
	public Animal getAnimal() {
		return this.animal;
	}

	/**
	 * @param parametroIdentificador the identificador to set
	 */
	public void setIdentificador(String parametroIdentificador) {
		this.identificador = parametroIdentificador;
	}

	/**
	 * @param parametroNome the nome to set
	 */
	public void setNome(String parametroNome) {
		this.nome = parametroNome;
	}

	/**
	 * @param parametroAnimal the animal to set
	 */
	public void setAnimal(Animal parametroAnimal) {
		this.animal = parametroAnimal;
	}
	
}
