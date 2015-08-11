package com.targettrust.java;

public class Veiculo {
	static {
		System.out.println("Carregando a Classe TestaBlocoStatico");
	}

	private String nome;

	public Veiculo(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


}
