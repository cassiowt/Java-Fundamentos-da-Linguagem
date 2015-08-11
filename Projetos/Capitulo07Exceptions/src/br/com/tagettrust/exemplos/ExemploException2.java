package br.com.tagettrust.exemplos;

public class ExemploException2 {

	public static void calcularIR(double v) throws Exception {
		if (v < 0)
			throw new Exception("Valor inválido.");
	}

	public static void main(String[] args) throws Exception {
		try {
			calcularIR(-5);
		} catch (Exception e) {
			System.out.println("sucesso");
		} finally {
			System.out.println("Estou executando.");
		}
	}

	private void blocoTryCatch() {
		try {

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
