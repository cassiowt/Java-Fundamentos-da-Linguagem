package com.targettrust.model;
/**
 * Classe de exemplo do Curso de Fundamentos Java 
 * @author Cássio Trindade
 * @since Maio/2014
 * 
 */
public class Animal {
	private String apelido;
	private float peso;
	private int altura;
	private boolean vivo;

	public Animal() {
	}

	/**
	 * @param parametroApelido
	 * @param parametroPeso
	 * @param parametroAltura
	 * @param parametroVivo
	 */
	public Animal(String parametroApelido, float parametroPeso,
			int parametroAltura, boolean parametroVivo) {
		this.apelido = parametroApelido;
		this.setPeso(parametroPeso);
		this.setAltura(parametroAltura);
		this.vivo = parametroVivo;
	}

	/**
	 * @return the apelido
	 */
	public String getApelido() {
		return this.apelido;
	}

	/**
	 * @return the peso
	 */
	public float getPeso() {
		return this.peso;
	}

	/**
	 * @return the altura
	 */
	public int getAltura() {
		return this.altura;
	}

	/**
	 * @return the vivo
	 */
	public boolean isVivo() {
		return this.vivo;
	}

	/**
	 * @param parametroApelido the apelido to set
	 */
	public void setApelido(String parametroApelido) {
		this.apelido = parametroApelido;
	}

	/**
	 * @param parametroPeso the peso to set
	 */
	public void setPeso(float parametroPeso)
	{
		if (parametroPeso > 0 &&  parametroPeso < 200 ) {
			this.peso = parametroPeso;	
		}else{
			System.err.println("Peso Invalido tem que estar entre 1 e 200kg");
		}
		
	}

	/**
	 * @param parametroAltura the altura to set
	 */
	public void setAltura(int parametroAltura) {
		if (parametroAltura > 0 ) {
			this.altura = parametroAltura;	
		}else{
			System.err.println("Altura Invalido tem que ser maior que 0cm");
		}
		
		
	}

	/**
	 * @param parametroVivo the vivo to set
	 */
	public void setVivo(boolean parametroVivo) {
		this.vivo = parametroVivo;
	}
	
	
}
