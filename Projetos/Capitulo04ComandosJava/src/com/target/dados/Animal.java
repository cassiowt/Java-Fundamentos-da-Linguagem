package com.target.dados;

import java.util.ArrayList;
import java.util.Collection;


public class Animal {
	private String apelido;
	private Collection<Consulta> consultas = new ArrayList<Consulta>();
	
	
	
	/**
	 * @param parametroApelido
	 * @param parametroEspecie
	 * @param parametroPessoa
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

}
