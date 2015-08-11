package br.com.targettrust.abstrata;

public class TestaEletro {
	public static void main(String[] args) {

		Util u = new Util();

		TV cce = new TV(29, 110, 1200, "Y14", "TUBO");
		TV lg = new TV(42, 110, 2100, "Bravia", "LED");
		Radio sony = new Radio(110, 300, "3X1");
		// Aparelho batedeira = new Aparelho(true, 110);

		/*
		 * chamando os métodos abstratos implementados dentro de cada classe (TV
		 * e Radio)
		 */

		cce.ligar();
		System.out.println("Aparelho CCE");
		System.out.println( cce.getCanal() + "\n" + cce.getModelo() + "\n"
				+ cce.getPreco() + "\n" + cce.getTamanho() + "\n"
				+ cce.getTipo());
		System.out.println("---------------------------------------");
		lg.ligar();
		System.out.println("Aparelho LG");
		System.out.println(lg.getCanal() + "\n" + lg.getModelo() + "\n"
				+ lg.getPreco() + "\n" + lg.getTamanho() + "\n" + lg.getTipo());
		System.out.println("---------------------------------------");
		sony.ligar();
		System.out.println("Aparelho SONY");
		System.out.println(sony.getBanda() + "\n" + sony.getModelo() + "\n" + 
		sony.getPreco() + "\n" + sony.getVoltagem());

				
		
		/*
		 * 
		 * cce.ligar(); System.out.println("Ligada a TV CCE"); u.parar(true);
		 * 
		 * sony.ligar(); System.out.println("Ligado a Radio Sony");
		 * u.parar(true);
		 * 
		 * System.out.print("Neste momento a TV está ");
		 * System.out.println(cce.isLigado() ? "ligada" : "desligada");
		 * System.out.println("No canal "+ cce.getCanal()); u.parar(true);
		 * 
		 * System.out.print("E o Rádio está ");
		 * System.out.println(sony.isLigado() ? "ligado." : "desligado em ");
		 * System.out.println(sony.getVoltagem() +" na Banda " +
		 * sony.getBanda()); System.out.println(
		 * "\n__________________________________________________\n");
		 * 
		 * System.out.println("Vamos desligar a TV"); u.parar(true);
		 * cce.desligar(); System.out.print("Neste momento a TV está ");
		 * System.out.println(cce.isLigado() ? "ligada" : "desligada");
		 * System.out.println("No canal "+ cce.getCanal());
		 * 
		 * System.out.println("Vamos desligar o Radio"); u.parar(true);
		 * sony.desligar(); System.out.print("Neste momento o Radio está ");
		 * System.out.println(sony.isLigado() ? "ligada" : "desligado");
		 */

	}
}
