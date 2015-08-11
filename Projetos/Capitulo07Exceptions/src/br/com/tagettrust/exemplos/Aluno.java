package br.com.tagettrust.exemplos;

public class Aluno {
	String nome;
	int codigo;

	public Aluno(String nome, int codigo) throws Exception {
		this.setNome(nome);
		this.setCodigo(codigo);
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
		public void setCodigo(int codigo) throws Exception{
		if (codigo < 0)
			throw new Exception("Código inválido.");
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception {
	if (nome.length() < 11)
		throw new Exception("Nome Invalido.");
		this.nome = nome;
	
}
}
