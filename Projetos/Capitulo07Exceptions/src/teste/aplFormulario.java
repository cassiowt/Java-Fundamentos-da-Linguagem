package teste;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class aplFormulario extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1909234346530653302L;
	int numero1;
	int numero2;
	int resultado;

	private JLabel jLabel1 = new JLabel("Valor 1");
	private JLabel jLabel2 = new JLabel("Valo 2");
	private JLabel jLabel3 = new JLabel("Resultado");
	
	private JTextField jTextField = new JTextField("");
	private JTextField jTextField2 = new JTextField("");
	
	private JButton jButton = new JButton("Calcular");

	public aplFormulario() {

		// Define o título da janela
		super("Exception");
		this.montaJanela();
	}

	private void montaJanela() {
		getContentPane().setLayout(null);

		jLabel1.setBounds(187, 21, 237, 14);
		this.getContentPane().add(jLabel1);
		jLabel2.setBounds(187, 66, 224, 14);
		this.getContentPane().add(jLabel2);
		jLabel3.setBounds(170, 93, 241, 26);
		this.getContentPane().add(jLabel3);
		jTextField.setBounds(47, 11, 128, 24);
		this.getContentPane().add(jTextField);
		jTextField2.setBounds(47, 50, 128, 24);
		this.getContentPane().add(jTextField2);
		jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTextLabels();
				if (testeCampoNumero1() && testeCampoNumero2()) {
					DivideDoisNumeros();
				}}
		});
		jButton.setBounds(47, 91, 96, 26);
		this.getContentPane().add(jButton);

	}

	boolean testeCampoNumero1() {
		try {
			numero1 = Integer.parseInt(jTextField.getText());
			return true;
		} catch (NumberFormatException e) {
			jLabel1.setText("Entrada Inválida. Digite numero ");
			return false;
		}
	}

	boolean testeCampoNumero2() {
		try {
			numero2 = Integer.parseInt(jTextField2.getText());
			return true;
		} catch (NumberFormatException e) {
			jLabel2.setText("Entrada Inválida. Digite numero .");
			return false;
		}
	}

	void DivideDoisNumeros() {
		try {
			resultado = numero1 / numero2;
			jLabel3.setText(String.valueOf(resultado));
		} catch (ArithmeticException e) {
			jLabel3.setForeground(Color.RED);
			jLabel3.setText("Impossivel fazer divisão com 0  " + e.getMessage());
		}

	}

	void setTextLabels() {
		jLabel1.setText("");
		jLabel2.setText("");
		jLabel3.setText("");
	}


	public static void main(String[] args) {
		aplFormulario janela = new aplFormulario();
		janela.setVisible(true);
		janela.setSize(640, 480);
		janela.getContentPane().setEnabled(false);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
