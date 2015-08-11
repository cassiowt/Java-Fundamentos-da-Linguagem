package com.targettrust.java;

public class Produto {

	String nome, codigo, fabrica ; 
	int preco;
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getPreco() {
		return preco + 100;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	public String getFabrica() {
		return fabrica;
	}
	
	public void setFabrica(String fabrica) {
		this.fabrica = fabrica;
	}

	public  void printFabrica() {
		System.out.println( "Esse produto é Fabricado por: "+ fabrica );
	}

}
