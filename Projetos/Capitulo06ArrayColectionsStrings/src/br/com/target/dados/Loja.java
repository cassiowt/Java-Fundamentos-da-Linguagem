package br.com.target.dados;

import java.util.ArrayList;

public class Loja {
	private ArrayList<Cliente> clientesLoja;
	String nomeLoja;

	public Loja() {
		clientesLoja = new ArrayList<Cliente>();
	}

	/**
	 * 
	 * @return Clientes da Loja
	 */
	public ArrayList<Cliente> getClientesLoja() {
		return clientesLoja;
	}

	/**
	 * 
	 * @param c
	 *            clientes da Loja
	 */
	public void adiciona(Cliente c) {
		clientesLoja.add(c);
		// System.out.println("Adicionado o Cliente: " + c.getNome());
	}

	/**
	 * 
	 * @return Nome da Loja
	 */
	public String getNomeLoja() {
		return nomeLoja;
	}

	/**
	 * 
	 * @param nomeLoja
	 *            define o Nome da Loja
	 */
	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}

	/**
	 * Imprime relatorio de clientes da Loja
	 */
	public void imprimeClientes() {
		System.out.println(getNomeLoja());
		System.out.println("_________________________________");
		for (Cliente c : clientesLoja)
			System.out.println(c.getNome() + " -- " + c.getApelido() + " -- "
					+ c.getAnoNascimento());
		System.out.println("_________________________________");
		System.out.println("Total de clientes é:" + clientesLoja.size());
	}

}
