package br.com.targettrust.abstrata;

public abstract class Aparelho {
	private boolean ligado;
	private int voltagem;
	private int preco;
	private String modelo;
	

	/*
	 * métodos abstratos // não possuem corpo, da mesma forma que as assinaturas
	 * de método de uma interface
	 */
	public abstract void ligar();
	public abstract void desligar();

	/*
	 * método construtor // Classes Abstratas também podem ter métodos
	 * construtores, porém, não podem ser usados para instanciar um objeto
	 * diretamente
	 */
	public Aparelho(boolean ligado, int voltagem, int preco, String modelo) {
		super();
		this.ligado = ligado;
		this.voltagem = voltagem;
		this.preco = preco;
		this.modelo = modelo;
	}
	
	

	/*
	 * métodos concretos Uma classe abstrata pode possuir métodos não abstratos
	 */
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}


	public int getVoltagem() {
		return this.voltagem;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean isLigado() {
		return ligado;
	}
	/**
	 * @return the preco
	 */
	public int getPreco() {
		return preco;
	}
	/**
	 * @param preco the preco to set
	 */
	public void setPreco(int preco) {
		this.preco = preco;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
