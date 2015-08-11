package com.target.testarcomandos;

public class Rascunho {

	public static void main(String[] args) {
		testaContinue();

	}

	public static void testaContinue() {
	    forExterno:
		for (int i = 0; i < 10; i++) {
			//forExterno:
			for (int j = 0; j < 10; j++) {

				System.out.println(i * j);
				if (i * j >= 20) {
					continue forExterno;
				}
			}
		}
	}
}
