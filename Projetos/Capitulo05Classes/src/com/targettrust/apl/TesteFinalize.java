package com.targettrust.apl;

public class TesteFinalize {

	protected void finalize() throws Throwable {
		try {
			System.out.println("Existem arquivos em memoria");
			// close() --- método para fechar arquivos
		} finally {
			super.finalize();
			System.out.println("Liberado pelo Garbage Collector.");
		}
	}

}
