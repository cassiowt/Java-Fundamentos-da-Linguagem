package com.target.view;
import static java.lang.Math.*;
public class TestaStatic {

	public TestaStatic() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Normalmente
		System.out.println("Math.PI "+ Math.PI );
		//Usado Static no Import do Pacote Math		
		System.out.println("\n\nUsado Static no Import do Pacote Math");
		System.out.println("PI: " + PI);
		System.out.println("random(): " + random());
		System.out.println("sqrt(random()): "+sqrt(random()));
	}

}
