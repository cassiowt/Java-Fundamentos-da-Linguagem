package com.targettrust.apl;

import com.targettrust.java.*;

public class TestaOverload {

	public static void main(String[] args) {
		TestaCalcula();
		//SobrecargaCliente();
		//CriaCliente();
	}

	private static void TestaCalcula() {

		Calcula calcula = new Calcula();

		System.out.println(" Resultado  ---- > " + calcula.calculo(33));
		System.out.println("_______________________________________________ ");
		System.out.println(" Resultado ---- > " + calcula.calculo(22.22));
		System.out
				.println("_______________________________________________\n ");

		//calcula.testa();
	}

	/*public static void SobrecargaCliente() {

		// Teste de Overload Separado.
		System.out.println("Teste de Overload Separado.");
		System.out.println("---------------------------");
		ClienteDB cliente = new ClienteDB();
		
		cliente.lista("Cássio Trindade");
		cliente.lista(1222);
		cliente.lista("Cassio Trindade", 1222);

	}
	
	private static void CriaCliente() {
 		ClienteDB c1 = new ClienteDB();

 		c1.setId(12);
 		c1.setNome("Cassio");
 		
		c1.lista(c1.getNome(),c1.getId());
	}

	private static void CriaCliente2() {
 		ClienteDB c1 = new ClienteDB();

 		c1.setId(12);
 		c1.setNome("Cassio");
 		
		c1.lista(c1.getNome(),c1.getId());
	}
*/
}
