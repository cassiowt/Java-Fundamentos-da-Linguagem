package br.com.target.dados;

public class Aplicacao {

	public static void main(String[] args) {
		Loja loja = new Loja();
		loja.setNomeLoja("GrandeCoisas");
		
		Cliente c1 = new Cliente("Pedro", "Pedrinho", 1996);
		Cliente c2 = new Cliente("Paulo", "Pimentinha", 1980);
		Cliente c3 = new Cliente("Altemar", "Tonho", 1975);
		
		loja.adiciona(c1);
		loja.adiciona(c2);
		loja.adiciona(c3);
		
		loja.imprimeClientes();
	}
	
}
