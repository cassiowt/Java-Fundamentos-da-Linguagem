package com.targettrust.apl;

import com.targettrust.java.*;

public class TesteHeranca {
	
	public static void main(String args[]) {
		Produto prod1 = new Produto();
		HerancaDVD prod2 = new HerancaDVD(); 
		
		prod1.setNome("Vinil");
		prod1.setCodigo("1");
		prod1.setPreco(78);
		
		prod2.setNome("DVD");
		prod2.setCodigo("XYZ");
		prod2.setPreco(1);
		prod2.setMaterial("Plastico");
		/*
		System.out.println("Produto gerado pela super classe Produto");
		System.out.println(prod1.getNome()+ " - " + prod1.getCodigo()+ "  Preço: R$ "+ prod1.getPreco());
		System.out.println("___________________________________________________________________");
		System.out.println("Produto gerado pela sub classe HerançaDVD");
		System.out.println(prod2.getNome()+ " - " + prod2.getCodigo()+ "  Preço: R$ "+ prod2.getPreco());
		System.out.println("Esse produto é feito de "+prod2.getMaterial());
		
		*/
		System.out.println("___________________________________________________________________");
		prod1.setFabrica("Philips");
		prod1.printFabrica();
		
		prod2.setFabrica("CEE");
		System.out.println("___________________________________________________________________");
		prod2.printFabrica();
	}
	
}

		  
