package br.com.tagettrust.exemplos;

public class ExemploExceptionPersonalizada extends Exception {

	public ExemploExceptionPersonalizada(String parametroMessage) {
		super(parametroMessage);
	}

	public static void testaArgumento(int indice, String strvet[])
			throws ExemploExceptionPersonalizada {
		try {
			String str = strvet[indice];
			System.out.println(str);
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new ExemploExceptionPersonalizada("# elementos incorretos!");
		}
	}

	public static void main(String[] args) {
		try {
			String[] str ={"a","2"};
			testaArgumento(-1, str);
		} catch (ExemploExceptionPersonalizada e) {
			System.out.println(e.getMessage());
		}
	}
}
