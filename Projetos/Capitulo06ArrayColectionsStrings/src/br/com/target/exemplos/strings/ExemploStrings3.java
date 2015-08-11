package br.com.target.exemplos.strings;

public class ExemploStrings3 {
	public static void main(String[] args) {
		String s = " textos ";
		Integer i = 1;
		Float f = 2.0f;
		Double d = 2.0d;
		Boolean b = true;
		Character c = '\u0212'; //?

		System.out.printf(" podemos trocar os %s: %d %f %2f %b %c ",s,i,f,d,b,c);
			}
}

/*
* %s	representa strings
* %d	representa números inteiros
* %f	representa números floats
* %2f	representa números doubles
* %b	representa valores booleanos
* %c	representa valores char

*/
