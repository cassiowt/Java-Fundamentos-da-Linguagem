package com.targettrust.apl;

import com.targettrust.model.Animal;
import com.targettrust.model.Cliente;
import com.targettrust.model.Especie;
import com.targettrust.model.Pessoa;
import com.targettrust.valida.ValidacaoException;

/**
 * Classe de exemplo do Curso de Fundamentos Java
 * 
 * @author C�ssio Trindade
 * @since Maio/2014
 * 
 */
public class Aplicacao2 {

	public static void main(String[] args) throws ValidacaoException {
		try {
			Animal cao = new Animal("Rex", 45f, 120, true, Especie.Mam�feros);
			Cliente cliente = new Cliente(1l, "45", "Z� Ninguem", null, null,
					null);
			imprimePessoa(cliente);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void imprimePessoa(Pessoa p) {

		if (p.getAnimal() == null) {
			System.out
					.println("N�o existe animal para a imprimir relatorio de Pessoa Animal");
		} else {
			System.out.println("Cliente: " + p.getNome() + " - Identificador: "
					+ p.getIdentificador());
			System.out
					.println("Possui o animal: " + p.getAnimal().getApelido());
			System.out.println("Peso: " + p.getAnimal().getPeso() + "Kg");
			System.out.println("Altura: " + p.getAnimal().getAltura() + "cm");
			String r = p.getAnimal().isVivo() ? "SIM" : "N�O";
			System.out.println("O Animal esta Vivo:" + r);
			System.out.println("A Especie �: " + p.getAnimal().getEspecie());
		}
	}
}
