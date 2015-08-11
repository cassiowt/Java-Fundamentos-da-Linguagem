package com.target.view;

public class TestaPassandoTiposPrimitivosparaMetodos {
	public static void main(String[] args) {
		int preco = 100;
		calcula(preco);
		System.out.println("preço = " + preco);
	}
	public static void calcula(int arg) {
		   if(arg > 0 && arg < 2000) 
		      arg = 55;
		   System.out.println("arg = " + arg);
		}
}
