package com.target.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.lang.model.element.Modifier;

import com.target.dados.Animal;

@SuppressWarnings("rawtypes")
public class InformacoesClasse {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
	//	ConstrutorArgumentosAtributos();
	//	AtributosModificadores();
		Metodos();
	//	MetodosAnotacao();
	//  InvocarMetodo();
	}

	private static void InvocarMetodo() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		Class<?> c1 = null;
		Method   metodo = null;
		Class[]  paramTypes= new Class[]{String.class};
		Object[] attValue =  new Object[]{"Metodo chamado por reflexão"};
		try {
			c1 = Class.forName("com.target.dados.Animal");
			metodo = c1.getMethod("metodoInutil",paramTypes);
			metodo.invoke(c1.newInstance(), attValue);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void MetodosAnotacao() {
		//Class<?> c1 = null;
		Class<Animal> c1 = Animal.class;
		try {
		//	c1 = Class.forName("com.target.dados.Animal");
			for (Method mt: c1.getDeclaredMethods()) {
				System.out.println("Nome do Metodo: "+mt.getName());
				for (Annotation an : mt.getDeclaredAnnotations()) {
					System.out.println("\tAnotação: " + an.annotationType().toString());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void Metodos() {
		Class<Animal> c1 = Animal.class;
		//Class<?> c1 = null;
		try {
			//c1 = Class.forName("com.target.dados.Pessoa");
			for (Method c: c1.getDeclaredMethods()) {
				System.out.println("Nome do Metodo: "+c.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void AtributosModificadores() {
		Class<?> c1 = null;
		try {
			c1 = Class.forName("com.target.dados.Pessoa");
			for (Field c : c1.getDeclaredFields()) {
				switch (c.getModifiers()) {
				case java.lang.reflect.Modifier.PUBLIC:
					System.out.println(Modifier.PUBLIC + " "
							+ c.getType().getSimpleName() + " " + c.getName());
					break;
				case java.lang.reflect.Modifier.PRIVATE:
					System.out.println(Modifier.PRIVATE + " "
							+ c.getType().getSimpleName() + " " + c.getName());
					break;
				case java.lang.reflect.Modifier.PROTECTED:
					System.out.println(Modifier.PROTECTED + " "
							+ c.getType().getSimpleName() + " " + c.getName());
					break;
				default:
					break;
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	private static void ConstrutorArgumentosAtributos() {
		Class<?> c1 = null;
		try {
			c1 = Class.forName("com.target.dados.Pessoa");
			for (Constructor<?> c : c1.getDeclaredConstructors()) {
				System.out.println("Construtores da Classe: " + c.getName());

				for (Class<?> attType : c.getParameterTypes()) {
					System.out.println("\t  Argumento: "
							+ attType.getSimpleName());
				}
			}
			System.out.println("Nome Atributos___");
			for (Field i : c1.getDeclaredFields()) {
				System.out.println(i.getName());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

// com.oracle.jrockit.jfr.ContentType.class
// java.lang.Exception.class
// com.target.dados.Pessoa.java