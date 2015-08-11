package br.com.target.dados;

import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings("rawtypes")
public class ColecaoGenerica<T> {

	private ArrayList elementos;

	public ColecaoGenerica() {
		elementos = new ArrayList();
	}

	@SuppressWarnings("unchecked")
	public void add(T obj) {
		elementos.add(obj);
	}

	public void remove(T obj) {
		elementos.remove(obj);
	}

	public void lista() {
		String s = "";
		Iterator it = elementos.iterator();
		while (it.hasNext()) {
			s = s + (String) it.next() + ",";
		}
		System.out.println(s);
	}
}
