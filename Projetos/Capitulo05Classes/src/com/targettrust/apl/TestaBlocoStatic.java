package com.targettrust.apl;

import com.targettrust.java.Veiculo;

public class TestaBlocoStatic {
	public static void main(String[] args) {
		Veiculo p = new Veiculo("Palio");
		System.out.println(p.getNome());
		Veiculo c = new Veiculo("Corsa");
		System.out.println(c.getNome());
		Veiculo g = new Veiculo("Golf");
		System.out.println(g.getNome());
		

	}
}
