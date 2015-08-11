package com.target.dados;

import java.util.Date;

public class Cliente extends Pessoa {
	private Animal animal;
	private long saldoDivida;
	private boolean ativo;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the animal
	 */
	public Animal getAnimal() {
		return this.animal;
	}

	
	/**
	 * @param parametroCodigo
	 * @param parametroNome
	 * @param parametroSobreNome
	 * @param parametroIdentificador
	 * @param parametroDataCadastro
	 * @param parametroDataNascimento
	 * @param parametroEndereco
	 * @param parametroAnimal
	 * @param parametroSaldoDivida
	 * @param parametroAtivo
	 */
	public Cliente(long parametroCodigo, String parametroNome,
			String parametroSobreNome, String parametroIdentificador,
			Date parametroDataCadastro, Date parametroDataNascimento,
			Endereco parametroEndereco, Animal parametroAnimal,
			long parametroSaldoDivida, boolean parametroAtivo) {
		super(parametroCodigo, parametroNome, parametroSobreNome,
				parametroIdentificador, parametroDataCadastro,
				parametroDataNascimento, parametroEndereco);
		this.setAnimal(parametroAnimal); 
		this.setSaldoDivida(parametroSaldoDivida);
		this.setAtivo(parametroAtivo);
	}

	/**
	 * @return the saldoDivida
	 */
	public long getSaldoDivida() {
		return this.saldoDivida;
	}

	/**
	 * @param parametroAnimal
	 *            the animal to set
	 */
	public void setAnimal(Animal parametroAnimal) {
		this.animal = parametroAnimal;
	}

	/**
	 * @param parametroSaldoDivida
	 *            the saldoDivida to set
	 */
	public void setSaldoDivida(long parametroSaldoDivida) {
		this.saldoDivida = parametroSaldoDivida;
	}

	/**
	 * @return the ativo
	 */
	public boolean isAtivo() {
		return ativo;
	}

	/**
	 * @param parametroAtivo
	 *            the ativo to set
	 */
	public void setAtivo(boolean parametroAtivo) {
		this.ativo = parametroAtivo;
	}
	
	public String getNome(){
		String s = "Nome Cliente" + super.getNome();
		return s;
	}

	@Override
	public void setNome(String parametroNome) {
		this.nome = "Cliente: "+parametroNome;
		
	}

}
