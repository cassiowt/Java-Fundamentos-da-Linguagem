package teste;

import javax.swing.JOptionPane;

public class aplTeste {

	public static void main(String[] args) {

		try {
			int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,
					" Digite um numero: "));
			int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,
					" Digite outro numero: "));

			int resultado = numero1 / numero2;

			JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Insira Numeros");
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null,
					"Impossivel fazer divisão com 0  "+e.getMessage());
		}

	}
}
