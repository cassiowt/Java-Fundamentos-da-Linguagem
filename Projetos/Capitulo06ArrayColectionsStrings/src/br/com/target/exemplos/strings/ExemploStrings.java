package br.com.target.exemplos.strings;

public class ExemploStrings {
	private String codigo;
	private String nome;

	public ExemploStrings(String codigo, String nome) {
		setCodigo(codigo);
		setNome(nome);
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	/*
	 * Realizando Override sobre o método toString() (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		//return "Codigo: "+getCodigo() + " - Nome: " + getNome();
		return getCodigo() + " - " + getNome();
	}

	/*
	 * Quando mandamos imprimir o objeto Animal instanciado da classe
	 * ExemploString, Como sobrescrevemos o método toString, o resultado deste
	 * Método é que será impresso.
	 */
	public static void main(String[] args) {
		ExemploStrings animal = new ExemploStrings("1", "Cachorro");
		System.out.println(animal);
	}
}
