package com.target.dados;

public class Vendedor extends Funcionario {
	private float comissao;

	/**
	 * @return the comissao
	 */
	public float getComissao() {
		return comissao;
	}

	/**
	 * @param parametroComissao the comissao to set
	 */
	public void setComissao(float parametroComissao) {
		this.comissao = parametroComissao;
	}
	
    public float calcularSalario() {
        float total = salario + comissao;
        return total;
    }
}
