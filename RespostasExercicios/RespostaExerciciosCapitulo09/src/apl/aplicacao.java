package apl;

import java.util.ArrayList;

import controller.JDBCClienteDao;
import model.Cliente;

public class aplicacao {

	public static void main(String[] args) {
		// gravarCliente();
		// consultarCliente(1l);
		 excluirCliente(3l);
		listarClientes();
	}

	private static void listarClientes() {
		try {
			JDBCClienteDao op = new JDBCClienteDao();
			ArrayList<Cliente> clientes = (ArrayList<Cliente>) op.listar();
			if (clientes.size() > 0) {
				System.out.println("LISTA DE CLIENTES");
				System.out
						.println("____________________________________________________");
				for (Cliente cliente : clientes) {
					System.out.println(cliente);
			}
			} else {
				System.out.println("NÂO EXISTEM CLIENTES PARA LISTAR");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void excluirCliente(long id) {
		try {
			JDBCClienteDao op = new JDBCClienteDao();
			Cliente c = op.consultar(id);
			if (c != null) {
				op.excluir(c);
				System.out.println("EXCLUIDO O CLIENTE: " + c);
			} else {
				System.out.println("NÂO EXISTE CLIENTE PARA EXCLUIR");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void consultarCliente(long id) {
		try {
			JDBCClienteDao op = new JDBCClienteDao();
			Cliente c = op.consultar(id);

			if (c != null) {
				System.out.println("O CLIENTE CONSULTADO: " + c);
			} else {
				System.out.println("NÂO EXISTE CLIENTE PARA ESSE ID");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void gravarCliente() {

		try {

			Cliente c = new Cliente(0, "Pedro Trindade", "456789456794");
			JDBCClienteDao op = new JDBCClienteDao();
			op.gravar(c);
			System.out.println("CLIENTE: " + c + " GRAVADO com sucesso");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
