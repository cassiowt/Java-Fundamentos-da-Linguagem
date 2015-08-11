package com.target.dados;

import java.util.ArrayList;
import java.util.Collection;


public class Animal {
	private int id;
	private String apelido;
	private TipoAnimal tipoanimal;
	private Collection<Consulta> consultas = new ArrayList<Consulta>();
	
	public Animal() {
	}
		
	/**
	 * @param parametroId
	 * @param parametroApelido
	 * @param parametroConsultas
	 */
	public Animal(int parametroId, String parametroApelido,
			Collection<Consulta> parametroConsultas) {
		this.id = parametroId;
		this.apelido = parametroApelido;
		this.consultas = parametroConsultas;
	}
	/**
	 * @param parametroId
	 * @param parametroApelido
	 */
	public Animal(int parametroId, String parametroApelido){
		this.id = parametroId;
		this.apelido = parametroApelido;
	}
	/**
	 * @param parametroApelido
	 */
	public Animal(String parametroApelido ) {
		this.apelido = parametroApelido;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	/**
	 * @return the consultas
	 */
	public Collection<Consulta> getConsultas() {
		return this.consultas;
	}

	/**
	 * @param parametroConsultas the consultas to set
	 */
	public void setConsultas(Collection<Consulta> parametroConsultas) {
		this.consultas = parametroConsultas;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param parametroId the id to set
	 */
	public void setId(int parametroId) {
		this.id = parametroId;
	}

	/**
	 * @return the tipoanimal
	 */
	public TipoAnimal getTipoanimal() {
		return tipoanimal;
	}

	/**
	 * @param parametroTipoanimal the tipoanimal to set
	 */
	public void setTipoanimal(TipoAnimal parametroTipoanimal) {
		this.tipoanimal = parametroTipoanimal;
	}

}
