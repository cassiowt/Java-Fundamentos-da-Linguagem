package com.target.model;

public class ClassePublica {
	public void relatorio() {
		System.out.println("------> TestaClassePublica");
	}
	
	public static void main(String[] args) {
		ClasseUm imp1 = new ClasseUm();
		imp1.relatorio();
		ClasseDois imp2 = new ClasseDois();
		imp2.relatorio();
	}
}

class ClasseUm {
	public void relatorio() {
		System.out.println("------> ClasseUm");
	}
}

class ClasseDois {
	public void relatorio() {
		System.out.println("------> ClasseDois");
	}
}
