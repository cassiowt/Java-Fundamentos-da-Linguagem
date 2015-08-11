package com.targettrust.java;

public class Carro {

	static {
		System.out.println("Carregando a classe carro.");
		
	}

	private String nome;

	public Carro(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public static void main(String args[]) {
		Carro p = new Carro("PALIO");
		Carro c = new Carro("CORSA");
		Carro g = new Carro("GOLF");
	}
}
