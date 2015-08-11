package com.target.dados;

import java.util.Date;

public class Consulta {
	private Date dataConsulta;
	private Boolean cacelado;
	private float numeroHoras;
	private float valorConsulta;
	private final float VALOR_HORA_CONSULTA = 65.0f;
	
	public Consulta() {
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * @return the dataConsulta
	 */
	public Date getDataConsulta() {
		return this.dataConsulta;
	}
	/**
	 * @return the cacelado
	 */
	public Boolean getCacelado() {
		return this.cacelado;
	}
	/**
	 * @param parametroDataConsulta the dataConsulta to set
	 */
	public void setDataConsulta(Date parametroDataConsulta) {
		this.dataConsulta = parametroDataConsulta;
	}
	/**
	 * @param parametroCacelado the cacelado to set
	 */
	public void setCacelado(Boolean parametroCacelado) {
		this.cacelado = parametroCacelado;
	}
	/**
	 * @return the numeroHoras
	 */
	public float getNumeroHoras() {
		return this.numeroHoras;
	}


	/**
	 * @return 0 valorConsulta com o Valor fixo da hora
	 */
	public float getValorConsulta() {
	
		valorConsulta = this.valorConsulta * this.VALOR_HORA_CONSULTA;
		
		return valorConsulta;
	}
	/**
	 * @return o valorConsulta com o Valor da Hora Informado
	 * @param valorHora
	 */
	public float getValorConsulta(float valorHora) {
		
		valorConsulta = this.valorConsulta * valorHora;
		
		return valorConsulta;
	}

	
	
	/**
	 * @param parametroNumeroHoras the numeroHoras to set
	 */
	public void setNumeroHoras(float parametroNumeroHoras) {
		this.numeroHoras = parametroNumeroHoras;
	}


	/**
	 * @param parametroValorConsulta the valorConsulta to set
	 */
	public void setValorConsulta(float parametroValorConsulta) {
		this.valorConsulta = parametroValorConsulta;
	}
	
}
