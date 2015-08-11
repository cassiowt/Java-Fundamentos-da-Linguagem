package com.cawt.controller;

import java.util.ArrayList;
import java.util.List;

public class GerenciaAparelho<T> {
	T objeto;
	List<T> elementos = new ArrayList<T>();

	public GerenciaAparelho(T objeto) {
		this.objeto = objeto;
	}

	public T getObjeto() {
		return objeto;
	}

	public void setObjeto(T objeto) {
		this.objeto = objeto;
	}

	
	public void lista() {
		System.out.println(objeto);
	}
	
	
	public void gravaAparelho(T objeto){
		elementos.add(objeto);
	}

	public void removeAparelho(T objeto){
		elementos.remove(objeto);
	}

	public void removeTodosAparelho(){
		elementos.removeAll(elementos);
	}
	
	public void listaAparelhos() {
		for (Object o : elementos) {
			System.out.println(o);
		}
	}
	
}
