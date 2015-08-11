package com.target.reflection;

import javax.swing.*;

import java.awt.Rectangle;
import java.lang.reflect.Method;

import javax.swing.border.EtchedBorder;

public class FormReflection extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JButton jButton = null;
	private JPanel jPanel = null;
	private JCheckBox jCheckBox = null;
	private JCheckBox jCheckBox1 = null;
	private JCheckBox jCheckBox2 = null;
	private JCheckBox jCheckBox3 = null;
	private JCheckBox jCheckBox4 = null;
	private JCheckBox jCheckBox5 = null;

	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setBounds(new Rectangle(178, 112, 143, 25));
			jButton.setText("Selecionar Todos");
			jButton.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					ControlSelectedByReflection(jPanel);
				}
			});
		}
		return jButton;
	}

	private JPanel getJPanel() {
		if (jPanel == null) {
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setBounds(new Rectangle(13, 22, 108, 194));
			jPanel.setBorder(BorderFactory
					.createEtchedBorder(EtchedBorder.RAISED));
			jPanel.add(getJCheckBox(), null);
			jPanel.add(getJCheckBox1(), null);
			jPanel.add(getJCheckBox2(), null);
			jPanel.add(getJCheckBox3(), null);
			jPanel.add(getJCheckBox4(), null);
			jPanel.add(getJCheckBox5(), null);
		}
		return jPanel;
	}

	private JCheckBox getJCheckBox() {
		if (jCheckBox == null) {
			jCheckBox = new JCheckBox();
			jCheckBox.setBounds(new Rectangle(12, 15, 79, 21));
			jCheckBox.setText("Check");
		}
		return jCheckBox;
	}

	private JCheckBox getJCheckBox1() {
		if (jCheckBox1 == null) {
			jCheckBox1 = new JCheckBox();
			jCheckBox1.setBounds(new Rectangle(13, 42, 61, 24));
			jCheckBox1.setText("Check");
		}
		return jCheckBox1;
	}

	private JCheckBox getJCheckBox2() {
		if (jCheckBox2 == null) {
			jCheckBox2 = new JCheckBox();
			jCheckBox2.setBounds(new Rectangle(14, 72, 61, 24));
			jCheckBox2.setText("Check");
		}
		return jCheckBox2;
	}

	private JCheckBox getJCheckBox3() {
		if (jCheckBox3 == null) {
			jCheckBox3 = new JCheckBox();
			jCheckBox3.setBounds(new Rectangle(13, 102, 61, 24));
			jCheckBox3.setText("Check");
		}
		return jCheckBox3;
	}

	private JCheckBox getJCheckBox4() {
		if (jCheckBox4 == null) {
			jCheckBox4 = new JCheckBox();
			jCheckBox4.setBounds(new Rectangle(13, 130, 61, 24));
			jCheckBox4.setText("Check");
		}
		return jCheckBox4;
	}

	private JCheckBox getJCheckBox5() {
		if (jCheckBox5 == null) {
			jCheckBox5 = new JCheckBox();
			jCheckBox5.setBounds(new Rectangle(11, 162, 61, 24));
			jCheckBox5.setText("Check");
		}
		return jCheckBox5;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				FormReflection thisClass = new FormReflection();
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}

	public FormReflection() {
		super();
		initialize();
	}

	private void initialize() {
		this.setSize(435, 258);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
	}

	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getJButton(), null);
			jContentPane.add(getJPanel(), null);
		}
		return jContentPane;
	}

	private void ControlSelectedByReflection(JPanel panel) {
		for (Object obj : panel.getComponents()) {
			Class<? extends Object> cls = obj.getClass();
			try {
				Method mtd = cls.getMethod("setSelected", new Class[] { boolean.class });
				mtd.invoke(obj, new Object[] { true });
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
