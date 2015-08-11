package com.target.anotacao;

import java.lang.reflect.Field;

import com.target.dados.Pessoa;

public class AplAtributosAnotados {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		
		Pessoa p = new Pessoa();
		p.setSexo("M");
		p.setNome("Cassio");
		p.setSobreNome("Trindade");
		ImprimirAtributosAnotados(p);
		}

	private static void ImprimirAtributosAnotados(Pessoa obj) throws IllegalArgumentException, IllegalAccessException {

		Class cls = obj.getClass() ;
		Field[] camposDaClasse = cls.getDeclaredFields();
		for (Field campo : camposDaClasse) {
		    if (campo.isAnnotationPresent(AnotacaoPersonalizada.class)) {
		        campo.setAccessible(true);
		       System.out.println(campo.getName() + ": '"+ campo.get(obj));
		    }
		}


		
	}

}
