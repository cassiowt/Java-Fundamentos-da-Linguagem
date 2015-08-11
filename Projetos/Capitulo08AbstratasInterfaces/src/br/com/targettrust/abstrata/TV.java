package br.com.targettrust.abstrata;

public class TV extends Aparelho {
	private int tamanho;
	private int canal;
	private int volume;
	private String tipo;

	/// construtor classe abstrata
	public TV(int tamanho, int voltagem, int preco, String modelo, String tipo) {
		super(false, voltagem, preco, modelo);
		this.tamanho = tamanho;
		this.canal = 0;
		this.volume = 0;
		this.tipo = tipo;
	}

	/* implementação dos métodos abstratos */
	public void desligar() {
		super.setLigado(false);
		mudarCanal(getCanal() - getCanal());
		setVolume(0);
	}

	public void ligar() {
		super.setLigado(true);
		mudarCanal(3);
		setVolume(25);
	}

	private void setVolume(int i) {
		this.volume = i;
	}

	private void mudarCanal(int i) {
		this.canal = i;
	}

	/**
	 * @return the canal
	 */
	public int getCanal() {
		return canal;
	}

	/**
	 * @return the tamanho
	 */
	public int getTamanho() {
		return tamanho;
	}

	/**
	 * @return the volume
	 */
	public int aumentarVolume() {
		return volume + 1;
	}

	public int diminuirVolume() {
		return volume - 1;
	}

	/**
	 * @param tamanho the tamanho to set
	 */
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
}