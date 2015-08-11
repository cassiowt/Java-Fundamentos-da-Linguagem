package com.target.dados;

import java.util.Date;

public class Consulta {
	private Date dataConsulta;
	private Boolean cacelado;
	
	public Consulta() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param parametroDataConsulta
	 * @param parametroCacelado
	 */
	public Consulta(Date parametroDataConsulta, Boolean parametroCacelado) {
		this.dataConsulta = parametroDataConsulta;
		this.cacelado = parametroCacelado;
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
	
}
