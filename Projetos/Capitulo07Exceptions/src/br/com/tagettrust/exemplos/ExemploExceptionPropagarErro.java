package br.com.tagettrust.exemplos;

public class ExemploExceptionPropagarErro {
	/**
	 * @author cassio
	 * @since junho/2014 Exemplo de propagação de erro
	 */
	public static void main(String[] args) {
		try {
			metodo1();
			// converteStringNumero("1");
			// testaAluno();

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static void metodo1() throws Exception {
		metodo2();
	}

	public static void metodo2() throws Exception {
		metodo3();
	}

	public static void metodo3() throws Exception {

		int resultado = 3 / 0;
		System.out.println("**----------------> " + resultado);
	}

	private static void converteStringNumero(String str)
			throws NumberFormatException {
		int num;
		try {
			System.out.println("String lida: " + str);
			num = Integer.parseInt(str);
			System.out.println("Numero: " + num);
		} finally {
			System.out.println("Bloco finally método converteStringNumero.");
		}
		System.out.println("Encerrando método se Exception");
	}

	public static void testaAluno() throws Exception {
		Aluno a = new Aluno("cassio andre ", -1);
		System.out.println("Aluno OK");
		;
	}
}
