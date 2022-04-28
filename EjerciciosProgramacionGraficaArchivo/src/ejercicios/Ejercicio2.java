package ejercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio2 extends JFrame {

	private JPanel contentPane;
	private JLabel jLabelNum1;
	private JLabel jLabelNum2;
	private JTextField jTextFieldNum1;
	private JTextField jTextFieldNum2;
	private JButton btnSuma;
	private JButton btnResta;
	private JButton btnMultiplicacin;
	private JButton btnDivision;
	private JLabel jLabelResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 frame = new Ejercicio2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void operacionSuma (ActionEvent e) {
		
		int num1 = Integer.parseInt(jTextFieldNum1.getText());
		int num2 = Integer.parseInt(jTextFieldNum2.getText());
		
		int resultado = num1 + num2;
		
		jLabelResultado.setText(String.valueOf("El resultado de la suma entre " + num1+ " y " + num2 + " es " + resultado));
		
	}
	
	private void operacionResta (ActionEvent e) {
		
		int num1 = Integer.parseInt(jTextFieldNum1.getText());
		int num2 = Integer.parseInt(jTextFieldNum2.getText());
		
		int resultado = num1 - num2;
				
		jLabelResultado.setText(String.valueOf("El resultado de la resta entre " + num1+ " y " + num2 + " es " + resultado));
	}
	
	private void operacionMultiplicacion (ActionEvent e) {
		
		int num1 = Integer.parseInt(jTextFieldNum1.getText());
		int num2 = Integer.parseInt(jTextFieldNum2.getText());
		
		int resultado = num1 * num2;
		
		jLabelResultado.setText(String.valueOf("El resultado de la multiplicación entre " + num1+ " y " + num2 + " es " + resultado));
	}
	
	private void operacionDivision (ActionEvent e) {
		
		int num1 = Integer.parseInt(jTextFieldNum1.getText());
		int num2 = Integer.parseInt(jTextFieldNum2.getText());
		
		int resultado = num1/num2;
		
		jLabelResultado.setText(String.valueOf("El resultado de la división entre " + num1+ " y " + num2 + " es " + resultado));
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		jLabelNum1 = new JLabel("Introduce el número 1");
		jLabelNum1.setBounds(12, 7, 155, 15);
		panel.add(jLabelNum1);
		
		jTextFieldNum1 = new JTextField();
		jTextFieldNum1.setBounds(178, 5, 36, 19);
		panel.add(jTextFieldNum1);
		jTextFieldNum1.setColumns(10);
		
		jLabelNum2 = new JLabel("Introduce el número 2");
		jLabelNum2.setBounds(264, 7, 155, 15);
		panel.add(jLabelNum2);
		
		jTextFieldNum2 = new JTextField();
		jTextFieldNum2.setBounds(437, 5, 36, 19);
		panel.add(jTextFieldNum2);
		jTextFieldNum2.setColumns(10);
		
		btnSuma = new JButton("suma");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacionSuma(e);
			}
		});
		btnSuma.setBounds(12, 46, 92, 25);
		panel.add(btnSuma);
		
		btnResta = new JButton("resta");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacionResta(e);
			}
		});
		btnResta.setBounds(132, 46, 82, 25);
		panel.add(btnResta);
		
		btnMultiplicacin = new JButton("multiplicación");
		btnMultiplicacin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacionMultiplicacion(e);
			}
		});
		btnMultiplicacin.setBounds(242, 46, 138, 25);
		panel.add(btnMultiplicacin);
		
		btnDivision = new JButton("division");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacionDivision(e);
			}
		});
		btnDivision.setBounds(392, 46, 117, 25);
		panel.add(btnDivision);
		
		jLabelResultado = new JLabel("");
		jLabelResultado.setBounds(12, 109, 497, 32);
		panel.add(jLabelResultado);
	}

}
