package com.target.thread;

public  class Time implements Runnable {

	private int id;
	private String nome;

	public Time() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}

	public  void setId(int id) {
		this.id = id;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i + " TIME [id=" + id + ", nome=" + nome + "]");
		}
	}

}
