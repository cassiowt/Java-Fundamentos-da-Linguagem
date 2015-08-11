package com.cawt.model;

import lombok.Data;

@Data
public class Radio {
	public static int AM = 1;
	public static int FM = 2;
	private float frequencia;
	private int volume;
	private int banda;

	public Radio() {
		// TODO Auto-generated constructor stub
	}
	
	public Radio(float frequencia, int volume, int banda) {
		super();
		this.frequencia = frequencia;
		this.volume = volume;
		this.banda = banda;
	}
	
	
}
