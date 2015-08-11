package br.com.target.dados;

public class Aluno {
	String nome;

	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	
	public Aluno(String nome) {
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public  int getTotalAlunos(){
		return 10;
	}
}
