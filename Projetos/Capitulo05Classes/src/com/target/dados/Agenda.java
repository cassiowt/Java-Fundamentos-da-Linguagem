package com.target.dados;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Agenda {
	private static String codigo;
	private static SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyhhmmss");
	private static Long id;
	static {
		Date dataAtual = new Date();
		codigo = sdf.format(dataAtual);
		id = Long.valueOf(codigo);
	}
	public static void main(String[] args) {
			System.out.println(codigo);
			System.out.println(id+1);
	}
}

  