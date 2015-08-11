package com.target.testarcomandos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuComandos extends JFrame {

	private static final long serialVersionUID = -8319350365370456680L;

	// private FlowLayout layout = new FlowLayout();
	// private JPanel panel = new JPanel();
	private JLabel jLabel1 = new JLabel("If Simples");
	private JButton button1 = new JButton("Executar");
	private JLabel jLabel2 = new JLabel("Operador Ternario");
	private JButton button2 = new JButton("Executar");
	private JLabel jLabel3 = new JLabel("Swith Case I");
	private JButton button3 = new JButton("Executar");
	private JLabel jLabel4 = new JLabel("Swith Case II");
	private JButton button4 = new JButton("Executar");
	private JLabel jLabel5 = new JLabel("Swith Case III");
	private JButton button5 = new JButton("Executar");
	private JLabel jLabel6 = new JLabel("While");
	private JButton button6 = new JButton("Executar");
	private JLabel jLabel7 = new JLabel("Do While");
	private JButton button7 = new JButton("Executar");
	private JLabel jLabel8 = new JLabel("For");
	private JButton button8 = new JButton("Executar");
	private JLabel jLabel9 = new JLabel("For Each I");
	private JButton button9 = new JButton("Executar");
	private JLabel jLabel10 = new JLabel("For Each II");
	private JButton button10 = new JButton("Executar");
	private JLabel jLabel11 = new JLabel("Breack");
	private JButton button11 = new JButton("Executar");
	private JLabel jLabel12 = new JLabel("Continue");
	private JButton button12 = new JButton("Executar");
	
	public MenuComandos() {
		super("Menu Comandos Java");
		// panel.setLayout(null);
		getContentPane().setLayout(null);
		// getContentPane().setEnabled(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(jLabel1);
		jLabel1.setBounds(10, 10, 114, 23);
		add(button1);
		button1.setBounds(180, 10, 114, 23);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ClasseTeste.TestarIfElse();
				} catch (Exception e) {
					System.out.println("saída errada " + e.getMessage());
				}
				;
			}
		});

		add(jLabel2);
		jLabel2.setBounds(10, 40, 114, 23);
		add(button2);
		button2.setBounds(180, 40, 114, 23);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ClasseTeste.TestarIfElse2();
				} catch (Exception e) {
					System.out.println("saida errada " + e.getMessage());
				}
				;
			}
		});

		add(jLabel3);
		jLabel3.setBounds(10, 70, 114, 23);
		add(button3);
		button3.setBounds(180, 70, 114, 23);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ClasseTeste.TestarSwitch();
					;
				} catch (Exception e) {
					System.out.println("saida errada " + e.getMessage());
				}
				;
			}
		});

		add(jLabel4);
		jLabel4.setBounds(10, 100, 114, 23);
		add(button4);
		button4.setBounds(180, 100, 114, 23);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ClasseTeste.TestarSwitch1();
					;
				} catch (Exception e) {
					System.out.println("saida errada " + e.getMessage());
				}
				;
			}
		});

		add(jLabel5);
		jLabel5.setBounds(10, 130, 114, 23);
		add(button5);
		button5.setBounds(180, 130, 114, 23);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ClasseTeste.TestarSwitch2();
					;
				} catch (Exception e) {
					System.out.println("saida errada " + e.getMessage());
				}
				;
			}
		});

		add(jLabel6);
		jLabel6.setBounds(10, 160, 114, 23);
		add(button6);
		button6.setBounds(180, 160, 114, 23);
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ClasseTeste.TestarWhile();;
					;
				} catch (Exception e) {
					System.out.println("saida errada " + e.getMessage());
				}
				;
			}
		});

		add(jLabel7);
		jLabel7.setBounds(10, 190, 114, 23);
		add(button7);
		button7.setBounds(180, 190, 114, 23);
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ClasseTeste.TestarDoWhile();
					;
				} catch (Exception e) {
					System.out.println("saida errada " + e.getMessage());
				}
				;
			}
		});

		add(jLabel8);
		jLabel8.setBounds(10, 220, 114, 23);
		add(button8);
		button8.setBounds(180, 220, 114, 23);
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ClasseTeste.TestaFor();
					;
				} catch (Exception e) {
					System.out.println("saida errada " + e.getMessage());
				}
				;
			}
		});

		add(jLabel9);
		jLabel9.setBounds(10, 250, 114, 23);
		add(button9);
		button9.setBounds(180, 250, 114, 23);
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ClasseTeste.TestarForEach();
					;
				} catch (Exception e) {
					System.out.println("saida errada " + e.getMessage());
				}
				;
			}
		});

		add(jLabel10);
		jLabel10.setBounds(10, 280, 114, 23);
		add(button10);
		button10.setBounds(180, 280, 114, 23);
		button10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ClasseTeste.TestarForEach2();
					;
				} catch (Exception e) {
					System.out.println("saida errada " + e.getMessage());
				}
				;
			}
		});

		add(jLabel11);
		jLabel11.setBounds(10, 310, 114, 23);
		add(button11);
		button11.setBounds(180, 310, 114, 23);
		button11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ClasseTeste.TestaBreak();
					;
				} catch (Exception e) {
					System.out.println("saida errada " + e.getMessage());
				}
				;
			}
		});

		add(jLabel12);
		jLabel12.setBounds(10, 340, 114, 23);
		add(button12);
		button12.setBounds(180, 340, 114, 23);
		button12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ClasseTeste.TestaContinue();
					;
				} catch (Exception e) {
					System.out.println("saida errada " + e.getMessage());
				}
				;
			}
		});

		this.setSize(640, 480);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		new MenuComandos();
	}
}