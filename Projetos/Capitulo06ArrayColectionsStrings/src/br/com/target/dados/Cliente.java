package br.com.target.dados;

public class Cliente {
	private String nome, apelido;
	private int anoNascimento;

	public Cliente() {

	}

	/**
	 * @param parametroNome
	 */
	public Cliente(String parametroNome) {
		this.nome = parametroNome;
	}
	
	/**
	 * @param parametroNome
	 * @param parametroApelido
	 */
	public Cliente(String parametroNome, String parametroApelido) {
		this.nome = parametroNome;
		this.apelido = parametroApelido;
	}

	
	
	/**
	 * @param parametroNome
	 * @param parametroApelido
	 * @param parametroAnoNascimento
	 */
	public Cliente(String parametroNome, String parametroApelido,
			int parametroAnoNascimento) {
		this.nome = parametroNome;
		this.apelido = parametroApelido;
		this.anoNascimento = parametroAnoNascimento;
	}

	/**
	 * 
	 * @return Nome do Cliente
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * 
	 * @param nome
	 *            define o cliente
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * 
	 * @return busca o apelido do cliente
	 */
	public String getApelido() {
		return apelido;
	}

	/**
	 * 
	 * @param apelido
	 *            do cliente define
	 */
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	/**
	 * 
	 * @return retorna ano de nascimento
	 */
	public int getAnoNascimento() {
		return anoNascimento;
	}

	/**
	 * 
	 * @param anoNascimento
	 *            define o ano de nascimento
	 */
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

}
