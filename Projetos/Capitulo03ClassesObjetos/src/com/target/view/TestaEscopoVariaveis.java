package com.target.view;

public class TestaEscopoVariaveis {
	private float preco; // escopo de classe
	/**
	 * @return o preço
	 */
	public float getPreco() {
		float x = this.preco + 5; //escopo de método
		if (x < 10) {
			@SuppressWarnings("unused")
			float y = x +  15; //escopo de bloco	 	
		}
		// return y;
		return x;
	}
	/**
	 * @param o preço com o parametroPreco 
	 */
	public void setPreco(float parametroPreco) {
		this.preco = parametroPreco;
	}  
}
