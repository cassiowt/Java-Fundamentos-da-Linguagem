package br.com.tagettrust.exemplos;

public class ExemploTradicional {
	public int lerArquivo() {
		  int codigoErro = 0;
		  abrirArquivo();
		  if (erroAberturaArquivo()) {
			codigoErro = -1;
		  } else {
		     lerArquivo();
		      if (erroLeituraArquivo()) {
			  codigoErro = -2;
		      }
		      fecharArquivo();
		      if (erroFechamentoArquivo()) {
		         codigoErro = -3;
		      }
		  } 
		  return codigoErro;
		}

	private boolean erroFechamentoArquivo() {
		// TODO Auto-generated method stub
		return false;
	}

	private void fecharArquivo() {
		// TODO Auto-generated method stub
		
	}

	private boolean erroLeituraArquivo() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean erroAberturaArquivo() {
		// TODO Auto-generated method stub
		return false;
	}

	private void abrirArquivo() {
		// TODO Auto-generated method stub
		
	} 	
}
