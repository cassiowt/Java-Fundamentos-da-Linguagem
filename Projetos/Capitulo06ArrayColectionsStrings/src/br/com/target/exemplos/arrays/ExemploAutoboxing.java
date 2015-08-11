package br.com.target.exemplos.arrays;

import java.util.ArrayList;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class ExemploAutoboxing {

	public static void main(String[] args) {
		//semAoutoboxing();
		//testaAutoboxing1();
		//comparandoValor();
		comparandoValor1();
	}
	
	public static void semAoutoboxing() {
		ArrayList lista = new ArrayList();
		// Criando os objetos
		Integer um = new Integer(1);
		Integer dois = new Integer(2);
		Integer tres = new Integer(3);
		// Adicionando os objetos a Collection
		lista.add(um);
		lista.add(dois);
		lista.add(tres);
		// Mostra os dados da collection
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
		System.out.println(lista.get(2));
	}

	/**
	 * Exemploda utilização de Autoboxing
	 */
	public static void testaAutoboxing1() {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		// Adicionando dados a Collection
		lista.add(1);
		lista.add(2);
		lista.add(3);
		// Retira os objetos da coleção
		Integer x = (Integer) lista.get(0);
		Integer y = (Integer) lista.get(1);
		Integer z = (Integer) lista.get(2);

		// Mostrar os valores em formato int
		System.out.println(x.intValue());
		System.out.println(y.intValue());
		System.out.println(z.intValue());
	}
	public static void testaAutoboxing() {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		// Adicionando dados a Collection
		lista.add(1);
		lista.add(2);
		lista.add(3);
		// Retira os dados da collection
		int x = lista.get(0);
		int y = lista.get(1);
		int z = lista.get(2);
		// Mostra os dados da collection
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

	public static void comparandoValor(){
		int i = 2;
		int j = 2;
		       
		ArrayList <Integer> lista = new ArrayList<Integer>();
		        
		lista.add(i);
		lista.add(j);
		        
		System.out.println( (i==j) );
		System.out.println( lista.get(0)==lista.get(1) );
		System.out.println( lista.get(0).equals( lista.get(1) ) );

	}
	public static void comparandoValor1(){
		int i = 225;
		int j = 225;
		       
		ArrayList <Integer> lista = new ArrayList<Integer>();
		        
		lista.add(i);
		lista.add(j);
		        
		System.out.println( (i==j) );
		System.out.println( lista.get(0)==lista.get(1) );
		System.out.println( lista.get(0).equals( lista.get(1) ) );

	}
}
