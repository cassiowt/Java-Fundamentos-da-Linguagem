package br.com.tagettrust.exemplos;

public class ExemploException3 {

	public static double calcularIR(double v) throws Exception {
		if (v > 0) 
		 return v * 0.25;
		else			
			throw new Exception("Valor inválido.");
	}

	public static void main(String[] args) throws Exception {
		try {
			System.out.println(calcularIR(10));
		} finally {
			System.out.println("Estou executando.");
		}
	}
}
