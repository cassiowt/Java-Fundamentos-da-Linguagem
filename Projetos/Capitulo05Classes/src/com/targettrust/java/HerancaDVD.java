package com.targettrust.java;

public class HerancaDVD extends Produto {

	String material;

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getPreco() {
		return preco + 200;
	}

	public void printFabrica() {
		super.printFabrica();
		System.out.println("E vendido por: "+getFabrica());
		
	}

}
