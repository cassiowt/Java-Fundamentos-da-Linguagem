package com.target.dados;

public enum TipoAnimal {
	Anfíbios(1, 0), Mamíferos(1, 0), Vertebrados(1, 0), Peixes(1, 0), Répteis(
			1, 0), Invertebrados(1, 0), Aves(1, 0);

	private int tamanhoMaximo;
	private int tamanhoMinimo;

	/**
	 * @param parametroTamanhoMaximo
	 * @param parametroTamanhoMinimo
	 */
	private TipoAnimal(int parametroTamanhoMaximo, int parametroTamanhoMinimo) {
		this.tamanhoMaximo = parametroTamanhoMaximo;
		this.tamanhoMinimo = parametroTamanhoMinimo;
	}

	/**
	 * @return the tamanhoMaximo
	 */
	public int getTamanhoMaximo() {
		return tamanhoMaximo;
	}

	/**
	 * @param parametroTamanhoMaximo
	 *            the tamanhoMaximo to set
	 */
	public void setTamanhoMaximo(int parametroTamanhoMaximo) {
		this.tamanhoMaximo = parametroTamanhoMaximo;
	}

	/**
	 * @return the tamanhoMinimo
	 */
	public int getTamanhoMinimo() {
		return tamanhoMinimo;
	}

	/**
	 * @param parametroTamanhoMinimo
	 *            the tamanhoMinimo to set
	 */
	public void setTamanhoMinimo(int parametroTamanhoMinimo) {
		this.tamanhoMinimo = parametroTamanhoMinimo;
	}

}
