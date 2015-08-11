package com.target.dados;

public class Funcionario extends Pessoa {
	protected long salario;
	private String cargo;
	private Funcionario gerente;

	/**
	 * @return the salario
	 */
	public long getSalario() {
		return this.salario;
	}

	/**
	 * @return the cargo
	 */
	public String getCargo() {
		return this.cargo;
	}

	/**
	 * @return the gerente
	 */
	public Funcionario getGerente() {
		return this.gerente;
	}

	/**
	 * @param parametroSalario
	 *            the salario to set
	 */
	public final void setSalario(long parametroSalario) {
		this.salario = parametroSalario;
	}

	/**
	 * @param parametroCargo
	 *            the cargo to set
	 */
	public void setCargo(String parametroCargo) {
		this.cargo = parametroCargo;
	}

	/**
	 * @param parametroGerente
	 *            the gerente to set
	 */
	public void setGerente(Funcionario parametroGerente) {
		this.gerente = parametroGerente;
	}

	@Override
	public void setNome(String parametroNome) {
		// TODO Auto-generated method stub
		
	}

}
