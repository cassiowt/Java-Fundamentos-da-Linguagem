package com.cawt.model;

import lombok.Data;

@Data
public class Tv {
	
	int tamanho;
	int canal;
	int volume;
	boolean ligada;

	public Tv() {
		// TODO Auto-generated constructor stub
	}
	
	public Tv(int tamanho, int canal, int volume, boolean ligada) {
		this.tamanho = tamanho;
		this.canal = canal;
		this.volume = volume;
		this.ligada = ligada;
	}

}
