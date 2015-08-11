package com.targettrust.apl;

import com.targettrust.java.*;

public class TestaCliente {
	public static void main(String[] args) {
		criaEndereco2();
	}

	private static void CriaEndereco() {

		ClienteDB cli = new ClienteDB();
		EnderecoDB end = new EnderecoDB();
		EnderecoDB end2 = new EnderecoDB();
		EnderecoDB end3 = new EnderecoDB();

		end.setNomeRua("Rua Frei Clemente");
		end.setNumero(6);
		end.setCidade("Porto Alegre");

		end2.setNomeRua("Rua Gomes Jardim");
		end2.setNumero(259);
		end2.setCidade("Porto Alegre");

		end3.setNomeRua("Rua São Frnacisco da California");
		end3.setNumero(23);
		end3.setCidade("Porto Alegre");

		cli.setId(1);
		cli.setNome("cassio");
		cli.setEndereco(end);
		cli.setEndereco(end2);
		cli.setEndereco(end3);

		System.out.println("Cliente: " + cli.getNome());
		System.out.println("Endereços:");
		for (int i = 0; i < cli.getEndereco().size(); i++) {
			System.out.println(cli.getEndereco().get(i).getNomeRua() + ", "
					+ cli.getEndereco().get(i).getNumero() + " - Cidade: "
					+ cli.getEndereco().get(i).getCidade());
		}
	}

	private static void criaEndereco2() {

		ClienteDB cli = new ClienteDB("André Wailer", 1); 
		
		EnderecoDB end = new EnderecoDB("Rua dos Gatos", 1, "Porto Alegre");
		
		System.out.println(end.getCidade());
	
		cli.setEndereco(end);
		
		System.out.println("Cliente: " + cli.getNome());
		System.out.println("Endereços:");
		for (int i = 0; i < cli.getEndereco().size(); i++) {
			System.out.println(cli.getEndereco().get(i).getNomeRua() + ", "
					+ cli.getEndereco().get(i).getNumero() + " - Cidade: "
					+ cli.getEndereco().get(i).getCidade());
		}
	}

}
