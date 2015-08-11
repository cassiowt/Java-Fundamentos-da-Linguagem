package com.target.dados;
/**
* Classe para representar um especie de Animal.
* Uma espécie deve sempre conter um nome e um código 
*  gerado através de uma regra de negócio
* @author cassio trindade
* @since 30/05/2014
* @version 1.0
*/
public class Especie {
	private String nome;
	private Integer codigoEspecie;
	/**
	 * @return o nome
	 */
	public String getNome() {
		return this.nome;
	}
	/**
	 * @return o codigoEspecie
	 */
	public Integer getCodihoEspecie() {
		return this.codigoEspecie;
	}
	/**
	 * @param o nome com o parametroNome
	 *             
	 */
	public void setNome(String parametroNome) {
		this.nome = parametroNome;
	}
	/**
	 * @param o codigoEspecie com parametroCodigoEspecie
	 *             
	 */
	public void setCodihoEspecie(Integer parametroCodigoEspecie) {
		/*
		 *  CodigoEspecie é formado com o numero de letras + 000 
		 */
		parametroCodigoEspecie = Integer.valueOf(this.nome.length() +"000");
		this.codigoEspecie = parametroCodigoEspecie;
		// esse codigo tem que ser refeito (Cássio)
	}
}
