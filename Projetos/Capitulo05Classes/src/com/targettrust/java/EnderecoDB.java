package com.targettrust.java;

public class EnderecoDB {
	private String nomeRua;
	private int numero;
	private String cidade;

	/**
	 * @return the nomeRua
	 */

	public EnderecoDB() {
	}

	public EnderecoDB(String nomeRua, int numero, String cidade) {
		super();
		this.nomeRua = nomeRua;
		this.numero = numero;
		this.cidade = cidade;
	}

	public String getNomeRua() {
		return nomeRua;
	}

	/**
	 * @param nomeRua
	 *            the nomeRua to set
	 */
	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * @param cidade
	 *            the cidade to set
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
