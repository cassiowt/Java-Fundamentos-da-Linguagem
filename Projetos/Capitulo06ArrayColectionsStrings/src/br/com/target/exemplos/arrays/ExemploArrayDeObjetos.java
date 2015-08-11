package br.com.target.exemplos.arrays;

import br.com.target.dados.Cliente;
import br.com.target.dados.Loja;

public class ExemploArrayDeObjetos {

	public static void main(String[] args) {

		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		Cliente c3 = new Cliente();
		Cliente c4 = new Cliente();
		
		Loja loja = new Loja();

		c1.setNome("Cassio");
		c2.setNome("Andre");
		c3.setNome("Gabriela");
		c4.setNome("Andre");
		
		c1.setApelido("General");
		c2.setApelido("Major");
		c3.setApelido("Gabiju");
		c4.setApelido("CAbo");
		
		c1.setAnoNascimento(1970);
		c2.setAnoNascimento(1995);
		c3.setAnoNascimento(2005);
		c4.setAnoNascimento(2003);
		
		loja.setNomeLoja("Loja Pupuruca");
		loja.adiciona(c1);
		loja.adiciona(c2);
		loja.adiciona(c3);
		loja.adiciona(c4);
		

		loja.imprimeClientes();

	}
}
