package com.target.thread;

import java.util.ArrayList;

public class Titulo implements Runnable {

	private ArrayList<String> titulos;
	private Time time;

	public Titulo() {
		titulos = new ArrayList<String>();
	}

	public ArrayList<String> getTitulos() {
		return titulos;
	}

	public void addTitulo(String titulo) {
		titulos.add(titulo);
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	@Override
	public void run() {
		try {
			System.out.println("Time: " + this.time.getNome());
			for (int i = 0; i < titulos.size(); i++) {
				Thread.sleep(3 * 1000);
				System.out.println(titulos.get(i));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Titulo [titulos=" + titulos + ", time=" + time + "]";
	}

}
